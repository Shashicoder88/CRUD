import java.util.*;
public class AddMethodExample3 {
    public static void main(String args[]) {
        //Declaration of ArrayList of Mobile objects
        ArrayList<Mobile> mobiles = new ArrayList<>(); 
 
        //Example of add method for ArrayList of Mobile objects
        mobiles.add(new Mobile("Apple","iPhone"));
        mobiles.add(new Mobile("Samsung","Galaxy S"));
        mobiles.add(new Mobile("Xiaomi","Note Pro"));
        // Displaying Mobile company and model
        for(Mobile mobile: mobiles) {
            mobile.printMobiles();
        }
    }
}
class Mobile {
    public String company;
    public String model;
    // Constructor
    public Mobile(String company, String model) {
        this.company = company;
        this.model = model;
    }
    
    public void printMobiles() {
        System.out.println(company + " produces " + model);
    }
}