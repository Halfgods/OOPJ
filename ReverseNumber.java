import java.util.Scanner;

import java.util.*;

public class ReverseNumber {
    public static void main(String[]args){
        System.out.println("Enter a number to be reversed: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int rev = 0;

        if(n!=0){
            while(n!=0){
            rev = rev*10+n%10;
            n = n/10;
        }
        System.out.println(" The reversed number is : "+rev);
        }
        else{
            System.out.println("The number cannot be reversed!");
        }



    }
}