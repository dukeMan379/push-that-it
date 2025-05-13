package restAPITests;

import Utililties.ExtentManager;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class ApiTest {

    private static ExtentReports extent;

    @BeforeClass
    public static void setup() {
        // Base URI for REST Assured
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        // Initialize ExtentReports
        extent = ExtentManager.getInstance();
    }

    @AfterClass
    public static void tearDown() {
        // Flush ExtentReports
        ExtentManager.flush();
    }

    @Test
    public void testGetUser() {
        ExtentTest test = extent.createTest("testGetUser").assignCategory("API Testing");

        // Send a GET request to /users/1 and capture the response
        Response response = given()
                .when()
                .get("/users/1");

        // Log the response body in pretty print format
        test.log(Status.INFO, "Response Body:");
        test.log(Status.INFO, response.prettyPrint());

        try {
            // Perform assertions on the response
            response.then()
                    .statusCode(200)
                    .body("id", equalTo(1))
                    .body("name", equalTo("Leanne Graham"))
                    .body("username", equalTo("Bret"))
                    .body("email", equalTo("Sincere@april.biz"))
                    .body("address.street", equalTo("Kulas Light"))
                    .body("address.suite", equalTo("Apt. 556"))
                    .body("address.city", equalTo("Gwenborough"))
                    .body("address.zipcode", equalTo("92998-3874"))
                    .body("address.geo.lat", equalTo("-37.3159"))
                    .body("address.geo.lng", equalTo("81.1496"))
                    .body("phone", equalTo("1-770-736-8031 x56442"))
                    .body("website", equalTo("hildegard.org"))
                    .body("company.name", equalTo("Romaguera-Crona"))
                    .body("company.catchPhrase", equalTo("Multi-layered client-server neural-net"))
                    .body("company.bs", equalTo("harness real-time e-markets"));

            test.pass("All assertions passed.");
        } catch (AssertionError e) {
            test.fail("Assertion failed: " + e.getMessage());
            throw e;
        }
    }

    @Test
    public void testCreatePost() {
        ExtentTest test = extent.createTest("testCreatePost").assignCategory("API Testing");

        // Define a JSON body for the POST request
        String requestBody = "{\n" +
                "  \"title\": \"foo\",\n" +
                "  \"body\": \"bar\",\n" +
                "  \"userId\": 1\n" +
                "}";

        // Send a POST request to /posts and capture the response
        Response response = given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("/posts");

        // Log the response body in pretty print format
        test.log(Status.INFO, "Response Body:");
        test.log(Status.INFO, response.prettyPrint());

        try {
            // Perform assertions on the response
            response.then()
                    .statusCode(201)
                    .body("title", equalTo("foo"))
                    .body("body", equalTo("bar"))
                    .body("userId", equalTo(1))
                    .body("id", notNullValue()); // id should be present in the response

            test.pass("All assertions passed.");
        } catch (AssertionError e) {
            test.fail("Assertion failed: " + e.getMessage());
            throw e;
        }
    }

    @Test
    public void testUpdatePost() {
        ExtentTest test = extent.createTest("testUpdatePost").assignCategory("API Testing");

        // Define a JSON body for the PUT request
        String requestBody = "{\n" +
                "  \"id\": 1,\n" +
                "  \"title\": \"foo updated\",\n" +
                "  \"body\": \"bar updated\",\n" +
                "  \"userId\": 1\n" +
                "}";

        // Send a PUT request to /posts/1 and capture the response
        Response response = given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .put("/posts/1");

        // Log the response body in pretty print format
        test.log(Status.INFO, "Response Body:");
        test.log(Status.INFO, response.prettyPrint());

        try {
            // Perform assertions on the response
            response.then()
                    .statusCode(200)
                    .body("id", equalTo(1))
                    .body("title", equalTo("foo updated"))
                    .body("body", equalTo("bar updated"))
                    .body("userId", equalTo(1));

            test.pass("All assertions passed.");
        } catch (AssertionError e) {
            test.fail("Assertion failed: " + e.getMessage());
            throw e;
        }
    }

    @Test
    public void testDeletePost() {
        ExtentTest test = extent.createTest("testDeletePost").assignCategory("API Testing");

        // Send a DELETE request to /posts/1 and capture the response
        Response response = given()
                .when()
                .delete("/posts/1");

        // Log the response body in pretty print format
        test.log(Status.INFO, "Response Body:");
        test.log(Status.INFO, response.prettyPrint());

        try {
            // Perform assertions on the response
            response.then()
                    .statusCode(200)
                    .body(equalTo("{}")); // JSONPlaceholder returns an empty object on successful delete

            test.pass("All assertions passed.");
        } catch (AssertionError e) {
            test.fail("Assertion failed: " + e.getMessage());
            throw e;
        }
    }
}


