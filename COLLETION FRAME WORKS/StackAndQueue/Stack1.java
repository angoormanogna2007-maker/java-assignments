package StackAndQueue;
import java.util.Stack;
 
public class Stack1 {
    public static void main(String[] args){
        Stack<Integer> Rollno = new Stack<>();
 
   
        Rollno.push(10);
        Rollno.push(11);
        Rollno.push(12);
        Rollno.push(13);
 
 
        System.out.println("Rollnos:" + Rollno);
        System.out.println("Remove:" + Rollno.pop());
        System.out.println(Rollno);
        System.out.println("Top element:" + Rollno.peek());
        System.out.println(Rollno);
 
        System.out.println(Rollno.search(11));
        System.out.println(Rollno.isEmpty());
        System.out.println("Size: " + Rollno.size());
        System.out.println(Rollno);
    }
}
 
 
 