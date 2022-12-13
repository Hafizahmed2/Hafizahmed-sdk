

package com.liblab.theonesdk.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.liblab.theonesdk.LOTRClient;
import com.liblab.theonesdk.exceptions.ApiException;
import com.liblab.theonesdk.model.BookResponse;
import com.liblab.theonesdk.model.ChapterResponse;
import io.apimatic.core.utilities.TestHelper;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BookServiceTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static LOTRClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static BookService controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getBookService();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Get All books should return all three books.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testAllBooks() throws Exception {

        // Set callback and perform API call
        BookResponse result = null;
        try {
            result = controller.allBooks();
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
                "{\"docs\":[{\"_id\":\"5cf5805fb53e011a64671582\",\"name\":\"The Fellowship Of The "
                + "Ring\"},{\"_id\":\"5cf58077b53e011a64671583\",\"name\":\"The Two Towers\"},{\"_i"
                + "d\":\"5cf58080b53e011a64671584\",\"name\":\"The Return Of The King\"}],\"total"
                + "\":3,\"limit\":1000,\"offset\":0,\"page\":1,\"pages\":1}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Fetching Chapters by book id should return all chapters for that book.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testChaptersByBookId() throws Exception {
        // Parameters for the API call
        String id = 
                "5cf5805fb53e011a64671582";

        // Set callback and perform API call
        ChapterResponse result = null;
        try {
            result = controller.chaptersByBookId(id);
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
                "{\n    \"docs\": [\n        {\n            \"_id\": \"6091b6d6d58360f988133b8b\","
                + "\n            \"chapterName\": \"A Long-expected Party\"\n        },\n        {"
                + "\n            \"_id\": \"6091b6d6d58360f988133b8c\",\n            \"chapterName"
                + "\": \"The Shadow of the Past\"\n        },\n        {\n            \"_id\": \"60"
                + "91b6d6d58360f988133b8d\",\n            \"chapterName\": \"Three is Company\"\n  "
                + "      },\n        {\n            \"_id\": \"6091b6d6d58360f988133b8e\",\n       "
                + "     \"chapterName\": \"A Short Cut to Mushrooms\"\n        },\n        {\n     "
                + "       \"_id\": \"6091b6d6d58360f988133b8f\",\n            \"chapterName\": \"A "
                + "Conspiracy Unmasked\"\n        },\n        {\n            \"_id\": \"6091b6d6d58"
                + "360f988133b90\",\n            \"chapterName\": \"The Old Forest\"\n        },\n "
                + "       {\n            \"_id\": \"6091b6d6d58360f988133b91\",\n            \"chap"
                + "terName\": \"In the House of Tom Bombadil\"\n        },\n        {\n            "
                + "\"_id\": \"6091b6d6d58360f988133b92\",\n            \"chapterName\": \"Fog on th"
                + "e Barrow-Downs\"\n        },\n        {\n            \"_id\": \"6091b6d6d58360f9"
                + "88133b93\",\n            \"chapterName\": \"At the Sign of The Prancing Pony\"\n"
                + "        },\n        {\n            \"_id\": \"6091b6d6d58360f988133b94\",\n     "
                + "       \"chapterName\": \"Strider\"\n        },\n        {\n            \"_id\":"
                + " \"6091b6d6d58360f988133b95\",\n            \"chapterName\": \"A Knife in the Da"
                + "rk\"\n        },\n        {\n            \"_id\": \"6091b6d6d58360f988133b96\","
                + "\n            \"chapterName\": \"Flight to the Ford\"\n        },\n        {\n  "
                + "          \"_id\": \"6091b6d6d58360f988133b97\",\n            \"chapterName\": "
                + "\"Many Meetings\"\n        },\n        {\n            \"_id\": \"6091b6d6d58360f"
                + "988133b98\",\n            \"chapterName\": \"The Council of Elrond\"\n        },"
                + "\n        {\n            \"_id\": \"6091b6d6d58360f988133b99\",\n            \"c"
                + "hapterName\": \"The Ring Goes South\"\n        },\n        {\n            \"_id"
                + "\": \"6091b6d6d58360f988133b9a\",\n            \"chapterName\": \"A Journey in t"
                + "he Dark\"\n        },\n        {\n            \"_id\": \"6091b6d6d58360f988133b9"
                + "b\",\n            \"chapterName\": \"The Bridge of Khazad-dûm\"\n        },\n  "
                + "      {\n            \"_id\": \"6091b6d6d58360f988133b9c\",\n            \"chapt"
                + "erName\": \"Lothlórien\"\n        },\n        {\n            \"_id\": \"6091b6d"
                + "6d58360f988133b9d\",\n            \"chapterName\": \"The Mirror of Galadriel\"\n"
                + "        },\n        {\n            \"_id\": \"6091b6d6d58360f988133b9e\",\n     "
                + "       \"chapterName\": \"Farewell to Lórien\"\n        },\n        {\n        "
                + "    \"_id\": \"6091b6d6d58360f988133b9f\",\n            \"chapterName\": \"The G"
                + "reat River\"\n        },\n        {\n            \"_id\": \"6091b6d6d58360f98813"
                + "3ba0\",\n            \"chapterName\": \"The Breaking of the Fellowship\"\n      "
                + "  }\n    ],\n    \"total\": 22,\n    \"limit\": 1000,\n    \"offset\": 0,\n    "
                + "\"page\": 1,\n    \"pages\": 1\n}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

}
