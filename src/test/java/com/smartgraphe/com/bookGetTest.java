package com.smartgraphe.com;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class bookGetTest {

	@Test
	public void getAllLivresTest() {

		Response response = RestAssured.get("http://localhost:8000/api/livre/");
		System.out.println("List of books : " + response.getBody().asString());
		int statusCode = response.getStatusCode();
		assertEquals(statusCode, 200);
	}

}
