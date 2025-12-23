package LibraryManagementSystem;

public abstract class LibraryItem {
    private String id;
    private String title;
    private boolean isAvailable;


    public LibraryItem(String id, String title) {
        this.id = id;
        this.title = title;
        this.isAvailable = true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void displayInfo() {
        System.out.println("[" + getItemType() + "] " + id + ": " + title +
                " - " + (isAvailable ? "Available" : "Not Available"));
    }

    public abstract String getItemType();
    public abstract int getLoanPeriod();
}
