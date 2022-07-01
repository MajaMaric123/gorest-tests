package tests;

public class GorestPatchTest extends TestBase {

    @Test
    public void updateServicesWithPatch() {
        UpdatePojo updatePojo = new UpdatePojo();
        updatePojo.setName("Asani Joi");
        updatePojo.setEmail("asani.joi354@15ce.com");
        updatePojo.setStatus("active");


        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer 65cbc4c43040ae97eb012d87fb6bb928809feb842bfeba5ea49b2969ea92ede6")
                .pathParams("id",14618)
                .body(updatePojo)
                .when()
                .patch("/{id}");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}