package LibraryManagementSystem;

public interface Borrowable {
    void borrowItem(String borrowerName);
    void returnItem();
    String getBorrowerName();
}
