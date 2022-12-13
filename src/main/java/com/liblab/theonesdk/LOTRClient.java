package com.liblab.theonesdk;

import com.liblab.theonesdk.http.client.ReadonlyHttpClientConfiguration;
import com.liblab.theonesdk.controllers.BookService;
import com.liblab.theonesdk.controllers.ChapterService;
import com.liblab.theonesdk.controllers.CharacterService;
import com.liblab.theonesdk.controllers.MovieService;
import com.liblab.theonesdk.controllers.QuoteService;
import com.liblab.theonesdk.http.client.HttpCallback;
import com.liblab.theonesdk.http.client.HttpClientConfiguration;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.authentication.Authentication;
import io.apimatic.coreinterfaces.compatibility.CompatibilityFactory;
import io.apimatic.coreinterfaces.http.HttpClient;
import io.apimatic.okhttpclient.adapter.OkClient;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.function.Consumer;


/**
 * Gateway class for the library.
 * This class acts as a factory for Controllers.
 * It holds the state of the SDK.
 */
public final class LOTRClient implements Configuration {

    /**
     * Private store for controllers.
     */
    private BookService bookService;
    private MovieService movieService;
    private CharacterService characterService;
    private QuoteService quoteService;
    private ChapterService chapterService;

    private static final CompatibilityFactory compatibilityFactory = new CompatibilityFactoryImpl();

    /**
     * Current API environment.
     */
    private final Environment environment;

    /**
     * The HTTP Client instance to use for making HTTP requests.
     */
    private final HttpClient httpClient;

    /**
     * Http Client Configuration instance.
     */
    private final ReadonlyHttpClientConfiguration httpClientConfig;

    /**
     * BearerAuthManager.
     */
    private BearerAuthManager bearerAuthManager;

    /**
     * Map of authentication Managers.
     */
    private Map<String, Authentication> authentications;


    /**
     * Callback to be called before and after the HTTP call for an endpoint is made.
     */
    private final HttpCallback httpCallback;

    private LOTRClient(Environment environment, HttpClient httpClient,
            ReadonlyHttpClientConfiguration httpClientConfig, String accessToken,
            Map<String, Authentication> authentications, HttpCallback httpCallback) {
        this.environment = environment;
        this.httpClient = httpClient;
        this.httpClientConfig = httpClientConfig;
        this.httpCallback = httpCallback;
        this.authentications = 
                (authentications == null) ? new HashMap<>() : new HashMap<>(authentications);
        if (this.authentications.containsKey("global")) {
            this.bearerAuthManager = (BearerAuthManager) this.authentications.get("global");
        }

        if (!this.authentications.containsKey("global")
                || !getBearerAuthCredentials().equals(accessToken)) {
            this.bearerAuthManager = new BearerAuthManager(accessToken);
            this.authentications.put("global", bearerAuthManager);
        }

        GlobalConfiguration globalConfig = new GlobalConfiguration.Builder()
                .authentication(this.authentications).compatibilityFactory(compatibilityFactory)
                .httpClient(httpClient).baseUri(server -> getBaseUri(server))
                .callback(httpCallback)
                .build();
        bookService = new BookService(globalConfig);
        movieService = new MovieService(globalConfig);
        characterService = new CharacterService(globalConfig);
        quoteService = new QuoteService(globalConfig);
        chapterService = new ChapterService(globalConfig);
    }

    /**
     * Shutdown the underlying HttpClient instance.
     */
    public static void shutdown() {
        OkClient.shutdown();
    }

    /**
     * Get the instance of Book.
     * @return book
     */
    public BookService getBookService() {
        return bookService;
    }

    /**
     * Get the instance of Movie.
     * @return movie
     */
    public MovieService getMovieService() {
        return movieService;
    }

    /**
     * Get the instance of MCharacter.
     * @return mCharacter
     */
    public CharacterService getCharacterService() {
        return characterService;
    }

    /**
     * Get the instance of Quote.
     * @return quote
     */
    public QuoteService getQuoteService() {
        return quoteService;
    }

    /**
     * Get the instance of Chapter.
     * @return chapter
     */
    public ChapterService getChapter() {
        return chapterService;
    }

    /**
     * Current API environment.
     * @return environment
     */
    public Environment getEnvironment() {
        return environment;
    }

    /**
     * The HTTP Client instance to use for making HTTP requests.
     * @return httpClient
     */
    private HttpClient getHttpClient() {
        return httpClient;
    }

    /**
     * Http Client Configuration instance.
     * @return httpClientConfig
     */
    public ReadonlyHttpClientConfiguration getHttpClientConfig() {
        return httpClientConfig;
    }

    /**
     * The credentials to use with BearerAuth.
     * @return bearerAuthCredentials
     */
    private BearerAuthCredentials getBearerAuthCredentials() {
        return bearerAuthManager;
    }

    /**
     * OAuth 2.0 Access Token.
     * @return accessToken
     */
    public String getAccessToken() {
        return getBearerAuthCredentials().getAccessToken();
    }
    /**
     * The timeout to use for making HTTP requests.
     * @deprecated This method will be removed in a future version. Use
     *             {@link #getHttpClientConfig()} instead.
     *
     * @return timeout
     */
    @Deprecated
    public long timeout() {
        return httpClientConfig.getTimeout();
    }

    /**
     * Get base URI by current environment.
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(Server server) {
        return environmentMapper(environment, server);
    }

    /**
     * Get base URI by current environment.
     * @return Processed base URI
     */
    public String getBaseUri() {
        return getBaseUri(Server.ENUM_DEFAULT);
    }


    /**
     * Get base URI by current environment.
     * 
     * @param server string for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(String server) {
        return getBaseUri(Server.fromString(server));
    }


    /**
     * Base URLs by environment and server aliases.
     * @param environment Environment for which to get the base URI
     * @param server Server for which to get the base URI
     * @return base URL
     */
    private static String environmentMapper(Environment environment, Server server) {
        return "https://the-one-api.dev/v2";
    }

    /**
     * Configuration variables loaded from Properties.
     * @param configProperties Properties
     * @return LOTRClient instance.
     */
    public static LOTRClient loadFromProperties(Properties configProperties) {
        return new LOTRClient.Builder(configProperties).build();
    }

    /**
     * Converts this LOTRClient into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "LOTRClient [" + "environment=" + environment + ", httpClientConfig="
                + httpClientConfig + ", authentications=" + authentications + "]";
    }

    /**
     * Builds a new {@link LOTRClient.Builder} object.
     * Creates the instance with the state of the current client.
     * @return a new {@link LOTRClient.Builder} object
     */
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.environment = getEnvironment();
        builder.httpClient = getHttpClient();
        builder.accessToken = getBearerAuthCredentials().getAccessToken();
        builder.authentications = authentications;
        builder.httpCallback = httpCallback;
        builder.httpClientConfig(configBldr -> configBldr =
                ((HttpClientConfiguration) httpClientConfig).newBuilder());
        return builder;
    }

    /**
     * Class to build instances of {@link LOTRClient}.
     */
    public static class Builder {

        private Environment environment = Environment.PRODUCTION;
        private HttpClient httpClient;
        private String accessToken = "oAU85jdMShqN-hq4Ng3Z";
        private Map<String, Authentication> authentications = null;
        private HttpCallback httpCallback = null;
        private HttpClientConfiguration.Builder httpClientConfigBuilder =
                new HttpClientConfiguration.Builder();


        public Builder() {}

        public Builder(Properties configProperties) {
           this.environment = Environment.fromString(configProperties.getProperty("environment", Environment.PRODUCTION.toString()));
        }

        /**
         * Credentials setter for BearerAuth.
         * @param accessToken String value for accessToken.
         * @return Builder
         */
        public Builder accessToken(String accessToken) {
            if (accessToken == null) {
                throw new NullPointerException("AccessToken cannot be null.");
            }
            this.accessToken = accessToken;
            return this;
        }

        /**
         * Current API environment.
         * @param environment The environment for client.
         * @return Builder
         */
        public Builder environment(Environment environment) {
            this.environment = environment;
            return this;
        }

        /**
         * The timeout to use for making HTTP requests.
         * @deprecated This method will be removed in a future version. Use
         *             {@link #httpClientConfig(Consumer) httpClientConfig} instead.
         * @param timeout must be greater then 0.
         * @return Builder
         */
        @Deprecated
        public Builder timeout(long timeout) {
            this.httpClientConfigBuilder.timeout(timeout);
            return this;
        }

        /**
         * HttpCallback.
         * @param httpCallback Callback to be called before and after the HTTP call.
         * @return Builder
         */
        public Builder httpCallback(HttpCallback httpCallback) {
            this.httpCallback = httpCallback;
            return this;
        }

        /**
         * Setter for the Builder of httpClientConfiguration, takes in an operation to be performed
         * on the builder instance of HTTP client configuration.
         * 
         * @param action Consumer for the builder of httpClientConfiguration.
         * @return Builder
         */
        public Builder httpClientConfig(Consumer<HttpClientConfiguration.Builder> action) {
            action.accept(httpClientConfigBuilder);
            return this;
        }

        /**
         * Builds a new LOTRClient object using the set fields.
         * @return LOTRClient
         */
        public LOTRClient build() {
            HttpClientConfiguration httpClientConfig = httpClientConfigBuilder.build();
            httpClient = new OkClient(httpClientConfig.getConfiguration(), compatibilityFactory);

            return new LOTRClient(environment, httpClient, httpClientConfig, accessToken,
                    authentications, httpCallback);
        }
    }
}