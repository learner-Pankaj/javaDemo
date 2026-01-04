package javaDemo;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is Armstrong number.");
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while(temp!=0){
            temp /= 10;
            count++;
        }
        int num = n;
        int sum = 0;
        while(num!=0){
            int num1 = num%10;
            sum += Math.pow(num1, count);
            num /= 10; //123
        }
        System.out.println(sum);
        if(n==sum){
            System.out.println("Given number is Armstrong number.");
        }else{
            System.out.println("not an Armstrong number.");
        }
        sc.close();
    }
}
