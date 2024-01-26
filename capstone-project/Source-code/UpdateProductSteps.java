package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;

public class UpdateProductSteps {

	  //  private Response response;

	    @Given("I have API endpoint to update a product")
	    public void setUpdateProductEndpoint() {
	    	 RestAssured.given().baseUri("http://localhost:9010")
            .basePath("/update-shoe");
	    }

	    @When("I make a PUT request to update a product")
	    public void updateProductRequest() {
	    	 RestAssured.given()
             
             .queryParam("id", "1020")
             .queryParam("image", "www.image.com")
             .queryParam("name", "Rebook")
             .queryParam("category", "Running")
             .queryParam("sizes", "10,9,8")
             .queryParam("price", "2000")
             .when()
             .put();
	    }

	    @Then("I should receive a valid response status code")
	    public void validateUpdateProductStatusCode() {
	    	 RestAssured.given().log().all()
		     .then().statusCode(200).body("message", equalTo("Rebook Updated Successfully."));
	    }
	}
