import java.util.*;

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

class MyBook extends Book {
    private int price;

    /**
     * Class Constructor
     *
     * @param title  The book's title.
     * @param author The book's author.
     * @param price  The book's price.
     **/
    public MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    /**
     * Method Name: display
     * <p>
     * Print the title, author, and price in the specified format.
     **/
    public void display() {
        System.out.printf("Title: %s%nAuthor: %s%nPrice: %d", title, author, price);
    }

}

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}