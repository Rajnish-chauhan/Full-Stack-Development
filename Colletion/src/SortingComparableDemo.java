import java.util.ArrayList;
import java.util.Collections;

public class SortingComparableDemo {
    public static void main(String[] args) {
        ArrayList<Integer>Al=new ArrayList<>();
        Al.add(10);
        Al.add(5);
        Al.add(80);
        Al.add(25);
        Al.add(38);
        Al.add(1);
        System.out.println(Al);
        Collections.sort(Al);
        System.out.println(Al);
    }
}
