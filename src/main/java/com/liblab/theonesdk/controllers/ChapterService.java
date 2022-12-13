

package com.liblab.theonesdk.controllers;

import com.liblab.theonesdk.LOTRSdk;
import com.liblab.theonesdk.Server;
import com.liblab.theonesdk.exceptions.ApiException;
import com.liblab.theonesdk.http.request.HttpMethod;
import com.liblab.theonesdk.model.ChapterResponse;
import io.apimatic.core.ApiCall;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class ChapterService extends BaseService {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public ChapterService(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Request one specific chapter.
     * @param  id  Required parameter: Id of the chapter
     * @return    Returns the ChapterResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ChapterResponse chapterById(
            final String id) throws ApiException, IOException {
        return prepareChapterByIdRequest(id).execute();
    }

    /**
     * Request one specific chapter.
     * @param  id  Required parameter: Id of the chapter
     * @return    Returns the ChapterResponse response from the API call
     */
    public CompletableFuture<ChapterResponse> chapterByIdAsync(
            final String id) {
        try { 
            return prepareChapterByIdRequest(id).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for chapterById.
     */
    private ApiCall<ChapterResponse, ApiException> prepareChapterByIdRequest(
            final String id) throws IOException {
        return new ApiCall.Builder<ChapterResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/chapter/" + id)
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

    /**
     * Returns List of all "The Lord of the Rings" chapters.
     * @return    Returns the ChapterResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ChapterResponse allChapters() throws ApiException, IOException {
        return prepareAllChaptersRequest().execute();
    }

    /**
     * Returns List of all "The Lord of the Rings" chapters.
     * @return    Returns the ChapterResponse response from the API call
     */
    public CompletableFuture<ChapterResponse> allChaptersAsync() {
        try { 
            return prepareAllChaptersRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for allChapters.
     */
    private ApiCall<ChapterResponse, ApiException> prepareAllChaptersRequest() throws IOException {
        return new ApiCall.Builder<ChapterResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/chapter")
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