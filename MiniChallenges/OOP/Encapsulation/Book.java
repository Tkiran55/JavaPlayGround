package OOP.Encapsulation;

public class Book {
    String title;
    String author;
    int pages;
    double price;

    public Book(String title, String author, int pages, double price){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Price: $" + price);
        System.out.println();
    }
}

