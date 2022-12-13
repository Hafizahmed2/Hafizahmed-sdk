

package com.liblab.theonesdk.controllers;

import com.liblab.theonesdk.LOTRSdk;
import com.liblab.theonesdk.Server;
import com.liblab.theonesdk.exceptions.ApiException;
import com.liblab.theonesdk.http.request.HttpMethod;
import com.liblab.theonesdk.model.QuoteResponse;
import io.apimatic.core.ApiCall;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class QuoteService extends BaseService {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public QuoteService(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Returns List of all "The Lord of the Rings" quotes.
     * @return    Returns the QuoteResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public QuoteResponse allQuotes() throws ApiException, IOException {
        return prepareAllQuotesRequest().execute();
    }

    /**
     * Returns List of all "The Lord of the Rings" quotes.
     * @return    Returns the QuoteResponse response from the API call
     */
    public CompletableFuture<QuoteResponse> allQuotesAsync() {
        try { 
            return prepareAllQuotesRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for allQuotes.
     */
    private ApiCall<QuoteResponse, ApiException> prepareAllQuotesRequest() throws IOException {
        return new ApiCall.Builder<QuoteResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/quote")
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

    /**
     * Request one specific quote.
     * @param  id  Required parameter: Id of the quote
     * @return    Returns the QuoteResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public QuoteResponse quoteById(
            final String id) throws ApiException, IOException {
        return prepareQuoteByIdRequest(id).execute();
    }

    /**
     * Request one specific quote.
     * @param  id  Required parameter: Id of the quote
     * @return    Returns the QuoteResponse response from the API call
     */
    public CompletableFuture<QuoteResponse> quoteByIdAsync(
            final String id) {
        try { 
            return prepareQuoteByIdRequest(id).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for quoteById.
     */
    private ApiCall<QuoteResponse, ApiException> prepareQuoteByIdRequest(
            final String id) throws IOException {
        return new ApiCall.Builder<QuoteResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/quote/" + id)
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