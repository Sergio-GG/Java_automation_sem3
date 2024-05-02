import org.example.chapters.Chapter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class GetBibleBookChaptersTest extends BibleApiAbstractTest{
    @Test
    public void getChapters() {
        List<Chapter> chapterList = given()
                .header("api-key", getApiKey())
                .when()
                .get(getBaseUrl() + "/v1/bibles/7142879509583d59-03/books/LUK/chapters")
                .then()
                .statusCode(200)
                .extract()
                .body().jsonPath().getList("data", Chapter.class);

        Assertions.assertEquals(25, chapterList.size());
        //Assertions.assertEquals("LUK.intro", chapterList.get(0).getId());
    }
}
