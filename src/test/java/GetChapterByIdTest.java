import org.example.chapters.ChapterAnswer;
import org.example.chapters.Next;
import org.example.chapters.Previous;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class GetChapterByIdTest extends BibleApiAbstractTest{
    @Test
    public void getChapterById() {
        ChapterAnswer chapter = given()
                .header("api-key", getApiKey())
                .when()
                .get(getBaseUrl() + "/v1/bibles/7142879509583d59-03/verses/LUK.12.5")
                .then()
                .statusCode(200)
                .extract()
                .body().jsonPath().getObject("data", ChapterAnswer.class);



        Assertions.assertEquals("LUK.12.5", chapter.getId());

    }
    @Test
    public void getNextChapterById(){
        Next nextChapter = given()
                .header("api-key", getApiKey())
                .when()
                .get(getBaseUrl() + "/v1/bibles/7142879509583d59-03/verses/LUK.12.5")
                .then()
                .statusCode(200)
                .extract()
                .body().jsonPath().getObject("data.next", Next.class);

        Assertions.assertEquals("LUK.12.6", nextChapter.getId());
    }
    @Test
    public void getPreviousChapterById(){
        Previous previousChapter = given()
                .header("api-key", getApiKey())
                .when()
                .get(getBaseUrl() + "/v1/bibles/7142879509583d59-03/verses/LUK.12.5")
                .then()
                .statusCode(200)
                .extract()
                .body().jsonPath().getObject("data.previous", Previous.class);

        Assertions.assertEquals("LUK.12.4", previousChapter.getId());
    }
}
