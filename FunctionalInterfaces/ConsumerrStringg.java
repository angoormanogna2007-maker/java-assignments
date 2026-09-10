package FunctionalInterfaces;
import java.util.function.Consumer;
public class ConsumerrStringg{
    public static void main(String[] args){
        Consumer<String> Printer = initial -> System.out.println("Initial: " + initial);
        Printer.accept("Angoor");
    }
    
}


