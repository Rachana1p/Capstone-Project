package com.sportyshoe.restAssuredScripts;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;

public class PostPutshoes {
	
    @Test(priority='1')
    public void postAProduct() {
        RestAssured.given()
                .baseUri("http://localhost:9010")
                .basePath("/add-shoe")
                .queryParam("id", "1020")
                .queryParam("image", "www.image.com")
                .queryParam("name", "Nike")
                .queryParam("category", "Running")
                .queryParam("sizes", "10,9,8")
                .queryParam("price", "2000")
                .when()
                .post()
                .then()
                .log().all()
                .statusCode(200) // Check status code
                .body("message", equalTo("Nike Added Successfully.")) ;// Check a specific message in the response body
               // .body("id", equalTo(1020)); // Check if the ID matches the expected value
    }
 @Test(priority='2')
    public void putAProduct() {
        RestAssured.given()
                .baseUri("http://localhost:9010")
                .basePath("/update-shoe")
                .queryParam("id", "1020")
                .queryParam("image", "www.image.com")
                .queryParam("name", "Rebook")
                .queryParam("category", "Running")
                .queryParam("sizes", "10,9,8")
                .queryParam("price", "2000")
                .when()
                .put()
                .then()
                .log().all()
                .statusCode(200) // Check status code
                .body("message", equalTo("Rebook Updated Successfully.")) ;// Check a specific message in the response body
               // .body("name", equalTo("Rebook")); // Check if the name is updated as expected
    }
	   @Test(priority='3')
    public void deleteAProduct() {
        RestAssured.given()
                .baseUri("http://localhost:9010")
                .basePath("/delete-shoe")
                .queryParam("id", "1020")
                .when()
                .delete()
                .then()
                .log().all()
                .statusCode(200) // Check status code
                .body("message", equalTo("Shoe with ID 1020 Deleted Successfully.")); // Check a specific message in the response body
    }

}


