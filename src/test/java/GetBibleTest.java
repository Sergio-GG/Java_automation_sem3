
import io.qameta.allure.*;
import org.example.bibles.Data;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Objects;

import static io.restassured.RestAssured.given;
@Epic("Тестирование функционала https://api.scripture.api.bible")
@Feature("Тестирование Bible API")
public class GetBibleTest extends BibleApiAbstractTest{
    @Test
    @DisplayName("Получение списка изданий")
    @Description("Поиск изданий пользователем")
    @Link("https://api.scripture.api.bible")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Поиск изданий")
    @Owner("Luke Skywalker")
    public void getBibles() {
        List<Data> dataList = given()
                .header("api-key", getApiKey())
                .when()
                .get(getBaseUrl() + "/v1/bibles")
                .then()
                .statusCode(200)
                .extract()
                .body().jsonPath().getList("data", Data.class);

        Assertions.assertEquals(267, dataList.size());
        Assertions.assertTrue(Objects.equals(dataList.get(0).getId(), "472735b48a27b402-01"));
    }
}
