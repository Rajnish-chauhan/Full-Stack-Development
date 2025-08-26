import entity.Customer;
import service.BillingService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws SQLException {
        Scanner scanner=new Scanner(System.in);
        BillingService billingService=new BillingService();

        while(true){

            System.out.println("1. Add Customer \n2. Generate Invoice \n3. Show Invoice \n4.Exit ");
            int choice= scanner.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("Customer name:");
                    String name=scanner.nextLine();
                    System.out.print("phone");
                    String phone=scanner.nextLine();
                    service.CustomerService.addCustomer(new Customer(0,name,phone));
                    break;

                case 2:
                    System.out.print("Enter Customer Id");
                    int cid=scanner.nextInt();
                    System.out.print("Enter Vehicle Id");
                    int vid= scanner.nextInt();
                    System.out.print("Enter Number of Services:");
                    int n=scanner.nextInt();
                    List<Integer>sid=new ArrayList<>();
                    for (int i = 0; i < n; i++)
                    {
                        System.out.println("Enter service Id:");
                        sid.add(scanner.nextInt());
                    }
                    service.createInvoice(cid,vid,sid);
                    break;
                case 3:
                    service.showAllinvoices();

                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
