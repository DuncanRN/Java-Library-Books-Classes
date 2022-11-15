import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity)
    {
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    private boolean capacityNotReached(){
        if(bookCount()!=this.capacity){
            return true;
        }else{
            return false;
        }
    }

    public void addBook(Book book) {
        if(this.capacityNotReached()) {
            this.books.add(book);
        }
    }

    public int bookCount() {
        return this.books.size();
    }
}




