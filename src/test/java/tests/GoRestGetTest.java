package tests;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GoRestGetTest extends TestBase {

    /**
     * Get details for every user
     */
    @Test
    public void getAllUsersInfo() {
        Response response = given()
                .when()
                .get();
        response.prettyPrint();
        response.then().statusCode(200);
    }

    /**
     * Get details for single user
     */
    @Test
    public void getSingleUsersInfo() {
        Response response = given()
                .pathParam("id", 7195)
                .when()
                .get("/{id}");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}
