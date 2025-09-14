/*public class Test {
    public static void main(String[] args) {
        System.out.println("Push check");
    }
}*/

//  Learn Enum With switch
enum Day
{
    MONDAY,
    FRIDAY,
    SUNDAY
}

public class Test {
    public static void main(String[] args) {
        Day today = Day.FRIDAY;

     /*switch (today) {
            case MONDAY ->
                    System.out.println("Start of the week");
            case FRIDAY ->
                    System.out.println("Almost weekend");
            case SUNDAY ->
                    System.out.println("Relax, it's Sunday!");
        }*/



        //              Here return the switch value and its explicitly put the break after the each


        String message=switch (today) {
            case MONDAY -> "Start of the week";
            case FRIDAY -> "Almost weekend";
            case SUNDAY -> "Relax, it's Sunday!";
        };
    }
}
