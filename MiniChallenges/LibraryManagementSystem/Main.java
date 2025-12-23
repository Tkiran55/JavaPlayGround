package LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {
        LibraryItem[] items = {
                new Book("B001", "Java Basics", "John Smith", 350),
                new Book("B002", "Clean Code", "Robert Martin", 464),
                new DVD("D001", "Java Tutorial", "Tech Academy", 120),
                new Magazine("M001", "Tech Weekly", 42, "2025-01"),
                new DVD("D002", "Design Patterns", "Gang of Four", 180)
        };

        Library library = new Library("City Library", items);

        System.out.println("=== All Items ===");
        library.displayAllItems();

        System.out.println("\n=== Borrowing Items ===");
        library.borrowItem("B001", "Kiran");
        library.borrowItem("D001", "Ram");
        library.borrowItem("M001", "Sita");

        System.out.println("\n=== Available Items ===");
        library.displayAvailableItems();

        System.out.println("\n=== Returning Items ===");
        library.returnItem("B001");

        System.out.println("\n=== Available Items After Return ===");
        library.displayAvailableItems();
    }
}
