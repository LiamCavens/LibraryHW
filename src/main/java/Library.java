import java.util.ArrayList;

public class Library {

    private String name;
    private int capacity;
    private ArrayList<Book> bookCollection;

    public Library(String name){
        this.name = name;
        this.capacity = 100;
        this.bookCollection = new ArrayList<>();
    }
}
