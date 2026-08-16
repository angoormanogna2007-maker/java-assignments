package Sets;
import java.util.TreeSet;
 
public class TreeSet1 {
    public static void main(String[] args) {
 
        TreeSet<Integer> Marks = new TreeSet<>();
 
        Marks.add(93);
        Marks.add(69);
        Marks.add(75);
        Marks.add(93);  
        System.out.println("Sorted order: " + Marks); 
        System.out.println(Marks.first()); 
        System.out.println(Marks.last()); 
 
        //headSet -means Below value
        System.out.println(Marks.headSet(95)); 
        
        //TailSet -Entered value and Above value
        System.out.println(Marks.tailSet(70));
    }
}
 
 