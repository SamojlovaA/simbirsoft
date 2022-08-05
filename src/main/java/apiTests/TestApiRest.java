package apiTests;

import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class TestApiRest {
    public static void main(String[] args)
    {
        TestApiRest apiresponse = new TestApiRest();
        apiresponse.response();
    }

    @Test
    public void response ()
    {
        RequestSpecification requestSpec = given()
                .baseUri(ConstApi.URL)
                        .header("Authorization", ConstApi.TOKEN);
        ResponseBody body = requestSpec.get(ConstApi.GET_RESOURCES).getBody();
        System.out.println("Response Body is: " + body.asString());
    }
}
