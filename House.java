/* This is a stub for the House class */

import java.util.ArrayList; 

/** 
 *  Class representing a House 
 *  The House is a building and it contains residents
 */
 
public class House extends Building {


  //attributes
  private ArrayList<String> residents; 
  private boolean hasDiningRoom; 
  

  /** 
  *  Constructs a house using its parameters and initializes residents
  *  @param name,address,nFloors,hasDiningRoom  The name of house, address of house, number of floors, and if the house has a dining room  
  */

  //constructor 
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);

    System.out.println("\n===\nYou have built a house: 🏠\n===\n");
    
    //initialize residents to a new ArrayList<String>()
    this.residents = new ArrayList<String>(); 
    this.residents.add("Joan");
    this.hasDiningRoom = hasDiningRoom; //sets hasDiningRoom to indicate whether or not the house has a dining room. 
  }


  /** 
  *  Checks if the house has a dining room
  *  @return T/F on whether the house has a dining room or not 
  */

  //accessors
  public boolean hasDiningRoom(){ //boolean method that tells us whether or not a given person is a resident of the House 
    System.out.println("This house has a dining room: " + this.hasDiningRoom);
    return  this.hasDiningRoom;
  } 


  /** 
  *  Counts and returns the number of residents in the house
  *  @return the size of the residents 
  */

  public int nResidents(){
    System.out.println("Number of residents: " + this.residents.size() + "\n");
    return this.residents.size();
  }


  /** 
  *  Adds a new resident to the house and throws an exception if they are in the house already
  *  @param name  The name of the new resident
  */
  
  //methods 
  public void moveIn(String name){
    if (!this.residents.contains(name)){
      //adds name
      this.residents.add(name);
      System.out.println("Adding " + name + "...");
    }

    else{
      throw new RuntimeException("this person is already in the house");
    }
  }


  /** 
  *  Removes a resident from the house and throws an exception if they are out of the house already
  *  @param name  The name of the old resident 
  */

  public String moveOut(String name){
    // return the name of the person who moved out
    if (this.residents.contains(name)){
      //removes name
      this.residents.remove(name);
      System.out.println("Removing " + name + "...");
      return name + "is out of the house";
    }

    else{
      throw new RuntimeException("this person is already out of the house");
    }
  }


  /** 
  *  Tells if a resident is in the house or not  
  *  @param name The name of the resident 
  *  @return T/F on whether they are a resident or not
  */

  public boolean isResident(String person){
    System.out.println(person + " is a resident: " + (this.residents.contains(person) == true));
    return this.residents.contains(person) == true;
  }
  
  
  //main
  public static void main(String[] args) {
    House myHouse = new House("Baldwin", "Smith College", 2, false);
    System.out.println(myHouse);
    myHouse.hasDiningRoom();
    myHouse.nResidents();
    myHouse.moveIn("Phoebe");
    myHouse.moveOut("Joan");
    myHouse.isResident("Joan");
  }
}