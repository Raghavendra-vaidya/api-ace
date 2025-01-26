package org.rv.restResources.users;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.rv.restResources.RequestBase;

import static io.restassured.RestAssured.given;

public class GetUsersReq extends RequestBase {
    public Response getUsers(int expectedStatusCode) {
        RestAssured.baseURI = config.getProperty("BASE_URI");
        Response response =
                given()
                        .header("Content-type", "application/json")
                        .when()
                        .get(resource.users)
                        .then()
                        .assertThat().statusCode(expectedStatusCode)
                        .extract().response();
        return response;
    }
}
