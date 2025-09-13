package optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Test {
    public static void main(String[]args){

        Optional<String> optional=getName(2);
        Optional<String> optional1= optional.map(x->x.toUpperCase());
        optional1.ifPresent(System.out::println);
    }
    private static Optional<String > getName(int id){
        return Optional.of("rony");
    }
}
