import org.junit.Before;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library("Motherwell");
        book = new Book("Fantasy");

    }
}