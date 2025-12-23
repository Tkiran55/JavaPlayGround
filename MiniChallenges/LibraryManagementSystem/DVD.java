package LibraryManagementSystem;

public class DVD extends LibraryItem implements Borrowable{
    private String director;
    private int duration;
    private String borrowerName;

    public DVD(String id, String title, String director, int duration) {
        super(id, title);
        this.director = director;
        this.duration = duration;
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
        return "DVD";
    }

    @Override
    public int getLoanPeriod() {
        return 7;
    }
}
