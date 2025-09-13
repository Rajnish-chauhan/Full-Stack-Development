package Enum;
public class Test {
    enum Sum{
        SUNDAY,
        MONDAY
    }

    public static void main(String[] args) {
        enum Name {
            RAM,
            SHYAM
        }
        System.out.println(Sum.SUNDAY);
        System.out.println(Name.RAM.getClass());
        System.out.println(Sum.MONDAY);
    }
}
