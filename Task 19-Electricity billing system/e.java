
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class e {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Customer> customers = new ArrayList<>();
        BillGenerator billGenerator = new BillGenerator();

        System.out.println("Welcome to the Electricity Billing System");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a new customer");
            System.out.println("2. Enter reading details for a customer");
            System.out.println("3. Generate bill for a customer");
            System.out.println("4. Generate bills for all customers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addNewCustomer(scanner, customers);
                    break;
                case 2:
                    enterReadingDetails(scanner, customers);
                    break;
                case 3:
                    generateBillForCustomer(scanner, customers, billGenerator);
                    break;
                case 4:
                    generateAllBills(customers, billGenerator);
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }

    public static void addNewCustomer(Scanner scanner, List<Customer> customers) {
        System.out.print("Enter customer name: ");
        String name = scanner.next();
        System.out.print("Enter customer ID: ");
        String id = scanner.next();
        customers.add(new Customer(name, id));
        System.out.println("Customer added successfully.");
    }

    public static void enterReadingDetails(Scanner scanner, List<Customer> customers) {
        System.out.print("Enter customer ID: ");
        String id = scanner.next();
        Customer customer = findCustomerById(customers, id);
        if (customer != null) {
            System.out.print("Enter reading details for customer " + customer.getName() + ": ");
            int unitsConsumed = scanner.nextInt();
            customer.setUnitsConsumed(unitsConsumed);
            System.out.println("Reading details entered successfully for customer " + customer.getName());
        } else {
            System.out.println("Customer not found.");
        }
    }

    public static void generateBillForCustomer(Scanner scanner, List<Customer> customers, BillGenerator billGenerator) {
        System.out.print("Enter customer ID: ");
        String id = scanner.next();
        Customer customer = findCustomerById(customers, id);
        if (customer != null) {
            double billAmount = billGenerator.generateBill(customer);
            System.out.println("Generated Bill for customer " + customer.getName() + ": $" + billAmount);
        } else {
            System.out.println("Customer not found.");
        }
    }

    public static void generateAllBills(List<Customer> customers, BillGenerator billGenerator) {
        System.out.println("Generating bills for all customers:");
        for (Customer customer : customers) {
            double billAmount = billGenerator.generateBill(customer);
            System.out.println("Customer: " + customer.getName() + ", Bill Amount: $" + billAmount);
        }
    }

    public static Customer findCustomerById(List<Customer> customers, String id) {
        for (Customer customer : customers) {
            if (customer.getId().equals(id)) {
                return customer;
            }
        }
        return null;
    }
}

class Customer {
    private String name;
    private String id;
    private int unitsConsumed;

    public Customer(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getUnitsConsumed() {
        return unitsConsumed;
    }

    public void setUnitsConsumed(int unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }
}

class BillGenerator {
    public double generateBill(Customer customer) {
        // Assuming tariff rates per unit
        double ratePerUnit = 1.20; // Example rate
        int unitsConsumed = customer.getUnitsConsumed();
        return unitsConsumed * ratePerUnit;
    }
}
