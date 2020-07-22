import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void setUp(){
       borrower = new Borrower();
       book = new Book("Meditations", "Marcus Aurelius", "Philosophy");
       library = new Library(3);
    }

//    @Test
//    public void canBorrowBook(){
//        library.addBook(book);
//        borrower.borrowBook(library);
//        assertEquals(1, borrower.booksCount());
//    }
}
