import org.example.bibles.id.Data;
import org.example.books.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class GetBookByIdTest extends BibleApiAbstractTest{
    @Test
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
