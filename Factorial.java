package javaDemo;
import java.util.Scanner;;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get the factorial of that number");
        int n = sc.nextInt();
        int fact = 1;

        int i=1;
        while (n>=i) {
            fact = fact*i;
            i++;
        }
        System.out.println("Factorial of given number is :: "+fact);
        sc.close();
    }
}
