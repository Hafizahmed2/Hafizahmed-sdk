

package com.liblab.theonesdk.controllers;

import com.liblab.theonesdk.LOTRSdk;
import com.liblab.theonesdk.Server;
import com.liblab.theonesdk.exceptions.ApiException;
import com.liblab.theonesdk.http.request.HttpMethod;
import com.liblab.theonesdk.model.BookResponse;
import com.liblab.theonesdk.model.ChapterResponse;
import io.apimatic.core.ApiCall;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class BookService extends BaseService {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public BookService(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Returns List of all "The Lord of the Rings" books.
     * @return    Returns the BookResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BookResponse allBooks() throws ApiException, IOException {
        return prepareAllBooksRequest().execute();
    }

    /**
     * Returns List of all "The Lord of the Rings" books.
     * @return    Returns the BookResponse response from the API call
     */
    public CompletableFuture<BookResponse> allBooksAsync() {
        try { 
            return prepareAllBooksRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for allBooks.
     */
    private ApiCall<BookResponse, ApiException> prepareAllBooksRequest() throws IOException {
        return new ApiCall.Builder<BookResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/book")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseService.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> LOTRSdk.deserialize(response, BookResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Request one specific book.
     * @param  id  Required parameter: Id of the book
     * @return    Returns the BookResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BookResponse bookById(
            final String id) throws ApiException, IOException {
        return prepareBookByIdRequest(id).execute();
    }

    /**
     * Request one specific book.
     * @param  id  Required parameter: Id of the book
     * @return    Returns the BookResponse response from the API call
     */
    public CompletableFuture<BookResponse> bookByIdAsync(
            final String id) {
        try { 
            return prepareBookByIdRequest(id).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for bookById.
     */
    private ApiCall<BookResponse, ApiException> prepareBookByIdRequest(
            final String id) throws IOException {
        return new ApiCall.Builder<BookResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/book")
                        .templateParam(param -> param.key("id").value(id)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseService.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> LOTRSdk.deserialize(response, BookResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Request all chapters of one specific book.
     * @param  id  Required parameter: Id of the book
     * @return    Returns the ChapterResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ChapterResponse chaptersByBookId(
            final String id) throws ApiException, IOException {
        return prepareChaptersByBookIdRequest(id).execute();
    }

    /**
     * Request all chapters of one specific book.
     * @param  id  Required parameter: Id of the book
     * @return    Returns the ChapterResponse response from the API call
     */
    public CompletableFuture<ChapterResponse> chaptersByBookIdAsync(
            final String id) {
        try { 
            return prepareChaptersByBookIdRequest(id).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for chaptersByBookId.
     */
    private ApiCall<ChapterResponse, ApiException> prepareChaptersByBookIdRequest(
            final String id) throws IOException {
        return new ApiCall.Builder<ChapterResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/book/" + id + "/chapter")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseService.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> LOTRSdk.deserialize(response, ChapterResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}