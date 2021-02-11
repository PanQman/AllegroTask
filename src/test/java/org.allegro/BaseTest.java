package org.allegro;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.path.json.JsonPath;
import org.allegro.configuration.PropertiesLoader;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;

import java.util.Base64;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.given;

public class BaseTest {

    @BeforeClass
    public static void beforeTest(){
        RestAssured.baseURI = "https://api.allegro.pl.allegrosandbox.pl/";
        String bearerToken = "Bearer " + getBearerToken();

        RestAssured.requestSpecification = new RequestSpecBuilder()
                .addHeader("Authorization", bearerToken)
                .setContentType("application/vnd.allegro.public.v1+json")
                .setAccept("application/vnd.allegro.public.v1+json")
                .build();

        ResponseSpecBuilder responseSpecBuilder = new ResponseSpecBuilder();
        responseSpecBuilder
                .expectStatusCode(200)
                .expectResponseTime(Matchers.lessThan(3L), TimeUnit.SECONDS);

        RestAssured.responseSpecification = responseSpecBuilder.build();

    }

    public static String getBearerToken(){
        Properties properties = PropertiesLoader.getPropertiesFromFile("configuration.properties");
        String client_Id = properties.getProperty("client_Id");
        String client_secret = properties.getProperty("client_secret");
        String authorizationEncodeInBase64 = "Basic " + Base64.getEncoder().encodeToString((client_Id + ":" + client_secret).getBytes());


        JsonPath jsonPath = given()
                .queryParam("grant_type", "client_credentials")
                .header("Authorization", authorizationEncodeInBase64)
                .when().get("https://allegro.pl.allegrosandbox.pl/auth/oauth/token")
                .jsonPath();
        return jsonPath.getString("access_token");

    }


}
