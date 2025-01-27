package org.rv.restResources.login;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.rv.restResources.RequestBase;

import static io.restassured.RestAssured.given;

public class UserLogin extends RequestBase {

    public Response login(String body, int expectedResponseCode) {
        RestAssured.baseURI = config.getProperty("BASE_URI");
        Response response =
                given()
                        .header("Content-Type", "application/json")
                        .body(body)
                        .when()
                        .post(resource.login)
                        .then().assertThat().statusCode(expectedResponseCode)
                        .extract().response();
        return response;
    }

}
