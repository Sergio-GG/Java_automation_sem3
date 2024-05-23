import io.qameta.allure.*;
import org.example.verses.Next;
import org.example.verses.Previous;
import org.example.verses.VerseAnswer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
@Epic("Тестирование функционала https://api.scripture.api.bible")
@Feature("Тестирование Verse API")
public class GetBibleBookChapterVerseByIdTest extends BibleApiAbstractTest{
    @Test
    @DisplayName("Тест получения стиха по ID")
    @Description("Получение стиха по ID пользователем")
    @Link("https://api.scripture.api.bible")
    @Severity(SeverityLevel.NORMAL)
    @Story("Получение стиха по ID")
    @Owner("Luke Skywalker")
    public void getVerseById() {
        VerseAnswer verseAnswer = given()
                .header("api-key", getApiKey())
                .when()
                .get(getBaseUrl() + "/v1/bibles/7142879509583d59-03/verses/LUK.12.5")
                .then()
                .statusCode(200)
                .extract()
                .body().jsonPath().getObject("data", VerseAnswer.class);

        Assertions.assertEquals("LUK.12.5", verseAnswer.getId());
        Assertions.assertTrue(verseAnswer.getContent().contains("power"));
    }
    @Test
    public void getNextVerseById() {
        Next nextVerse = given()
                .header("api-key", getApiKey())
                .when()
                .get(getBaseUrl() + "/v1/bibles/7142879509583d59-03/verses/LUK.12.5")
                .then()
                .statusCode(200)
                .extract()
                .body().jsonPath().getObject("data.next", Next.class);

        Assertions.assertEquals("LUK.12.6", nextVerse.getId());
    }
    @Test
    public void getPreviousVerseById() {
        Previous previousVerse = given()
                .header("api-key", getApiKey())
                .when()
                .get(getBaseUrl() + "/v1/bibles/7142879509583d59-03/verses/LUK.12.5")
                .then()
                .statusCode(200)
                .extract()
                .body().jsonPath().getObject("data.previous", Previous.class);

        Assertions.assertEquals("LUK.12.4", previousVerse.getId());
    }
}
