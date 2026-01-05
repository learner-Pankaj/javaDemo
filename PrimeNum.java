package javaDemo;
import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get the list of Prime number.");
        try{
            int n = sc.nextInt();
        
            if(n<=1){
                System.out.println("No Prime Numbers.");
                sc.close();
                return;
            }

            for(int i=2; i<=n; i++){
                boolean isPrime=true;
                for(int j=2; j<i/2; j++){
                    if(i%j==0){
                        isPrime = false;
                        break;
                    }   
                }
                if(isPrime){
                    System.out.print(i+", ");
                }
            }
            sc.close();
        }catch(Exception ex){
            System.out.println(ex);
            System.out.println("Enter a positive number only.");
        }
    }
}
