package StackQueue;
import java.util.Queue;
import java.util.LinkedList;
 
 
public class Queuee {
    public static void main(String[] args){
        Queue<String> names = new LinkedList<>();
 
        names.offer("Nivi");
        names.offer("Neha");
        names.offer("viya");
        names.add("pandu");
        names.offer("Laddu");
 
        System.out.println("names:" + names);
        System.out.println("Remove:" + names.poll());
        System.out.println("First element:" + names.peek());
 
        System.out.println(names.isEmpty());
        System.out.println("Size: " + names.size());
        System.out.println(names);
 
    }
}
