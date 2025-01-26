package org.rv.restResources;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.rv.ProjectUtils.propertiesUtils.ConfigLoader;
import org.rv.ProjectUtils.propertiesUtils.ResourcePathLoader;

import java.util.Properties;

import static io.restassured.RestAssured.given;

public class UserReq {
     static ResourcePathLoader resource = new ResourcePathLoader();
     static Properties config = new ConfigLoader().loadConfig();

    public static Response createUser(String body, int expectedResponseCode){
        RestAssured.baseURI = config.getProperty("BASE_URI");
        Response response =
         given()
                .header("Content-type","application/json")
                .body(body)
        .when()
                .post(resource.users)
        .then()
                .assertThat().statusCode(expectedResponseCode)
                .extract().response();
        return response;
    }
}
