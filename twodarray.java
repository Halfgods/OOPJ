import java.util.*;
public class twodarray{
public static void main(String[] args){
    int a[][] = new int[3][3];
    int b[][]= new int [3][3];
    int c[][] = new int [3][3];
    Scanner sc = new Scanner(System.in);
    
    for(int i = 0 ; i < 3 ; i++) {
        for (int j = 0; j <3 ; j++){
        System.out.println("Enter a Number"+i+","+j+": ");
        a[i][j] = sc.nextInt();

    }}

    for(int i = 0 ; i < 3 ; i++) {
        for (int j = 0; j <3 ; j++){
        System.out.println("Enter a Number"+i+","+j+": ");
        b[i][j] = sc.nextInt();

    }}
    for(int i = 0 ; i < 3 ; i++) {
        for (int j = 0; j <3 ; j++){
        c[i][j] = a[i][j] + b[i][j];
    }}
    for(int i = 0 ; i < 3 ; i++) {
        for (int j = 0; j <3 ; j++){
        System.out.print(c[i][j],"\t");

    }System.out.println();}
    
}
}