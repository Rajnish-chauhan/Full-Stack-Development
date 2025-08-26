import java.util.Scanner;
public class TakingInputFromUser {
    public static void main(String[]args){
        System.out.println("Enter only Number...");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Input is : "+a);
    }
}
