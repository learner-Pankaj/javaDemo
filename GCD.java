package javaDemo;
import java.util.Scanner;
public class GCD{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int r=1;

        while(r!=0){
            r=n1%n2;
            n1 = n2;
            n2 = r;
        }
        System.out.println("GCD of two numbers is : "+ n1);
        sc.close();
    }
}