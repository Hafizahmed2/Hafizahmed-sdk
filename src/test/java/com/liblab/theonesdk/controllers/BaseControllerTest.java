

package com.liblab.theonesdk.controllers;

import com.liblab.theonesdk.Environment;
import com.liblab.theonesdk.LOTRClient;
import com.liblab.theonesdk.testing.HttpCallbackCatcher;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.Timeout;

/**
 * Base class for all test cases.
 */
public class BaseControllerTest {
    /**
     * Test configuration.
     */
    public static final int REQUEST_TIMEOUT = 30;

    public static final double ASSERT_PRECISION = 0.01;
    
    /**
     * Global rules for tests.
     */
    @Rule
    public Timeout globalTimeout = Timeout.seconds(REQUEST_TIMEOUT);
    
    /**
     * Test fixtures,
     * Used to serve as HttpCallback and to capture request & response.
     */

    protected static HttpCallbackCatcher httpResponse;
    
    /**
     * Setup test.
     */
    @BeforeClass
    public static void setUp() throws Exception {
        httpResponse = new HttpCallbackCatcher(); 
    }

    /**
     * Tear down test.
     */
    @AfterClass
    public static void tearDown() throws Exception {
        httpResponse = null;
    }

    /**
     * Create test configuration from Environment variables.
     */
    protected static LOTRClient createConfigurationFromEnvironment() {
        LOTRClient.Builder builder = new LOTRClient.Builder();

        final String environment = System.getenv("LOTR_LIB_ENVIRONMENT");
        final String timeout = System.getenv("LOTR_LIB_TIMEOUT");
        final String accessToken = System.getenv("LOTR_LIB_ACCESS_TOKEN");

        if (accessToken != null) {
            builder.accessToken(accessToken);
        }
        if (environment != null) {
            builder.environment(Environment.fromString(environment));
        }
        if (timeout != null) {
            builder.httpClientConfig(configBuilder -> configBuilder.timeout(
                    Long.parseLong(timeout)));
        }
        return builder.build();
    }

    
    /**
     * Create test configuration.
     */
    protected static LOTRClient createConfiguration() {
        // Set Configuration parameters for test execution
        LOTRClient config = createConfigurationFromEnvironment();
        config = config.newBuilder()
                .httpCallback(httpResponse)
                .build();
        return config;
    }
}
