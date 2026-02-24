package APIStepdeff;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Assert;

import static org.junit.Assert.*;

public class GetProducts {
    public int statuscode;
    public RequestSpecification httpRequest;
    public Response response;
    public int resposnseCode;
    public ResponseBody body;


    @Given("I hit the URL of GET products API endpoint")
    public void i_Hit_URL_Of_Get_Product_API_EndPoint() {
        RestAssured.baseURI = "https://fakestoreapi.com/";
    }

    @When("I pass the URL of product in the request")
    public void i_Pass_URL_Products_Request() {
        httpRequest = RestAssured.given();
        response = httpRequest.get("products");
    }

    @Then("I receive the response code as {int}")
    public void i_Receive_Response_Code(Integer int1) {
        resposnseCode = response.getStatusCode();
        Assert.assertEquals(resposnseCode,200);
    }
    @Then("verify the rate of first product is {}")
    public void verify_First_Product_Rate(String rate){

        body=response.getBody();
       String responseBody = body.asString();
        JsonPath jsonPath = response.jsonPath();
       String s =  jsonPath.getJsonObject("rating[0].rate").toString();

    }
}
