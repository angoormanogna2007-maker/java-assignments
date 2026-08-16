package Sets;
import java.util.HashSet;
import java.util.List;
 
public class HashSet1 {
    public static void main(String[] args) {
       
        HashSet<String> vehicles= new HashSet<>();
       
        vehicles.add("Car");
        vehicles.add("Bike");
        vehicles.add("Bus");
        vehicles.add("Train");
        vehicles.remove("Bike");
        vehicles.add("Bus");
 
        System.out.println(vehicles);
        System.out.println(vehicles.size());
        System.out.println(vehicles.contains("Train"));
       
        //set operations
        HashSet<String> setA = new HashSet<>(List.of("Car", "Bike"));
        HashSet<String> setB = new HashSet<>(List.of("Bus", "Auto", "Car"));
        System.out.println(setA);
        System.out.println(setB);
 
        //Union - all vehicles from both sets
        HashSet<String> union = new HashSet<>(setA);
        union.addAll(setB);
        System.out.println(union);
    }
}
 
 