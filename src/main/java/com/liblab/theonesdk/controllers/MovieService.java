

package com.liblab.theonesdk.controllers;

import com.liblab.theonesdk.LOTRSdk;
import com.liblab.theonesdk.Server;
import com.liblab.theonesdk.exceptions.ApiException;
import com.liblab.theonesdk.http.request.HttpMethod;
import com.liblab.theonesdk.model.MovieResponse;
import com.liblab.theonesdk.model.QuoteResponse;
import io.apimatic.core.ApiCall;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class MovieService extends BaseService {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public MovieService(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Returns List of all "The Lord of the Rings" movies.
     * @return    Returns the MovieResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public MovieResponse allMovies() throws ApiException, IOException {
        return prepareAllMoviesRequest().execute();
    }

    /**
     * Returns List of all "The Lord of the Rings" movies.
     * @return    Returns the MovieResponse response from the API call
     */
    public CompletableFuture<MovieResponse> allMoviesAsync() {
        try { 
            return prepareAllMoviesRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for allMovies.
     */
    private ApiCall<MovieResponse, ApiException> prepareAllMoviesRequest() throws IOException {
        return new ApiCall.Builder<MovieResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/movie")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseService.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> LOTRSdk.deserialize(response, MovieResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Request one specific movie.
     * @param  id  Required parameter: Id of the movie
     * @return    Returns the MovieResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public MovieResponse movieById(
            final String id) throws ApiException, IOException {
        return prepareMovieByIdRequest(id).execute();
    }

    /**
     * Request one specific movie.
     * @param  id  Required parameter: Id of the movie
     * @return    Returns the MovieResponse response from the API call
     */
    public CompletableFuture<MovieResponse> movieByIdAsync(
            final String id) {
        try { 
            return prepareMovieByIdRequest(id).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for movieById.
     */
    private ApiCall<MovieResponse, ApiException> prepareMovieByIdRequest(
            final String id) throws IOException {
        return new ApiCall.Builder<MovieResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/movie/" + id)
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseService.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> LOTRSdk.deserialize(response, MovieResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Request all movie quotes for one specific character.
     * @param  id  Required parameter: Id of the movie
     * @return    Returns the QuoteResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public QuoteResponse quotesByMovieId(
            final String id) throws ApiException, IOException {
        return prepareQuotesByMovieIdRequest(id).execute();
    }

    /**
     * Request all movie quotes for one specific character.
     * @param  id  Required parameter: Id of the movie
     * @return    Returns the QuoteResponse response from the API call
     */
    public CompletableFuture<QuoteResponse> quotesByMovieIdAsync(
            final String id) {
        try { 
            return prepareQuotesByMovieIdRequest(id).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for quotesByMovieId.
     */
    private ApiCall<QuoteResponse, ApiException> prepareQuotesByMovieIdRequest(
            final String id) throws IOException {
        return new ApiCall.Builder<QuoteResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/movie")
                        .templateParam(param -> param.key("id").value(id)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("quote").value("quote").isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseService.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> LOTRSdk.deserialize(response, QuoteResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}