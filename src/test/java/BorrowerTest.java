import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void before(){
        borrower = new Borrower("Donald");
        book = new Book("Financial");
        library = new Library("Library of Capitalism");
        library.addBook(book);
    }

    @Test
    public void hasNoBooksInCollection(){
        assertEquals(0, borrower.getBooksInCollection());
    }

    @Test
    public void borrowerBorrowsBook(){
        borrower.getBookFromLibrary(library);
    }
}
