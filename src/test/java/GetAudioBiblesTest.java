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
public class GetAudioBiblesTest extends BibleApiAbstractTest{
    @Test
    @DisplayName("Тест получения списка аудиокниг")
    @Description("Получение списка аудиокниг пользователем")
    @Link("https://api.scripture.api.bible")
    @Severity(SeverityLevel.NORMAL)
    @Story("Поиск аудиокниги")
    @Owner("Luke Skywalker")
    public void getAudioBibles() {
        List<Data> dataList = given()
                .header("api-key", getApiKey())
                .when()
                .get(getBaseUrl() + "/v1/audio-bibles")
                .then()
                .statusCode(200)
                .extract()
                .body().jsonPath().getList("data", Data.class);

        Assertions.assertTrue(Objects.equals(dataList.get(0).getId(), "4be2587519bb459d-01"));
    }
}
