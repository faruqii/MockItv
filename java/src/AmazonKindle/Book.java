package AmazonKindle;

import java.util.List;


public class Book {
    private String id;
    private String title;
    private List<String> content;
    private int lastPages;

    public Book(String id, String title, List<String> content) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.lastPages = 0;
    }

    public String displayPage() {
        return content.get(lastPages);
    }

    public String turnPage() {
        if (lastPages < content.size()) {
            lastPages++;
        }

        return displayPage();
    }

}
