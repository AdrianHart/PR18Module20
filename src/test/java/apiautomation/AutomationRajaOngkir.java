package apiautomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class AutomationRajaOngkir {
    @BeforeTest
    public static void setup() {
        RestAssured.baseURI = "https://rajaongkir.com/";
        System.out.println("Before Test");
    }
    @AfterTest
    public static void finish() {
        baseURI = "https://api.rajaongkir.com/starter";
        System.out.println("After Test");
    }
    @Test
    public void testGetListProvince() {

        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("key", "0e9c0d344dde06d9f30758fc0ba7ae46")
                .get("https://api.rajaongkir.com/starter/province");

        System.out.println("Data Province berhasil ditampilkan");
        System.out.println(response.getBody().prettyPrint());
    }

    @Test
    public void testGetListCity() {

        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("key", "0e9c0d344dde06d9f30758fc0ba7ae46")
                .get("https://api.rajaongkir.com/starter/city");

        System.out.println("Data City berhasil ditampilkan");
        System.out.println(response.getBody().prettyPrint());
    }

    @Test
    public void testCostRajaOngkir() {

        Response response = given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("key", "0e9c0d344dde06d9f30758fc0ba7ae46")
                .body("{ \"origin\": \"501\", \"destination\": \"114\", \"weight\": \"1700\", \"courier\": \"jne\" }")
                .when()
                .post("https://api.rajaongkir.com/starter/cost");

        System.out.println("Berikut adalah data Cost: ");
        System.out.println(response.getBody().prettyPrint());
    }

    @Test
    public void testLogin() {

        Response response = RestAssured
                .given().auth()
                .basic("user", "pass")
                .when()
                .get("https://rajaongkir.com/akun/masuk?lalu=akun/profil");

        System.out.println("Silahkan masukan username Anda");
        System.out.println(response.getBody().prettyPrint());
    }

    @Test
    public void testWrongURL() {

        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("key", "0e9c0d344dde06d9f30758fc0ba7ae46")
                .get("https://api.rajaongkir.com/starterrrrr");

        System.out.println(HttpStatus.SC_NOT_FOUND + " Halaman yang anda cari tidak ada");
        System.out.println(response.getBody().prettyPrint());
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

        System.out.println(HttpStatus.SC_BAD_REQUEST + " Unknown method. Method tidak ditemukan, harap baca dokumentasi dengan baik.");
        System.out.println(responseSpecification);
    }
}
