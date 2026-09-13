package solid.singleResponsibility;

import java.sql.Timestamp;

public class Invoice {
    private String invoiceNumber;
    private double amount;
    private Timestamp invoiceDate;
    private double tax;

    public Invoice(String invoiceNumber, double amount, Timestamp invoiceDate, double tax) {
        this.invoiceNumber = invoiceNumber;
        this.amount = amount;
        this.invoiceDate = invoiceDate;
        this.tax = tax;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public double getAmount() {
        return amount;
    }

    public Timestamp getInvoiceDate() {
        return invoiceDate;
    }

    public double getTax() {
        return tax;
    }
}