import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> stock;

    public Library(int capacity) {
        this.capacity = capacity;
        this.stock = new ArrayList<Book>();
    }

    public int stockCount() {
        return this.stock.size();
    }

    public void addBook(Book book) {
            this.stock.add(book);
        }
}

