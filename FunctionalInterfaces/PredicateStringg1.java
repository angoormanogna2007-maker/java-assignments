package FunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateStringg1 {

    public static void main(String[] args) {

        Predicate<String> checkString= name -> name.length() >= 5;
        System.out.println(checkString.test("Neha"));  //false
    }
}
