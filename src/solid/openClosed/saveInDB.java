package solid.openClosed;

import solid.singleResponsibility.Invoice;
import solid.singleResponsibility.InvoiceDao;

public class saveInDB implements InvoiceDao {
    @Override
    public void saveInvoice(Invoice invoice) {
        // Logic to save the invoice to a database
        System.out.println("Invoice saved to database successfully.");
    }
}