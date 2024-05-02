
import org.example.bibles.Data;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Objects;

import static io.restassured.RestAssured.given;

public class GetBibleTest extends BibleApiAbstractTest{
    @Test
    public void getBibles() {
        List<Data> dataList = given()
                .header("api-key", getApiKey())
                .when()
                .get(getBaseUrl() + "/v1/bibles")
                .then()
                .statusCode(200)
                .extract()
                .body().jsonPath().getList("data", Data.class);

        Assertions.assertEquals(265, dataList.size());
        Assertions.assertTrue(Objects.equals(dataList.get(0).getId(), "472735b48a27b402-01"));
    }
}
