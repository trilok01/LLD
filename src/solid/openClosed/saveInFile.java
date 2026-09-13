package solid.openClosed;

import solid.singleResponsibility.Invoice;
import solid.singleResponsibility.InvoiceDao;

public class saveInFile implements InvoiceDao {
    @Override
    public void saveInvoice(Invoice invoice) {
        // Logic to save the invoice to a file
        System.out.println("Invoice saved to file successfully.");
    }
}