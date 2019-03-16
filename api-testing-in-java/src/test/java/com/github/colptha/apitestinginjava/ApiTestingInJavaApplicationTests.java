package com.github.colptha.apitestinginjava;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import io.restassured.RestAssured;

public class ApiTestingInJavaApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@ParameterizedTest( name = "Able to reach {0}")
	@CsvFileSource( resources = "/urls.csv" )
	public void getRequests(String name, String url) {
		RestAssured.get(url).then().statusCode(200);
		
	}

}
