package tests;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import pages.GoRestPostPage;

import static io.restassured.RestAssured.given;

public class GoRestPostTest extends TestBase {

    /**
     * Create a new user test
     */
    @Test
    public void createANewUserTest() {
        GoRestPostPage postUser = new GoRestPostPage();
        postUser.setName("Mark Tew");
        postUser.setGender("Male");
        postUser.setEmail("mark@gmail.com");
        postUser.setStatus("active");

        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer 6f87bac2fb8d7207cadd23ec4032fd6ca408cec9b76204664142ba58d01798c4")
                .body(postUser)
                .when()
                .post();
        response.prettyPrint();
        response.then().statusCode(201);
    }
}
