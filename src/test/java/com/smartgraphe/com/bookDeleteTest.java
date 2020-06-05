package com.smartgraphe.com;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class bookDeleteTest {

	@Test
	public void getLivreTest() {

		Response response = RestAssured.delete("http://localhost:8000/api/livre/Extraction");
		int statusCode = response.getStatusCode();
		assertEquals(statusCode, 200);
	}

}
