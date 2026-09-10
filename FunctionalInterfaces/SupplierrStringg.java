package FunctionalInterfaces;

import java.util.function.Supplier;

public class SupplierrStringg {
    public static void main(String[] args){
        Supplier<String> greeting = new Supplier<String>(){

            @Override 
            public String get(){
                return "Hello! Welcome to Modern Java!";
            }
        };
    
            System.out.println(greeting.get());

            }
        }
    



