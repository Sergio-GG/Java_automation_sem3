import io.qameta.allure.*;
import org.example.bibles.id.Data;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
@Epic("Тестирование функционала https://api.scripture.api.bible")
@Feature("Тестирование Bible API")
public class GetAudioBibleByIdTest extends BibleApiAbstractTest{
    @Test
    @DisplayName("Тест поиска аудиокниги")
    @Description("Поиск аудиокниги пользователем")
    @Link("https://api.scripture.api.bible")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Поиск книги")
    @Owner("Luke Skywalker")
    public void getAudioBiblesById() {
        Data data = given()
                .header("api-key", getApiKey())
                .when()
                .get(getBaseUrl() + "/v1/audio-bibles/26b7a1cd2f8f4878-01")
                .then()
                .statusCode(200)
                .extract()
                .body().jsonPath().getObject("data", Data.class);

        Assertions.assertEquals("Biblica® Open New Arabic Version 2012, Audio Edition", data.getName());
        Assertions.assertEquals("Arabic, Standard: كتاب الحياة مجانى (Open New Arabic Version) (Bible)", data.getDescription());
    }
}
