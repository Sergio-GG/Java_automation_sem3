import io.qameta.allure.*;
import org.example.bibles.id.Data;
import org.example.books.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
@Epic("Тестирование функционала https://api.scripture.api.bible")
@Feature("Тестирование Book API")
public class GetBookByIdTest extends BibleApiAbstractTest{
    @Test
    @DisplayName("Тест получения тома")
    @Description("Получение тома пользователем по ID")
    @Link("https://api.scripture.api.bible")
    @Severity(SeverityLevel.NORMAL)
    @Story("Поиск тома по ID")
    @Owner("Luke Skywalker")
    public void getBookById() {
        Book book = given()
                .header("api-key", getApiKey())
                .when()
                .get(getBaseUrl() + "/v1/bibles/7142879509583d59-03/books/LUK")
                .then()
                .statusCode(200)
                .extract()
                .body().jsonPath().getObject("data", Book.class);

        Assertions.assertEquals("LUK", book.getId());
        Assertions.assertEquals("The Good News According to Luke", book.getNameLong());
    }
}
