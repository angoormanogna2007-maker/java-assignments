package Queue;
import java.util.ArrayDeque;
import java.util.Deque;

 
public class DequeStringg {
    public static void main(String[] args) {
       
        Deque<String> subjects = new ArrayDeque<>();
 
        subjects.addFirst("Maths");
        subjects.addFirst("Physics");  
        subjects.addLast("ComputerScience");
        subjects.addLast("English");
 
        System.out.println(subjects);
        System.out.println(subjects.peekFirst());    
        System.out.println(subjects.peekLast());
        System.out.println(subjects.poll());
        System.out.println("After poll: "+ subjects);
    }
}
 
