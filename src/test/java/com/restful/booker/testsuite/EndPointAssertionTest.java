package com.restful.booker.testsuite;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class EndPointAssertionTest
{
    @Test
    public void getAllStudentInfo() {
        Response response = given()
                .when()
                .get("/booking");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}

