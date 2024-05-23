import io.qameta.allure.*;
import org.example.chapters.Chapter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
@Epic("Тестирование функционала https://api.scripture.api.bible")
@Feature("Тестирование Chapter API")
public class GetBibleBookChaptersTest extends BibleApiAbstractTest{
    @Test
    @DisplayName("Тест поиска глав")
    @Description("Поиск глав пользователем")
    @Link("https://api.scripture.api.bible")
    @Severity(SeverityLevel.NORMAL)
    @Story("Поиск глав")
    @Owner("Luke Skywalker")
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
