import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> borrowedBooks;

    public Borrower(String name){
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public int getBooksInCollection() {
        return this.borrowedBooks.size();
    }

    public void getBookFromLibrary(Library library){
        if (library.getBookCount() >= 1) {
            Book book = library.removeBook();
            this.borrowedBooks.add(book);
        }
    }
}
