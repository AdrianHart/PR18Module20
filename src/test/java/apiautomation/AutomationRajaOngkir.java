package apiautomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
public class AutomationRajaOngkir {
    @BeforeTest
    public static void setup() {
        RestAssured.baseURI = "https://api.rajaongkir.com/starter";
        System.out.println("Before Test");
    }

    @Test
    public void testGetListProvince() {

        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("key", "0e9c0d344dde06d9f30758fc0ba7ae46")
                .get("https://api.rajaongkir.com/starter/province");

        System.out.println(response.getBody().prettyPrint());
    }

    @Test
    public void testGetListCity() {

        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("key", "0e9c0d344dde06d9f30758fc0ba7ae46")
                .get("https://api.rajaongkir.com/starter/city");

        System.out.println(response.getBody().prettyPrint());
    }

    @Test
    public void testLogin() {

        given().auth()
                .basic("user", "pass")
                .when()
                .get("https://rajaongkir.com/akun/masuk?lalu=akun/profil")
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_OK);
    }

    @Test
    public void testWrongURL() {

        given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("key", "0e9c0d344dde06d9f30758fc0ba7ae46")
                .get("https://api.rajaongkir.com/starterrrrr")
                .then()
                .assertThat().statusCode(404);
        System.out.println(HttpStatus.SC_NOT_FOUND);
    }

    @Test
    public void testWrongMethod() {

        given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("key", "0e9c0d344dde06d9f30758fc0ba7ae46")
                .post("https://api.rajaongkir.com/starter/province")
                .then()
                .assertThat().statusCode(400);
        System.out.println(HttpStatus.SC_BAD_REQUEST);
    }
}
