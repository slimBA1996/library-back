
package com.smartgraphe.com;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.smartgraphe.model.Livre;

import io.restassured.http.ContentType;

public class bookPostTest {

	@Test
	public void createNewBook() {
		Livre livre = new Livre("Extraction", "A 2020 action-thriller film ");
		given()
		.contentType(ContentType.JSON)
		.body(livre).when().post("http://localhost:8000/api/livre");

	}

}