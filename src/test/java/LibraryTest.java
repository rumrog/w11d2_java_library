import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;

    @Before
    public void setUp() {
        library = new Library(3);
        book1 = new Book("Meditations", "Marcus Aurelius", "Philosophy");
        book2 = new Book("On the Shortness of Life", "Seneca", "Philosophy");
        book3 = new Book("Moral Letters to Lucilus", "Seneca", "Philosophy");
        book4 = new Book("The Enchiridion", "Epictetus", "Philosophy");
    }

    @Test
    public void canCountStock() {
        assertEquals(0, library.stockCount());
    }

    @Test
    public void canAddBook() {
        library.addBook(book1);
        assertEquals(1, library.stockCount());
    }

    @Test
    public void cannotAddBook_LibraryAtFullCapacity(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(3, library.stockCount());
    }
}
