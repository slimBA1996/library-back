package com.smartgraphe.com;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.smartgraphe.model.Livre;

import io.restassured.http.ContentType;

public class bookUpdateTest {

	@Test
	public void updateLivreTest() {
		Livre livre = new Livre("BD", "An American neo-Western crime drama television series");
		given()
		.contentType(ContentType.JSON)
		.when()
		.body(livre)
		.put("http://localhost:8000/api/livre")
		;

	}

}