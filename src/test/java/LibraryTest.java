import org.junit.Before;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void setUp() {
        library = new Library(5);
        book = new Book("Meditations", "Marcus Aurelius", "Philosophy");
    }
}
