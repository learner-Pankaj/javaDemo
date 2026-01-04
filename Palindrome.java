package javaDemo;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int originalNum = n;
        int temp = 0;
        while(n>0){
            int n1 = n%10;
            n /= 10;
            temp = temp*10+n1;
        }
        if(originalNum == temp){
            System.out.println("Given number is Palindrome.");
        }else{
            System.out.println("Given number is not a Palindrome.");
        }
        sc.close();
    }
}