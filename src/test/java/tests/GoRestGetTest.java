package tests;

public class GorestGetTest extends TestBase {

    @Test
    public void getAllGorestUsersInfo() {
        Response response = given()
                .when()
                .get("/users");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void getSingleGorestUsersInfo() {
        Response response = given()
                .pathParam("id",3821)
                .when()
                .get("/users/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }




}
