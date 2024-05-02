import org.example.bibles.id.Data;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class GetBibleByIdTest extends BibleApiAbstractTest{
    @Test
    public void getBiblesById() {
        Data data = given()
                .header("api-key", getApiKey())
                .when()
                .get(getBaseUrl() + "/v1/bibles/7142879509583d59-03")
                .then()
                .statusCode(200)
                .extract()
                        .body().jsonPath().getObject("data", Data.class);

        Assertions.assertEquals("World English Bible British Edition", data.getName());
        Assertions.assertEquals("Orthodox", data.getDescription());
    }
}
