package Queue;
import java.util.PriorityQueue;

public class PriorityQueueStringg {
    public static void main(String[] args) {
 
     PriorityQueue<String> cities= new PriorityQueue<>();
 
        cities.add("Bangalore");
        cities.add("Delhi");
        cities.add("Hyderabad");
        cities.add("Chennai");
    
 
        System.out.println("priority Queue: " + cities);
        System.out.println(cities.size());
        System.out.println(cities.peek());
        System.out.println(cities.poll());
        System.out.println("After poll: " + cities);
    }
}
