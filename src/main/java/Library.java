import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Library> library;

    public Library(int capacity){
        this.capacity = capacity;
        this.library = new ArrayList<Library>();
    }

    public int stockCount(){
        return this.library.size();
    }

}

