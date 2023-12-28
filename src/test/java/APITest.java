import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class APITest {

    @Test
    public void test1(){
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");

        System.out.println("Response: "+response.asString());
        System.out.println("Status Code: "+response.statusCode());
        System.out.println("Body: "+response.getBody().asString());
        System.out.println("Time Taken: "+response.getTime());
        System.out.println("Header: "+response.getHeader("content-type"));

        int statusCode = response.getStatusCode();

        Assert.assertEquals(statusCode,200);
    }

    @Test
    public void test2(){
        given().get("https://reqres.in/api/users?page=2").
                then().statusCode(200);
    }

    @Test
    public void test3(){
        given().get("https://reqres.in/api/users?page=3").
                then().statusCode(200);
    }

    @Test
    public void test4(){
        given().get("https://reqres.in/api/users?page=1").
                then().statusCode(200);
    }
}
