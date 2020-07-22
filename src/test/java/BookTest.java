import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void setUp() {
        book = new Book("Meditations", "Marcus Aurelius", "Philosophy");
    }

    @Test
    public void canGetTitle() {
        assertEquals("Meditations", book.getTitle());
    }

    @Test
    public void canGetAuthor() {
        assertEquals("Marcus Aurelius", book.getAuthor());
    }

    @Test
    public void canGetGenre() {
        assertEquals("Philosophy", book.getGenre());
    }
}
