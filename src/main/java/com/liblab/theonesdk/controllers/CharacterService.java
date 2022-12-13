

package com.liblab.theonesdk.controllers;

import com.liblab.theonesdk.LOTRSdk;
import com.liblab.theonesdk.Server;
import com.liblab.theonesdk.exceptions.ApiException;
import com.liblab.theonesdk.http.request.HttpMethod;
import com.liblab.theonesdk.model.CharacterResponse;
import com.liblab.theonesdk.model.QuoteResponse;
import io.apimatic.core.ApiCall;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class CharacterService extends BaseService {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public CharacterService(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Request all movie quotes for one specific character.
     * @param  id  Required parameter: Id of the character
     * @return    Returns the QuoteResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public QuoteResponse quotesByCharacterId(
            final String id) throws ApiException, IOException {
        return prepareQuotesByCharacterIdRequest(id).execute();
    }

    /**
     * Request all movie quotes for one specific character.
     * @param  id  Required parameter: Id of the character
     * @return    Returns the QuoteResponse response from the API call
     */
    public CompletableFuture<QuoteResponse> quotesByCharacterIdAsync(
            final String id) {
        try { 
            return prepareQuotesByCharacterIdRequest(id).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for quotesByCharacterId.
     */
    private ApiCall<QuoteResponse, ApiException> prepareQuotesByCharacterIdRequest(
            final String id) throws IOException {
        return new ApiCall.Builder<QuoteResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/character/" + id + "/quote")
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
     * Returns List of all "The Lord of the Rings" characters.
     * @return    Returns the CharacterResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CharacterResponse allCharacters() throws ApiException, IOException {
        return prepareAllCharactersRequest().execute();
    }

    /**
     * Returns List of all "The Lord of the Rings" characters.
     * @return    Returns the CharacterResponse response from the API call
     */
    public CompletableFuture<CharacterResponse> allCharactersAsync() {
        try { 
            return prepareAllCharactersRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for allCharacters.
     */
    private ApiCall<CharacterResponse, ApiException> prepareAllCharactersRequest() throws IOException {
        return new ApiCall.Builder<CharacterResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/character")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseService.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> LOTRSdk.deserialize(response, CharacterResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Request one specific character.
     * @param  id  Required parameter: Id of the character
     * @return    Returns the CharacterResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CharacterResponse characterById(
            final String id) throws ApiException, IOException {
        return prepareCharacterByIdRequest(id).execute();
    }

    /**
     * Request one specific character.
     * @param  id  Required parameter: Id of the character
     * @return    Returns the CharacterResponse response from the API call
     */
    public CompletableFuture<CharacterResponse> characterByIdAsync(
            final String id) {
        try { 
            return prepareCharacterByIdRequest(id).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for characterById.
     */
    private ApiCall<CharacterResponse, ApiException> prepareCharacterByIdRequest(
            final String id) throws IOException {
        return new ApiCall.Builder<CharacterResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/character/" + id)
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseService.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> LOTRSdk.deserialize(response, CharacterResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}