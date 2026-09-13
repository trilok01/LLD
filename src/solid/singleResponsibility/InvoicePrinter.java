package solid.singleResponsibility;

public class InvoicePrinter {
    public void printInvoice(Invoice invoice) {
        System.out.println("Invoice Number: " + invoice.getInvoiceNumber());
        System.out.println("Amount: " + invoice.getAmount());
        System.out.println("Invoice Date: " + invoice.getInvoiceDate());
        System.out.println("Tax: " + invoice.getTax());
    }
}