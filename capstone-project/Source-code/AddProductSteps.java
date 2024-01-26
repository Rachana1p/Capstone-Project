package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;

public class AddProductSteps {

	  //  private Response RestAssured;

	    @Given("I have API endpoint to add a product")
	    public void setAddProductEndpoint() {
	    	RestAssured.given()
             .baseUri("http://localhost:9010")
             .basePath("/add-shoe");
	        // Set other necessary configurations
	    }

	    @When("I make a POST request to add a product")
	    public void addProductRequest() {
	    	RestAssured.given()
            .queryParam("id", "1020")
            .queryParam("image", "www.image.com")
            .queryParam("name", "Nike")
            .queryParam("category", "Running")
            .queryParam("sizes", "10,9,8")
            .queryParam("price", "2000")
            .when()
            .post();
	    }

	    @Then("I should receive valid response with status code")
	    public void validateAddProductStatusCode() {
	     RestAssured.given().log().all()
	     .then().statusCode(201).body("message", equalTo("Nike Added Successfully."));
	    }
	}