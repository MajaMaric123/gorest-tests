package tests;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class TestBase {

    /**
     * Create baseUrl and basePath in before class so that can be used automatically in each test
     */
    @BeforeClass
    public static void setUp() {
        RestAssured.baseURI = "https://gorest.co.in/public/v2";
        RestAssured.basePath = "/users";
    }
}
