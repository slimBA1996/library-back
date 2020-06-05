package com.smartgraphe.com;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class bookGetByTest {

	@Test
	public void getLivreTest() {

		Response response = RestAssured.get("http://localhost:8000/api/livre/Extraction");
		System.out.println("book informations : " + response.getBody().asString());
		int statusCode = response.getStatusCode();
		assertEquals(statusCode, 200);
	}

}
