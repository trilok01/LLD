package solid;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import solid.liskovSubstitution.Bicycle;
import solid.liskovSubstitution.Car;
import solid.liskovSubstitution.EngineVehicle;
import solid.liskovSubstitution.MotorCycle;
import solid.liskovSubstitution.Vehicle;
import solid.openClosed.saveInDB;
import solid.openClosed.saveInFile;
import solid.singleResponsibility.Invoice;
import solid.singleResponsibility.InvoiceDao;
import solid.singleResponsibility.InvoicePrinter;
import solid.singleResponsibility.Product;
import solid.singleResponsibility.TaxCalculator;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("P001", "Product A", 100.0);
        Timestamp invoiceDate = new Timestamp(System.currentTimeMillis());

        // Single Responsibility Principle demonstration
        TaxCalculator taxCalculator = new TaxCalculator();
        double tax = taxCalculator.calculateTax(product.getPrice());
        Invoice invoice = new Invoice("INV001", product.getPrice(), invoiceDate, tax);
        InvoicePrinter invoicePrinter = new InvoicePrinter();
        invoicePrinter.printInvoice(invoice);
        
        // Open/Closed Principle demonstration
        InvoiceDao invoiceDao = new saveInDB();
        invoiceDao.saveInvoice(invoice);
        invoiceDao = new saveInFile();
        invoiceDao.saveInvoice(invoice);

        // Liskov Substitution Principle demonstration
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Car());
        vehicleList.add(new MotorCycle());
        vehicleList.add(new Bicycle());

        List<EngineVehicle> engineVehicleList = new ArrayList<>();
        engineVehicleList.add(new Car());
        engineVehicleList.add(new MotorCycle());
        // engineVehicleList.add(new Bicycle());

        for(Vehicle vehicle : vehicleList) {
            System.out.println("Number of wheels: " + vehicle.getNumberOfWheels());
        }

        for(EngineVehicle engineVehicle : engineVehicleList) {
            System.out.println("Has engine: " + engineVehicle.hasEngine());
        }
    }
}