package Queue;
import java.util.ArrayDeque; 
import java.util.Deque;

public class DequeIntt {
    public static void main(String[] args){
  
Deque<Integer> ages = new ArrayDeque<>(); 

ages.addFirst(19); 
ages.addFirst(17);   
ages.addLast(16); 
ages.addLast(20); 

System.out.println(ages);
System.out.println(ages.peekFirst()); 
System.out.println(ages.peekLast()); 

System.out.println(ages.removeFirst());  
System.out.println(ages.removeLast());  
System.out.println(ages); 
    }
}
