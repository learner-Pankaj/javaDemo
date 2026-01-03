package javaDemo;
import java.util.Scanner;
public class SwapNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.println("Enter two numbers to swap.");
        n1 = sc.nextInt(); //2
        n2 = sc.nextInt(); //4
        System.out.println("Before Swap :: n1="+n1+" n2="+n2);
        n1 = n1+n2; //6
        n2 = n1-n2; //2
        n1 = n1-n2; //4
        System.out.println("After Swap :: n1="+n1+" n2="+n2);
        sc.close();
    }
}
