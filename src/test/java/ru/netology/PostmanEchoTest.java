package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

class PostmanEchoTest {
    @Test
    void ShouldReturnSendData() {

        var text = "hello";

        given()
                .baseUri("https://postman-echo.com")
                .body("text")

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo(text));
    }
}