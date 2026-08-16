package Maps;
import java.util.LinkedHashMap;


public class LinkedHashMapp {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> Students=new LinkedHashMap<>();

        Students.put(1,"Rahul");
        Students.put(2, "Rohith");
        Students.put(3,"Revanth");
        Students.put(4,"Sneha");
        Students.put(5,"Priya");

        System.out.println("All students:" + Students);
        System.out.println(Students.get(1));
        System.out.println(Students.get(3));
        

        System.out.println("keys:"+Students.keySet());
        System.out.println("values:"+Students.values());

        System.out.println("remove:"+Students.remove(2));
        System.out.println("size:"+Students.size());

        System.out.println("contains key:"+Students.containsKey(1));
        System.out.println("contains value:"+Students.containsValue("priya"));
        System.out.println(Students.getOrDefault(3,"not found"));
        
        Students.replace(5, "Priya", "Pooja");
        System.out.println("After replace:" + Students);  

    }
}
    

