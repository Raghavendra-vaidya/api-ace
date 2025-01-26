package org.rv.restResources.users;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.rv.restResources.RequestBase;

import static io.restassured.RestAssured.given;

public class GetUserReq extends RequestBase {

    public Response getUser(int id, int expectedStatusCode) {
        RestAssured.baseURI = config.getProperty("BASE_URI");
        Response response =
                given()
                        .header("Content-type", "application/json")
                        .pathParam("userID", id)
                        .when()
                        .get(resource.users + "/{userID}")
                        .then()
                        .assertThat().statusCode(expectedStatusCode)
                        .extract().response();
        return response;
    }
}
