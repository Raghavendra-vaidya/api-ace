package org.rv.restResources.users;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.rv.restResources.RequestBase;

import static io.restassured.RestAssured.given;

public class CreateUserReq extends RequestBase {
    public Response createUser(String body, int expectedStatusCode) {
        RestAssured.baseURI = config.getProperty("BASE_URI");
        Response response =
                given()
                        .header("Content-type", "application/json")
                        .body(body)
                        .when()
                        .post(resource.users)
                        .then()
                        .assertThat().statusCode(expectedStatusCode)
                        .extract().response();
        return response;
    }

}
