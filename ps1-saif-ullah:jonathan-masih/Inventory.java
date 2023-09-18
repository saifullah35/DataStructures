import java.lang.Object;
import java.util.ArrayList;
/**
 * Write a description of class Inventory here.
 *
 * @author (Saif Ullah and Jonathan Masih)
 * @version (March 9)
 */
public class Inventory
{
    Book[] inventory = new Book[MAX_BOOKS];
    private static final int MAX_BOOKS = 5;

    /**
     * Constructor for objects of class Inventory
     */
    public Inventory()
    {
        Book[] inventory;
    }

    public boolean addBook(String title){
        boolean found = false;
        boolean emptySlot = false;
        for (int i = 0; i < inventory.length; i++){
            if(inventory[i] != null && inventory[i].getTitle().equals(title)){   
                found = true; 
            } else if (inventory[i].getTitle().equals(null)) {
                emptySlot = true;
            }
        }

        if(found == false && emptySlot == true) {
            for (int i = 0; i < inventory.length; i++){
                if(inventory[i].getTitle().equals(null)){   
                    inventory[i] = new Book(title);
                }
            }
        } else {
            System.out.print("Error! There is no room in the inventory");

        }

        return found;
    }  

    public boolean addBook(String title, int numCopies){
        boolean bookAdded = false;
        boolean bookFound = false;
        for(int i = 0; i < inventory.length; i++){
            if(inventory[i] != null && inventory[i].getTitle().equals(title)){
                bookFound = true;
                break;
            }
        }
        for(int i = 0; i < inventory.length; i++){
            if(bookFound == false && inventory[i] == null){
                inventory[i] = new Book(title);
                inventory[i].addCopies(numCopies);
                bookAdded = true;
                break;
            }

        }

        if(bookAdded == false){
            System.out.print("Error! There is no room in the inventory or" + 
                " the book is already in the inventory");
        }
        return bookAdded;
    }

    public boolean haveCopy(String title){
        boolean copyFound= false;
        for(int i = 0; i < inventory.length;i++){
            if(inventory[i] != null){
                if(inventory[i].getTitle().equals(title) && inventory[i].getNumInStock() != 0){
                    copyFound = true;  
                    break;
                }
                else{
                    copyFound = false;

                }

            }
        }
        return copyFound;
    }

    public boolean sellCopy(String title){
        boolean copyReduced = false;

        for(int i = 0; i < inventory.length;i++){
            if(inventory[i].getTitle().equals(title)  && inventory[i].getNumInStock() != 0 && inventory[i] != null){
                inventory[i].sellCopy();
                copyReduced = true;
                break;
            }else{
                copyReduced = false;

            }
        }
        return copyReduced;
    }

    public int newShipment(String title, int numOfCopies){
        int bookcount = 0;   
        for(int i = 0; i < inventory.length; i++){
            if(inventory[i] != null && inventory[i].getTitle().equals(title)){
                inventory[i].addCopies(numOfCopies);
                bookcount = inventory[i].getNumInStock();
            } else if(inventory[i] == null){
                inventory[i] = new Book(title);
                inventory[i].addCopies(numOfCopies);
                bookcount = inventory[i].getNumInStock();
            } 
        }
        return bookcount;
    }

    public String getUnderstockedBooks(int count){
        String listOfBooks = "";
        for(int i = 0; i < inventory.length;i++){
            if(inventory[i] != null && inventory[i].getNumInStock() < count){
                listOfBooks += inventory[i].toString() + ", ";
            }

        }
        listOfBooks = listOfBooks.substring(0, listOfBooks.length()-2);
        return listOfBooks;
    }

    public Book removeBook(String title){
        Book removed = new Book(title);
        for (int i = 0; i < inventory.length;i++){
            if(inventory[i].getTitle().equals(title)){
                inventory[i] = null;
            } else{
                return null;
            }
        }
        return removed;
    }

    public static void main(String[] args){
        Inventory inventory = new Inventory();

        System.out.println("Have\"Conditionals Are Fun\"?: " + inventory.haveCopy("Conditionals Are Fun"));  
        inventory.addBook("Conditionals Are Fun", 10);
        inventory.addBook("A  History of Siena College", 5);
        inventory.addBook("Arrays for Everyone",  0);
        inventory.addBook("Java Heroes", 4); 
        System.out.println("Have\"Conditionals Are Fun\"?: " +  inventory.haveCopy("Conditionals Are Fun")); 
        System.out.println("Have\"Arrays for Everyone\"?: " + inventory.haveCopy("Arrays for Everyone"));
        System.out.println("3 or fewer copies: " + inventory.getUnderstockedBooks(4)); 
        inventory.sellCopy("Java Heroes");
        System.out.println("3  or fewer copies: " + inventory.getUnderstockedBooks(4)); 
        int newCount = inventory.newShipment("Big Book of Computing", 10);  
        System.out.println("Now have " + newCount + " copies of \"Big Book of Computing\"."); 
        newCount = inventory.newShipment("Little Book of Computing", 10);  
        System.out.println("Now have " + newCount + " copies of \"Little Book of Computing\"."); 

    }
}
