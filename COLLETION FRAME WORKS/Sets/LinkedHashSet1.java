package Sets;
import java.util.LinkedHashSet;
 
public class LinkedHashSet1{
    public static void main(String[] args) {
       
        LinkedHashSet<String> CarBrands= new LinkedHashSet<>();
        CarBrands.add("Toyota");
        CarBrands.add("BMW");
        CarBrands.add("Honda");
        CarBrands.add("Mahindra");
        CarBrands.add("Toyota");  // IGNORED
 
        System.out.println(CarBrands);  
        System.out.println(CarBrands.size()); //4
        System.out.println(CarBrands.contains("Honda"));  //true
    }
}
 
 
 