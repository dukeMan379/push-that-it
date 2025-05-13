package Tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class TestSExamples {

    @Test
    public void testOne(){
        //run a Get request
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        response.getStatusCode();
        response.getTime();
        response.getBody();
        response.getHeader("content type");
        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
        System.out.println(response.getBody().asString());
        System.out.println(response.getHeader("content type"));
    }
}
