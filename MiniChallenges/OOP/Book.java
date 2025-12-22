package OOP;

public class Book {
    private String title;
    private String author;
    private int pages;
    private double price;

    public Book(String title, String author, int pages, double price){
        this.title = title;
        this.author = author;
        setPages(pages);
        setPrice(price);
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Price: $" + price);
        System.out.println();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if(pages<0) {
            System.out.println("Pages must be greater than 0");
        }else {
            this.pages = pages;
        }


    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0) {
            System.out.println("Price must be 0 or greater");
        }
        else{
            this.price = price;
        }
    }
}

