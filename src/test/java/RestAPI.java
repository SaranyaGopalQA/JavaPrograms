import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.core.IsEqual.equalTo;

public class RestAPI {


        public static void main(String[] args) {

//                Response response = RestAssured.get(" https://reqres.in/api/users?page=2");
//                System.out.println(response.asString());
//                System.out.println(response.getBody().asString());
//                System.out.println(response.getStatusCode());
//                System.out.println(response.getStatusLine());
//                System.out.println(response.getHeader("content-type"));
//                System.out.println(response.getTime());
//
//
//                given().get(" https://reqres.in/api/users?page=2").
//                        then().statusCode(200).
//                        body("data[4].first_name",equalTo("George")).
//                        body("data.first_name",hasItems("George","Rachel"));
//
//                given().when().get("http://ergast.com/api/f1/2017/circuits.json").
//                    then().assertThat().statusCode(200).and().
//                        body("MRData.CircuitTable.Circuits.circuitId",hasSize(20));
                getDetails();





        }

        public static void getDetails()
        {
                given().when().get("https://dummy.restapiexample.com/api/v1/employees").
                        then().
                        statusCode(200).
                        statusLine("HTTP/1.1 200 OK").
                        assertThat().body("status",equalTo("success")).
                        header("Content-Type","application/json");

                //POST Request

                RestAssured.baseURI="https://reqres.in/api/users";
                String data= " {" +
                        "name\":\"Tony\",\n"+
                         "salary\":\"30000\"\n"+
                        "age\":\"40\"\n"+ "}";
               RestAssured.given().body(data).post().then().log().all().assertThat().
                       statusCode(201);

               //GET Request

                RestAssured.baseURI="https://reqres.in/api/users";
                Response response=RestAssured.given().param("page","2").when().get();
                System.out.println("StatusCode:"+response.getStatusCode());
                System.out.println("Content Type:"+response.getContentType());
                System.out.println("Cookies"+response.getCookies());
                System.out.println(response.prettyPrint());
        }
    }

