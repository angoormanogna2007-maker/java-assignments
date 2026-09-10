package FunctionalInterfaces;
import java.util.function.Consumer;
public class ConsumerrInt {
    public static void main(String[] args){
        Consumer<Integer> Printer = num -> System.out.println("Number: " + num);
        Printer.accept(22);
    }
    
}
