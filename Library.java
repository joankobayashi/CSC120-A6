/* This is a stub for the Library class */

//importing
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/** 
 *  Class representing a Library 
 *  The Library is a building and it has a collection of books
 */

public class Library extends Building{
  
  //attribute
  private Hashtable<String, Boolean> collection;

  /** 
  *  Creates a library with its name, address, and number of floors and creates a collection
  *  @param name,address,nFloors  The name of house, address of house, number of floors
  */

  //constructor
  public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);
    System.out.println("\n===\nYou have built a library: 📖\n===\n");

    //book is available (true) or currently checked out (false)
    this.collection = new Hashtable<String, Boolean>(); 
  }

  /** 
  *  Adds title of the book to the collection 
  *  @param title the title of the book, input from the user 
  */

  //methods
  public void addTitle(String title){
    this.collection.put(title, true);
    System.out.println("Added "+ title);
  }


  /** 
  *  Removes title of the book from the collection 
  *  @param title the title of the book, input from the user 
  *  @return title of the removed book
  */

  public String removeTitle(String title){
    if (this.collection.containsKey(title)){
      this.collection.remove(title);
      //returns the title that we removed
      System.out.println("Removed "+ title);
      return title;
    }

    else{
      throw new RuntimeException("This book is not in the collection.");
    }
  }


  /** 
  *  Checks out the book from the collection by changing the boolean to a false
  *  @param title the title of the book, input from the user 
  */

  public void checkOut(String title){
    if (this.collection.containsKey(title) && this.collection.containsValue(true)){
      this.collection.replace(title, false);
      System.out.println("Checked out "+ title);
    }

    else{
      throw new RuntimeException("This book is currently not available.");
    }
  }


  /** 
  *  Returns the book to the collection by changing the boolean to a true
  *  @param title the title of the book, input from the user 
  */

  public void returnBook(String title){
    if (this.collection.containsKey(title)){
      this.collection.replace(title, true);
      System.out.println("Returned "+ title);
    }

    else{
      throw new RuntimeException("This book is currently not in the collection. \nPlease add it to the collection first.");
    }
  }


  /** 
  *  Returns true if the title appears in the Libary's collection, false otherwise 
  *  @param title the title of the book, input from the user 
  *  @return T/F true or false 
  */ 

  public boolean containsTitle(String title){
    if (this.collection.containsKey(title)){
      return true;
    }

    else{
      return false;
    }
  } 


  /** 
  *  Returns true if the title (the value) is currently available (true), false otherwise 
  *  @param title the title of the book, input from the user 
  *  @return T/F true or false 
  */ 

  public boolean isAvailable(String title){
    if (this.collection.containsValue(true)){
      return true;
    }

    else{
      return false;
    }
  }


  /** 
  *  Prints out the entire collection including checkout status
  *  Prints "This collection is EMPTY." otherwise
  */ 

  public void printCollection(){

    int arraySize = this.collection.size();
      if (arraySize == 0){
        System.out.println("\nThis collection is EMPTY.");
      }

      else {
        System.out.println("\n[COLLECTION]");

        Iterator<Map.Entry<String, Boolean>> itr = collection.entrySet().iterator();
        
        Map.Entry<String, Boolean> entry = null;
        
        while(itr.hasNext()){
          entry = itr.next();
          String availability = "";

          //if statements to change it to "available" "not available"
          if (entry.getValue() == true){
            availability = "Available";
          }

          else{
            availability = "Not Available";
          }

          System.out.println(" \"" + entry.getKey() + "\"" + " - " + availability);

        }
        System.out.println("----------\n");
      }
  }

  //main
  public static void main(String[] args) {
    Library myLibrary = new Library("Hiller Library", "Smith College", 3);
    System.out.println(myLibrary);
    myLibrary.addTitle("LOL");
    myLibrary.addTitle("HAHA");
    myLibrary.removeTitle("LOL");
    myLibrary.printCollection();

    myLibrary.checkOut("HAHA");
    myLibrary.isAvailable("HAHA");
    myLibrary.printCollection();
  
  }
}