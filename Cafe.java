/* This is a stub for the Cafe class */

//extending
public class Cafe extends Building {

    //attributes
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory


    /** 
    *  Creates constructor
    *  @param name,address,nFloors  The names of residents, address of house, number of floors
    *  @param nCoffeeOunces,nSugarPackets,nCreams,nCups  The numbers of coffee ounces, sugar packets, creams, and cups that are left
    */

    //constructor
    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        //inheriting 
        super(name, address, nFloors);
        System.out.println("\n===\nYou have built a cafe: ☕\n===\n");

        //setting start values
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
    }
    

    /** 
    *  Decreases the items used when a coffee is sold and prints inventory
    *  @param size,nSugarPackets,nCreams  The ounces of coffee, number of sugar packets, and creams used 
    */

    public void sellCoffee(int nCoffeeOunces, int nSugarPackets, int nCreams){
        System.out.println("\n----------\nCoffee sold!!\nThank you for your order!!\n----------\n");
        this.nCoffeeOunces -= nCoffeeOunces;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -= 1;
        System.out.println("Decreased stock for a coffee.");
        System.out.println("Number of items left:");
        System.out.println("Coffee ounces: " + this.nCoffeeOunces + ", Sugar Packets: " + this.nSugarPackets + ", Creams: " + this.nCreams + ", Cups: " + this.nCups +"\n");
    }


    /** 
    *  Restocks the items needed in a cafe and prints inventory
    *  @param nCoffeeOunces,nSugarPackets,nCreams,nCups  The number of coffee ounces, sugar packets, creams, and cups that will be restocked
    */

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;
        System.out.println("Restocked items.");
        System.out.println("[UPDATED] Number of items left:");
        System.out.println("Coffee ounces: " + this.nCoffeeOunces + ", Sugar Packets: " + this.nSugarPackets + ", Creams: " + this.nCreams + ", Cups: " + this.nCups +"\n");
    }

    //main
    public static void main(String[] args) {
        Cafe myCafe = new Cafe("Woodstar Cafe", "Northampton", 1, 40, 5, 6, 7);
        System.out.println(myCafe);
        myCafe.sellCoffee(10, 1, 1);
        myCafe.restock(100,10,10,10);
    }
}
