import java.util.ArrayList;
import java.util.Scanner;

class SimpleFoodDonationTracker {
    private ArrayList<String> foodTypes;
    private ArrayList<Double> foodQuantities;

    public SimpleFoodDonationTracker() {
        foodTypes = new ArrayList<>();
        foodQuantities = new ArrayList<>();
    }

    public void recordDonation(String foodType, double quantity) {
        if (quantity <= 0) {
            System.out.println("Donation quantity must be greater than zero.");
            return;
        }

        int index = foodTypes.indexOf(foodType);
        if (index >= 0) {
            double currentQuantity = foodQuantities.get(index);
            foodQuantities.set(index, currentQuantity + quantity);
            System.out.println("Updated donation for " + foodType + " with " + quantity + " kg.");
        } else {
            foodTypes.add(foodType);
            foodQuantities.add(quantity);
            System.out.println("Recorded " + quantity + " kg of " + foodType + " as a new entry.");
        }
    }

    public void viewDonationSummary() {
        if (foodTypes.isEmpty()) {
            System.out.println("No donations have been recorded yet.");
            return;
        }
        System.out.println("\n--- Donation Summary ---");
        for (int i = 0; i < foodTypes.size(); i++) {
            System.out.println(foodTypes.get(i) + ": " + foodQuantities.get(i) + " kg");
        }
    }

    public double getTotalDonations() {
        double total = 0.0;
        for (double quantity : foodQuantities) {
            total += quantity;
        }
        return total;
    }

    public void displayTotalDonations() {
        double total = getTotalDonations();
        System.out.println("\n--- Total Donations ---");
        System.out.println("Total quantity of all donations: " + total + " kg");
    }

    public void showMenu() {
        System.out.println("\n--- Food Donation Tracker Menu ---");
        System.out.println("1. Record a new donation");
        System.out.println("2. View donation summary");
        System.out.println("3. View total donations");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }
    
    public static void main(String[] args) {
        SimpleFoodDonationTracker tracker = new SimpleFoodDonationTracker();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            tracker.showMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter food type: ");
                    String foodType = scanner.nextLine();
                    System.out.print("Enter quantity (in kg): ");
                    double quantity = scanner.nextDouble();
                    scanner.nextLine();
                    tracker.recordDonation(foodType, quantity);
                    break;
                case 2:
                    tracker.viewDonationSummary();
                    break;
                case 3:
                    tracker.displayTotalDonations();
                    break;
                case 4:
                    System.out.println("Exiting application. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}