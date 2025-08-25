import java.util.*;
public class array{
public static void main(String[] args){
    int a[] = new int[5];
    Scanner sc = new Scanner(System.in);
    for(int i = 0 ; i < 5 ; i++) {
        System.out.println("Enter a Number"+i+": ");
        a[i] = sc.nextInt();

    }
    System.out.println("All the values are stored.");
    System.out.println("Enter the value to find it out: ");
    int x = sc.nextInt();
    for(int i = 0; i<5; i++){
        if(x == a[i]){
            System.out.println("The value" + x + "was found in " + i);
        }
        else{
            System.out.println("The value wasn't found in array. ");
        }
    
}
}}