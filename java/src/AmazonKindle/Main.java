package AmazonKindle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Adding books to the library
        List<String> content1 = new ArrayList<>();
        content1.add("Page 1 of Book One");
        content1.add("Page 2 of Book One");
        content1.add("Page 3 of Book One");
        library.addToCollection("Book One", content1);

        List<String> content2 = new ArrayList<>();
        content2.add("Page 1 of Book Two");
        content2.add("Page 2 of Book Two");
        content2.add("Page 3 of Book Two");
        library.addToCollection("Book Two", content2);

        // Setting an active book
        System.out.println("Select an active book by ID (0 for Book One, 1 for Book Two): ");
        int activeBookId = scanner.nextInt();
        library.setActiveBook(activeBookId);

        // Displaying the current page
        System.out.println("Current Page: " + library.displayPage());

        // Turning pages
        String command;
        do {
            System.out.println("Type 'next' to turn the page or 'exit' to quit: ");
            command = scanner.next();

            if (command.equalsIgnoreCase("next")) {
                System.out.println("Current Page: " + library.turnPage());
            }

        } while (!command.equalsIgnoreCase("exit"));

        scanner.close();
    }
}
