package FunctionalInterfaces;
import java.util.function.Predicate;

public class PredicateeStringg {

    public static void main(String[] args) {

        Predicate<String> checkString= new Predicate<String>() {

            @Override
            public boolean test(String name) {
                return name.length() >= 5;
            }
        };
        System.out.println(checkString.test("Manogna")); 
    }
}