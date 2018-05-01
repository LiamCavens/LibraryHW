import java.util.ArrayList;

public class Library {

    private String name;
    private int capacity;
    private ArrayList<Book> bookCollection;

    public Library(String name){
        this.name = name;
        this.capacity = 5;
        this.bookCollection = new ArrayList<>();
    }


    public int getBookCount() {
        return this.bookCollection.size();
    }

    public void addBook(Book book) {
       if (this.bookCollection.size() < this.capacity)
        this.bookCollection.add(book);
    }

    public Book removeBook(){
          return this.bookCollection.remove(0);
    }
}
