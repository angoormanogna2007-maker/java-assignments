package FunctionalInterfaces;
import java.util.function.Consumer;

public class ConsumerrDemo {
    public static void main(String[] args){
        Consumer<String> PrintMessage = new Consumer<String>(){

            @Override
            public void accept(String Message){
                System.out.println(Message);
            }

        };
        PrintMessage.accept("Hello, I am Manogna");
    }
    
}
