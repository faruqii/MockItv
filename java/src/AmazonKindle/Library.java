package AmazonKindle;

import java.util.HashMap;
import java.util.List;

public class Library {
    HashMap<Integer,Book> collection;
    private Book activeBook;
    private int idCounter;

    public Library() {
        this.collection = new HashMap<>();
        this.activeBook = null;
        this.idCounter = 0;
    }

    public void addToCollection(String title, List<String> content) {
        Book book = new Book(String.valueOf(idCounter), title, content);
        collection.put(idCounter, book);
        idCounter++;
    }

    public void removeFromCollection(int id) {
        collection.remove(id);
    }

    public void setActiveBook(int id) {
        activeBook = collection.get(id);
    }

    public String displayPage() {
        if (activeBook != null) {
            return activeBook.displayPage();
        }
        return "No active book selected";
    }

    public String turnPage() {
        if (activeBook != null) {
            return activeBook.turnPage();
        }
        return "No active book selected";
    }
}
