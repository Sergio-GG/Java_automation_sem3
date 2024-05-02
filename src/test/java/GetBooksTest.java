import org.example.bibles.Data;
import org.example.books.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Objects;

import static io.restassured.RestAssured.given;

public class GetBooksTest extends BibleApiAbstractTest{
    @Test
    public void getBooks() {
        List<Book> bookList = given()
                .header("api-key", getApiKey())
                .when()
                .get(getBaseUrl() + "/v1/bibles/7142879509583d59-03/books")
                .then()
                .statusCode(200)
                .extract()
                .body().jsonPath().getList("data", Book.class);

        Assertions.assertEquals(77, bookList.size());
        Assertions.assertTrue(Objects.equals(bookList.get(0).getId(), "GEN"));
    }
}
