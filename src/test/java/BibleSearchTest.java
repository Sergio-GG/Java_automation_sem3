import io.restassured.internal.common.assertion.Assertion;
import org.example.Verse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class BibleSearchTest extends BibleApiAbstractTest{
    @Test
    public void getResultBySearch(){
        List<Verse> verseList = given()
                .header("api-key", getApiKey())
                .queryParam("query", "Lord")
                .queryParam("limit", 5)
                .when()
                .get(getBaseUrl() + "/v1/bibles/7142879509583d59-03/search")
                .then()
                .statusCode(200)
                .extract()
                .body().jsonPath().getList("data.verses", Verse.class);

        Assertions.assertEquals(5, verseList.size());
        Assertions.assertTrue(verseList.stream().anyMatch(e -> e.getText().contains("LORD")));
    }
}
