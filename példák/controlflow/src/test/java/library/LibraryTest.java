package library;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class LibraryTest {

    @Test
    public void searchServiceTest(){
        List<Book> books = Arrays.asList(
                new Book("Gárdonyi Géza", "Egri csillagpok"),
                new Book("Stephen King", "Az"),
                new Book("Gárdonyi Géza", "Láthatatlan ember"),
                new Book("Stephen King", "Ragyogás")
        );

        SearchCriteria search = new BookAuthorSearchCriteria("Stephen King");
        SearchService<Book> searchService = new SearchService<>();

        Book b = searchService.findFirst(books, search);

        assertThat(b.getTitle(), equalTo("Az"));
    }
}
