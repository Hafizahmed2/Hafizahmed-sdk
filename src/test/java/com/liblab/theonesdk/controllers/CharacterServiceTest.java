

package com.liblab.theonesdk.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.liblab.theonesdk.LOTRClient;
import com.liblab.theonesdk.exceptions.ApiException;
import com.liblab.theonesdk.model.CharacterResponse;
import com.liblab.theonesdk.model.QuoteResponse;
import io.apimatic.core.utilities.TestHelper;
import org.codehaus.plexus.util.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;

public class CharacterServiceTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static LOTRClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static CharacterService controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getCharacterService();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Fetching quotes by a character id that had no quotes should return empty result.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testQuotesByCharacterIdNoQuotes() throws Exception {
        // Parameters for the API call
        String id = 
                "5cd99d4bde30eff6ebccfbf1";

        // Set callback and perform API call
        QuoteResponse result = null;
        try {
            result = controller.quotesByCharacterId(id);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\n    \"docs\": [],\n    \"total\": 0,\n    \"limit\": 1000,\n    \"offset\": 0,"
                + "\n    \"page\": 1,\n    \"pages\": 1\n}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Fetching quotes by a character id should return all quotes by that particular character only.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testQuotesByCharacterId() throws Exception {
        // Parameters for the API call
        String id = 
                "5cd99d4bde30eff6ebccfea5";

        // Set callback and perform API call
        QuoteResponse result = null;
        try {
            result = controller.quotesByCharacterId(id);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\n    \"docs\": [\n        {\n            \"_id\": \"5cd96e05de30eff6ebccec0c\","
                + "\n            \"dialog\": \"Aragorn! Elessar!\",\n            \"movie\": \"5cd95"
                + "395de30eff6ebccde5d\",\n            \"character\": \"5cd99d4bde30eff6ebccfea5\","
                + "\n            \"id\": \"5cd96e05de30eff6ebccec0c\"\n        },\n        {\n     "
                + "       \"_id\": \"5cd96e05de30eff6ebccedf3\",\n            \"dialog\": \"Build m"
                + "e an army worthy of Mordor.\",\n            \"movie\": \"5cd95395de30eff6ebccde5"
                + "c\",\n            \"character\": \"5cd99d4bde30eff6ebccfea5\",\n            \"id"
                + "\": \"5cd96e05de30eff6ebccedf3\"\n        },\n        {\n            \"_id\": "
                + "\"5cd96e05de30eff6ebccf0da\",\n            \"dialog\": \"You cannot hide! I see "
                + "you!There is no life in the void, Only death!\",\n            \"movie\": \"5cd95"
                + "395de30eff6ebccde5c\",\n            \"character\": \"5cd99d4bde30eff6ebccfea5\","
                + "\n            \"id\": \"5cd96e05de30eff6ebccf0da\"\n        },\n        {\n     "
                + "       \"_id\": \"5cd96e05de30eff6ebccf0ed\",\n            \"dialog\": \"I see y"
                + "ou!\",\n            \"movie\": \"5cd95395de30eff6ebccde5d\",\n            \"char"
                + "acter\": \"5cd99d4bde30eff6ebccfea5\",\n            \"id\": \"5cd96e05de30eff6eb"
                + "ccf0ed\"\n        }\n    ],\n    \"total\": 4,\n    \"limit\": 1000,\n    \"offs"
                + "et\": 0,\n    \"page\": 1,\n    \"pages\": 1\n}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Fetching all characters should return a list of all the characters in the series.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testAllCharacters() throws Exception {

        // Set callback and perform API call
        CharacterResponse result = null;
        try {
            result = controller.allCharacters();
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("allCharacters.json").getFile());
        String response = FileUtils.fileRead(file);
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(response,
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Fetching a specific character by Id should return that particular character only.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testCharacterById() throws Exception {
        // Parameters for the API call
        String id = 
                "5cd99d4bde30eff6ebccfbf1";

        // Set callback and perform API call
        CharacterResponse result = null;
        try {
            result = controller.characterById(id);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\n    \"docs\": [\n        {\n            \"_id\": \"5cd99d4bde30eff6ebccfbf1\","
                + "\n            \"height\": \"\",\n            \"race\": \"Human\",\n            "
                + "\"gender\": \"Male\",\n            \"birth\": \"TA 2873\",\n            \"spouse"
                + "\": \"Gilraen\",\n            \"death\": \"TA 2933\",\n            \"realm\": "
                + "\"\",\n            \"hair\": \"Dark (film)\",\n            \"name\": \"Arathorn "
                + "II\",\n            \"wikiUrl\": \"http://lotr.wikia.com//wiki/Arathorn_II\"\n   "
                + "     }\n    ],\n    \"total\": 1,\n    \"limit\": 1000,\n    \"offset\": 0,\n   "
                + " \"page\": 1,\n    \"pages\": 1\n}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Fetching Character by an invalid or non existent id should return error.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testCharacterByIdInvalidId() throws Exception {
        // Parameters for the API call
        String id = 
                "abcd";

        // Set callback and perform API call
        CharacterResponse result = null;
        try {
            result = controller.characterById(id);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 500", 
                500, httpResponse.getResponse().getStatusCode());
    }

}
