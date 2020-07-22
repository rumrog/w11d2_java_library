import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void setUp() {
        library = new Library(5);
        book = new Book("Meditations", "Marcus Aurelius", "Philosophy");
    }

    @Test
    public void canCountStock() {
        assertEquals(0, library.stockCount());
    }

    @Test
    public void canAddBook() {
        library.addBook(book);
        assertEquals(1, library.stockCount());
    }


}
