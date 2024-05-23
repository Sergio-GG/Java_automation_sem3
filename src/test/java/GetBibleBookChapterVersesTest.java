import io.qameta.allure.*;
import org.example.verses.Verse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
@Epic("Тестирование функционала https://api.scripture.api.bible")
@Feature("Тестирование Verse API")
public class GetBibleBookChapterVersesTest extends BibleApiAbstractTest{
    @Test
    @DisplayName("Тест получения стихов")
    @Description("Получение стихов пользователем")
    @Link("https://api.scripture.api.bible")
    @Severity(SeverityLevel.NORMAL)
    @Story("Получение стихов")
    @Owner("Luke Skywalker")
    public void getVerses() {
        List<Verse> verseList = given()
                .header("api-key", getApiKey())
                .when()
                .get(getBaseUrl() + "/v1/bibles/7142879509583d59-03/chapters/LUK.12/verses")
                .then()
                .statusCode(200)
                .extract()
                .body().jsonPath().getList("data", Verse.class);

        Assertions.assertEquals(59, verseList.size());
        Assertions.assertEquals("LUK.12.1", verseList.get(0).getId());
    }
}
