import java.util.Scanner;

public class Euclidean {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of dimensions for the vectors:");
        int n = scanner.nextInt();
        double[] p = new double[n];
        double[] q = new double[n];

        System.out.println("Enter the elements of vector P:");
        for (int i = 0; i < n; i++) {
            p[i] = scanner.nextDouble();
        }
        System.out.println("Enter the elements of vector Q:");
        for (int i = 0; i < n; i++) {
            q[i] = scanner.nextDouble();
        }
        double distance = calculateEuclideanDistance(p, q);
        System.out.println("The Euclidean distance between P and Q is: " + distance);

        scanner.close();
    }
    public static double calculateEuclideanDistance(double[] p, double[] q) {
        if (p.length != q.length) {
            throw new IllegalArgumentException("Vectors must have the same number of dimensions.");
        }
        double sumOfSquares = 0.0;
        for (int i = 0; i < p.length; i++) {
            double difference = p[i] - q[i];
            sumOfSquares += difference * difference;
        }
        return Math.sqrt(sumOfSquares);
    }
}