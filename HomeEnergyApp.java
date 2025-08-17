import java.util.*;

abstract class Appliance {
    protected double powerRating;
    protected double usageHours;

    public Appliance(double powerRating, double usageHours) {
        this.powerRating = powerRating;
        this.usageHours = usageHours;
    }

    public abstract double calculateEnergyConsumption();
}

class Refrigerator extends Appliance {
    public Refrigerator(double powerRating, double usageHours) {
        super(powerRating, usageHours);
    }
    public double calculateEnergyConsumption() {
        return powerRating * usageHours;
    }
}

class WashingMachine extends Appliance {
    public WashingMachine(double powerRating, double usageHours) {
        super(powerRating, usageHours);
    }
    public double calculateEnergyConsumption() {
        return powerRating * usageHours;
    }
}

class AirConditioner extends Appliance {
    public AirConditioner(double powerRating, double usageHours) {
        super(powerRating, usageHours);
    }
    public double calculateEnergyConsumption() {
        return powerRating * usageHours;
    }
}

public class HomeEnergyApp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Appliance> appliances = new ArrayList<>();

        System.out.print("Enter number of appliances: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter type (1-Refrigerator, 2-WashingMachine, 3-AirConditioner): ");
            int type = sc.nextInt();
            System.out.print("Enter power rating (watts): ");
            double power = sc.nextDouble();
            System.out.print("Enter usage hours per day: ");
            double hours = sc.nextDouble();

            switch (type) {
                case 1: appliances.add(new Refrigerator(power, hours)); break;
                case 2: appliances.add(new WashingMachine(power, hours)); break;
                case 3: appliances.add(new AirConditioner(power, hours)); break;
            }
        }

        double total = 0;
        for (Appliance a : appliances) {
            total += a.calculateEnergyConsumption();
        }

        double carbonEmissions = total * 0.00082;
        System.out.println("Total energy consumption = " + total + " Wh");
        System.out.println("Estimated carbon emissions = " + carbonEmissions + " kg CO2");
    }
}
