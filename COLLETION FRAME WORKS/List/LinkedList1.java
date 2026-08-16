package List;
import java.util.LinkedList;
import java.util.Collections;
 
public class LinkedList1 {
    public static void main(String[] args) {
 
        LinkedList<String> names = new LinkedList<>();
        names.add("pooja");
        names.add("Minny");
        names.add("Devi");
        System.out.println(names);
 
        names.addFirst("Spandhana");
        names.addLast("Akshaya");
        System.out.println("Afetr adding Names: " + names);
        System.out.println("size: " + names.size());
 
        names.removeFirst();
        names.removeLast();
        System.out.println("After removing Names: " + names);
        System.out.println("size: " + names.size());
 
        System.out.println(names.contains("Manogna"));  
 
       
        System.out.println(names);
        System.out.println(names.peek());
 
        System.out.println(names);
        System.out.println(names.poll());
        System.out.println(names);
 
        Collections.sort(names);
        System.out.println(names);
    }
}
 