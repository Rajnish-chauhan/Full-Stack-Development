package service;

import entity.Invoice;

import java.sql.SQLException;
import java.util.List;

public class BillingService {

    public CustomerService customerService = new CustomerService();

    public InvoiceService invoiceService = new InvoiceService();

    public void createInvoice(int customer_id, int vehicleId, List<Integer> servicesIds) throws SQLException {
        for (int serviceId : servicesIds) {
            invoiceService.addInvoice(new Invoice(0, customer_id, vehicleId, serviceId));
        }
        System.out.println("Invoice Generated Successfully...");
    }

    public void showAllInvoices() throws SQLException
{
    List<Invoice> invoices=invoiceService.getAllInvoices();
    for(Invoice invoice:invoices){
        System.out.println(invoice);
    }
}
}
