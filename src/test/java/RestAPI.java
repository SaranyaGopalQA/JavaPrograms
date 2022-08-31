import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.core.IsEqual.equalTo;

public class RestAPI {


        public static void main(String[] args) {

                Response response = RestAssured.get(" https://reqres.in/api/users?page=2");
                System.out.println(response.asString());
                System.out.println(response.getBody().asString());
                System.out.println(response.getStatusCode());
                System.out.println(response.getStatusLine());
                System.out.println(response.getHeader("content-type"));
                System.out.println(response.getTime());


                given().get(" https://reqres.in/api/users?page=2").
                        then().statusCode(200).
                        body("data[4].first_name",equalTo("George")).
                        body("data.first_name",hasItems("George","Rachel"));

                given().when().get("http://ergast.com/api/f1/2017/circuits.json").
                    then().assertThat().body("MRData.CircuitTable.Circuits.circuitId",hasSize(20));




        }
    }

