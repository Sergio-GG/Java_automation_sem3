import io.qameta.allure.*;
import org.example.bibles.id.Data;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
@Epic("Тестирование функционала https://api.scripture.api.bible")
@Feature("Тестирование Bible API")
public class GetBibleByIdTest extends BibleApiAbstractTest{
    @Test
    @DisplayName("Получение издания")
    @Description("Поиск издания пользователем")
    @Link("https://api.scripture.api.bible")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Поиск изданий по ID")
    @Owner("Luke Skywalker")
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
