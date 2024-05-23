import io.qameta.allure.*;
import org.example.passages.Passage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
@Epic("Тестирование функционала https://api.scripture.api.bible")
@Feature("Тестирование Passage API")
public class GetBiblePassagesTest extends BibleApiAbstractTest{
    @Test
    @DisplayName("Получение отрывка")
    @Description("Поиск отрывка пользователем")
    @Link("https://api.scripture.api.bible")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Поиск отрывка")
    @Owner("Luke Skywalker")
    public void getPassages() {
        Passage passage = given()
                .header("api-key", getApiKey())
                .when()
                .get(getBaseUrl() + "/v1/bibles/7142879509583d59-03/passages/MAT.1.12-MAT.1.20")
                .then()
                .statusCode(200)
                .extract()
                .body().jsonPath().getObject("data", Passage.class);

        Assertions.assertEquals("MAT.1.12-MAT.1.20", passage.getId());
        Assertions.assertEquals(9, passage.getVerseCount());
        Assertions.assertTrue(passage.getContent().contains("Joseph, son of David, don’t be afraid to take to yourself Mary as your wife, " +
                "for that which is conceived in her is of the Holy Spirit."));
    }
}
