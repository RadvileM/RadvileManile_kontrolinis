package api;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.junit.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class TestCrudAction {
	
	private final String TOKEN = "36d0ad6095e060e667884c7535078a0327c4a7e4b9adad9e715466c3273caa48";
	private final String pageUrl = "https://gorest.co.in/";
	
	@Test
	public void testCreateUser_addText() {
		//post user
		
		String userName = "testName";
		String userEmail = "test_" + new Random().nextInt(1000) + "@gmail.com";
		String endPointPost = "public-api/users";

	//POST USER
		Map user = new HashMap<>();
		user.put("name", userName );
		user.put("email", userEmail );
		user.put("gender", "Female" );
		user.put("status", "Active");
		
		
	int userID = given().
			auth().
			oauth2(TOKEN).
			contentType(ContentType.JSON).
			body(user).
			log().all().
		when().
			post(pageUrl + endPointPost).
		then().
			assertThat().
			statusCode(200).
			body("code", is(201)).
			log().all().
			extract().path("data.id"); //issistraukiam user id path
	
	//POST - a new text
	String endPointUser = "public-api/posts/{userID}"; 
	String postText = "this is a test this is a test this is a test";
	
	Map userText = new HashMap<>();
	userText.put("id", userID);
	userText.put("user_id", 10);
	userText.put("title", "test");
	userText.put("body", postText);
	
	given().
		pathParam("userID", userID).
		auth().
		oauth2(TOKEN).
		contentType(ContentType.JSON).
		body(userText).
		log().all().
	when().
		post(pageUrl + endPointUser).
	then().
		assertThat().
		statusCode(200).
		log().all();
	
	

}}
