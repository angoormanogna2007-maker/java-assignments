package Set;

import java.util.TreeSet;
 
public class TreeSett {
    public static void main(String[] args) {
 
        TreeSet<Integer> marks = new TreeSet<>();
 
        marks.add(93);
        marks.add(79);
        marks.add(65);
        marks.add(93); //IGNORED 
 
        System.out.println("Sorted order: " + marks); 
        System.out.println(marks.first()); 
        System.out.println(marks.last()); 
 
        //headSet -means Below value
        System.out.println(marks.headSet(95)); 

        //TailSet -Entered value and Above value
        System.out.println(marks.tailSet(70));
    }
}
 
 
