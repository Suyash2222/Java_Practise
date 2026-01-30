package in.kgcoding.challenge80;

public class LibraryItem {
   private int itemId;
   private String title;
   private String author;

    public void checkOut(){
        System.out.println("Checkout");
    }

    public void returnItem(){
        System.out.println("Return item");
    }

}
