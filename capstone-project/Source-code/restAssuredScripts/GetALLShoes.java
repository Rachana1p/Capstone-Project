package com.sportyshoe.restAssuredScripts;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GetALLShoes {

    @Test
    public void get_all_shoes() {
        Response response = RestAssured.given()
                .baseUri("http://localhost:9010")
                .basePath("/get-shoes")
                .when()
                .get();

        // Validate status code
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200, "Expected status code 200");

        // Validate response body content (example assertion for presence of a key in the response)
        String responseBody = response.getBody().asString();
        Assert.assertTrue(responseBody.contains("shoes"), "Response should contain shoe information");

        // Log the response
        response.then().log().all();
    }

    @Test
    public void get_all_user() {
        Response response = RestAssured.given()
                .baseUri("http://localhost:9010")
                .basePath("/get-users")
                .when()
                .get();

        // Validate status code
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200, "Expected status code 200");

        // Validate response body content or structure as needed
        String responseBody = response.getBody().asString();
        Assert.assertTrue(responseBody.contains("users"), "Response should contain user information");

        // Log the response
        response.then().log().all();
    }
}


//import io.restassured.RestAssured;

/*public class GetALLShoes {
	@Test
	public void get_all_shoes() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/get-shoes")
		.when()
		.get()
		.then()
		.statusCode(200)
		.log().all();
	}
	
	@Test
	public void get_all_user() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/get-users")
		.when()
		.get()
		.then()
		.statusCode(200)
		.log().all();
	}

}*/
