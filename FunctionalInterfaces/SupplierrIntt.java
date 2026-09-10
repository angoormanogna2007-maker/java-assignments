package FunctionalInterfaces;
import java.util.function.Supplier;

public class SupplierrIntt {
    public static void main(String[] args){
        Supplier<Integer> lucky_Number = new Supplier<Integer>(){

            @Override 
            public Integer get(){
                return 5; 
            }
        };
    
            System.out.println(lucky_Number.get());

            }
        }
    



    



