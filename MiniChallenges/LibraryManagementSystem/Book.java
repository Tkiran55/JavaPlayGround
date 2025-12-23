package LibraryManagementSystem;

public class Book extends LibraryItem implements Borrowable{

    private String author;
    private int pages;
    private String borrowerName;

    public Book(String id, String title, String author, int pages) {
        super(id, title);
        this.author = author;
        this.pages = pages;
    }

    @Override
    public void borrowItem(String borrowerName) {
        if(!isAvailable()){
            System.out.println(getTitle() + " is already bought");
            return;
        }

        this.borrowerName = borrowerName;
        setAvailable(false);

        System.out.println(getTitle() + " has been borrowed by " + getBorrowerName() + " for " + getLoanPeriod() + " days");


    }

    @Override
    public void returnItem() {
        if (isAvailable()) {
            System.out.println(getTitle() + " was not borrowed.");
            return;
        }
        borrowerName = null;
        setAvailable(true);

        System.out.println(getTitle() + " has been returned.");
    }

    @Override
    public String getBorrowerName() {
        return borrowerName;
    }

    @Override
    public String getItemType() {
        return "Book";
    }

    @Override
    public int getLoanPeriod() {
        return 14;
    }
}
