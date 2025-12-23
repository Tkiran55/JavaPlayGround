package LibraryManagementSystem;

public class Magazine extends LibraryItem{
    private int issueNumber;
    private String publicationDate;

    public Magazine(String id, String title, int issueNumber, String publicationDate) {
        super(id, title);
        this.issueNumber = issueNumber;
        this.publicationDate = publicationDate;
    }

    @Override
    public String getItemType() {
        return "Magazine";
    }

    @Override
    public int getLoanPeriod() {
        return 0;
    }
}
