package List;
import java.util.ArrayList;
import java.util.Collections;
 
public class ArrayListt {
    public static void main(String[] args){
 
        ArrayList<String> fruits= new ArrayList<>();
        fruits.add(0,"Mango");
        fruits.add(1,"Apple");
        fruits.add(2,"Orange");
        fruits.add(3,"Grapes");
        fruits.add(0,"Banana");
        fruits.add(4,"Papaya");
 
        System.out.println("Fruits: " + fruits);
        System.out.println(fruits.get(0));
        System.out.println(fruits.get(1));
        System.out.println(fruits.get(2));
        System.out.println(fruits.get(3));
        System.out.println(fruits.get(0));
        System.out.println(fruits.get(4));
        System.out.println(fruits);  
        System.out.println(fruits.contains("Orange"));
        System.out.println(fruits.isEmpty());    
        System.out.println("Size: " + fruits.size());  
   
        Collections.sort(fruits);
        System.out.println(fruits);
        fruits.clear();
        System.out.println(fruits);
        System.out.println(fruits.isEmpty());
    }
}
