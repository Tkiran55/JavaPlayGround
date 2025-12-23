package LibraryManagementSystem;

public class Library {
    private String name;
    private LibraryItem[] items;

    public Library(String name, LibraryItem[] items) {
        this.name = name;
        this.items = items;
    }

    public void displayAllItems(){
        for(LibraryItem item: items){
            item.displayInfo();
        }
    }

    public void displayAvailableItems(){
        for(LibraryItem item: items){
            if(item.isAvailable()){
                item.displayInfo();
            }
        }
    }

    public LibraryItem findItemById(String id){
        for(LibraryItem item: items){
            if(item.getId().equals(id)){
                return item;
            }
        }
        return null;
    }

    public int getTotalBorrowableItems(){
        int count = 0;
        for(LibraryItem item: items){
            if(item instanceof Borrowable){
                count++ ;
            }
        }
        return count;
    }

    public void borrowItem(String id, String borrowerName){
        LibraryItem item = findItemById(id);

        if(item == null){
            System.out.println("Item not found");
            return;
        }

        if(item instanceof Borrowable){
            ((Borrowable) item).borrowItem(borrowerName);
        }else{
            System.out.println(item.getTitle() + " cannot be borrowed.");
        }
    }

    public void returnItem(String id){
        LibraryItem item = findItemById(id);

        if (item == null) {
            System.out.println("Item not found");
            return;
        }

        if(item instanceof Borrowable){
            ((Borrowable) item).returnItem();
        } else {
            System.out.println(item.getTitle() + " cannot be returned.");
        }

    }


}
