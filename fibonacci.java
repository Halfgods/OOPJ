import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int terms = sc.nextInt();

        int a = 0, b = 1, count = 0;

        do {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            count++;
        } while (count < terms);
        System.out.println();
        sc.close();
    }
}
