import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library("Motherwell");
        book = new Book("Fantasy");
    }

    @Test
    public void hasBookCount(){
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void addBookToLibrary(){
        library.addBook(book);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void removeBookFromLibrary(){
        library.addBook(book);
        Book result = library.removeBook();
        assertNotNull(result);
    }
}
