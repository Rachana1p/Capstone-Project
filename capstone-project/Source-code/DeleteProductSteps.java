package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;

public class DeleteProductSteps {

	   // private Response response;
	   // private String productIdToDelete;

	    @Given("I have API endpoint to delete a product")
	    public void setDeleteProductEndpoint() {
	    	 RestAssured.given()
             .baseUri("http://localhost:9010")
             .basePath("/delete-shoe");
	    }
	    @When("I make a DELETE request to delete a product")
	    public void deleteProductRequest() {
	    	 RestAssured.given()
             .queryParam("id", "1020")
             .when()
             .delete();
	    }

	    @Then("I should receive a response with status code")
	    public void validateDeleteProductStatusCode() {
	    	 RestAssured.given().log().all()
		     .then().statusCode(200).body("message", equalTo("Shoe with ID 1020 Deleted Successfully."));
	    }

	}
