package com.qa.rest.tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetCallBDD {

    @Test
    public void test_numberOfCircuitsFor2017_Season(){

        given().
        when().
            get("https://ergast.com/api/f1/2017/circuits.json").
        then().
            assertThat().

            statusCode(200).

            and().
            body("MRData.CircuitTable.Circuits.circuitId", hasSize(20)).
            and().
            header("Content-Length", equalTo("4552"));

    }
}
