package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;

import org.testng.Assert;

public class RetrieveUsersSteps {
	    private Response response;

	    @Given("I have API endpoint to retrieve all registered users")
	    public void setGetAllUsersEndpoint() {
	        RestAssured.baseURI = "http://localhost:9010";
	        // Set other necessary configurations
	    }

	    @When("I make a GET request to retrieve all users")
	    public void getAllUsersRequest() {
	        response = RestAssured.given().when().get("/get-users");
	    }

	    @Then("I should receive a valid response with status")
	    public void validateGetAllUsersStatusCode() {
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
