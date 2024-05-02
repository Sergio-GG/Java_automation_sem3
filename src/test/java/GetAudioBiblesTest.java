import org.example.bibles.Data;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Objects;

import static io.restassured.RestAssured.given;

public class GetAudioBiblesTest extends BibleApiAbstractTest{
    @Test
    public void getAudioBibles() {
        List<Data> dataList = given()
                .header("api-key", getApiKey())
                .when()
                .get(getBaseUrl() + "/v1/audio-bibles")
                .then()
                .statusCode(200)
                .extract()
                .body().jsonPath().getList("data", Data.class);

        Assertions.assertTrue(Objects.equals(dataList.get(0).getId(), "4be2587519bb459d-01"));
    }
}
