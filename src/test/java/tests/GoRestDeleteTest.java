package tests;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GoRestDeleteTest extends BaseTest {
    @Test
    public void deleteAllGoRestInfo() {
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer 6f87bac2fb8d7207cadd23ec4032fd6ca408cec9b76204664142ba58d01798c4")
                .pathParams("id",6966)
                .when()
                .delete("/{id}");
        response.prettyPrint();
        response.then().statusCode(204);
    }
}

