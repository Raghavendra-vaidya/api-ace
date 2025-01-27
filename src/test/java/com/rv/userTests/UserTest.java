package com.rv.userTests;

import io.restassured.response.Response;
import org.rv.restResources.users.GetUserReq;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Map;

public class UserTest {
    GetUserReq getUser;

    @BeforeClass
    public void setup() {
        getUser = new GetUserReq();
    }

    @Test
    void verifyGetUserById() {
        Response response = getUser.getUser(2, 200);
        Map<String, ?> userData = response.jsonPath().get("data");
        Assert.assertEquals((int) userData.get("id"), 2);
    }

}
