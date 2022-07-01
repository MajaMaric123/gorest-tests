package tests;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import pages.GoRestUpdatePage;

import static io.restassured.RestAssured.given;

public class GoRestPatchTest extends TestBase {

    /**
     * Update username, email and status
     */
    @Test
    public void updateUserDetailsTest() {
        GoRestUpdatePage updateUser = new GoRestUpdatePage();
        updateUser.setName("Bred Smith");
        updateUser.setEmail("bredsmith123@gmail.com");
        updateUser.setStatus("active");

        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer 6f87bac2fb8d7207cadd23ec4032fd6ca408cec9b76204664142ba58d01798c4")
                .pathParams("id", 7195)
                .body(updateUser)
                .when()
                .patch("/{id}");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}