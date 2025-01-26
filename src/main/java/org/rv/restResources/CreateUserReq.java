package org.rv.restResources;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.rv.ProjectUtils.propertiesUtils.ConfigLoader;
import org.rv.ProjectUtils.propertiesUtils.ResourcePathLoader;

import java.util.Properties;

import static io.restassured.RestAssured.given;

public class CreateUserReq {
    static ResourcePathLoader resource = new ResourcePathLoader();
    static Properties config = new ConfigLoader().loadConfig();

    public static Response createUser(String body, int expectedStatusCode) {
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

    public static Response getUsers(int expectedStatusCode) {
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

    public static Response getUser(int id, int expectedStatusCode) {
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
