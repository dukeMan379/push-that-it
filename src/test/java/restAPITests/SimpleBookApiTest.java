package restAPITests;

import com.aventstack.extentreports.gherkin.model.Given;
import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.post;
import static org.hamcrest.Matchers.hasProperty;

public class SimpleBookApiTest {

    //setting base Url
    String baseUrl = "https://simple-books-api.glitch.me";
    String endPoint = "";
    String payload = "";


    //sending a get request or call
    @Test(priority = 1)
    public void getStatusTest() {
        endPoint = "/status";
        Response response = RestAssured.get(baseUrl + endPoint);
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);

    }

    @Test(priority = 2)
    public void getbooks() {

        endPoint = "/books";
        /*
        Response response = RestAssured.get(baseUrl + endPoint);
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
        System.out.println(response.prettyPrint());

         */


        //using BDD style
        //Given method builds out the request you are making
        //everything in the request portion of postman
        //When method is when we use the RestApi call such as Get,Post,Delete,Patch
        //Then method is used for asserting back the response we get from the when method

        given().

                    queryParam("type", "fiction").
                    queryParam("limit", 1).
                when().
                    get(baseUrl + endPoint).
                then().
                    assertThat().
                    statusCode(200);

    }


    public String generateAccessToken(){
        endPoint ="/api-clients/";
        payload = "{\n" +
                "    \"clientName\": \"levi\",\n" +
                "     \"clientEmail\": \"dukebeke5@mail.com\"\n" +
                "}";
        System.out.println(payload);

        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.header("Content-Type", "application/json");
        Response response = requestSpecification.body(payload).post(baseUrl + endPoint);
        response.prettyPrint();


        //we took our variable tha is in json format
        //we created a new String variable to convert into a string from jason
        //and we stored in a variable called jsonString using getbody() and asString()
        String jsonString = response.getBody().asString();

        //we need to extract our bearer Token value from the actual
        //key pair its associated to
        String accessToken = JsonPath.from(jsonString).get("accessToken");
        System.out.println(accessToken);
        return accessToken;

    }

    @Test(priority = 3)
    public void submitAnOrder(){
        endPoint = "/orders";
        payload = "{\n" +
                "    \"bookId\": \"1\",\n" +
                "     \"customerName\": \"levi\"\n" +
                "}";

        given().
                when().post(baseUrl + endPoint).body().asString().equalsIgnoreCase(payload);

        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.header("Content-Type", "application/json");
        Response response = requestSpecification.body(payload).post(baseUrl + endPoint + generateAccessToken());
        String jsonString = response.getBody().asString();




    }
}
