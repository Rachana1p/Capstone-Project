package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;

import org.testng.Assert;

	public class RetrieveProductsSteps {

	    private Response response;
	    @Given("I have API endpoint to retrieve all products")
	    public void setGetAllProductsEndpoint() {
	        RestAssured.baseURI = "http://localhost:9010";
	        // Set other necessary configurations
	    }

	    @When("I make a GET request to the product endpoint")
	    public void getAllProductsRequest() {
	        response = RestAssured.given().when().get("/get-shoes");
	    }

	    @Then("I should receive a valid response with status code")
	    public void validateStatusCode() {
	    	// Validate status code
	        int statusCode = response.getStatusCode();
	        Assert.assertEquals(statusCode, 200, "Expected status code 200");

	        // Validate response body content (example assertion for presence of a key in the response)
	        String responseBody = response.getBody().asString();
	        Assert.assertTrue(responseBody.contains("shoes"), "Response should contain shoe information");

	        // Log the response
	        response.then().log().all();
	    }

	    
	}

