package FunctionalInterfaces;
import java.util.function.Predicate;

public class Predicatee {

    public static void main(String[] args) {

        Predicate<Integer> iseligibleToVote = new Predicate<Integer>() {

            @Override
            public boolean test(Integer age) {
                return age >= 18;
            }
        };

        System.out.println(iseligibleToVote.test(20));  
    }
}