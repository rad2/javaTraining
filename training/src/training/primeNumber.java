package training;

import java.util.Scanner;

public class primeNumber{
    
    public static void main(String[] args){
        
        Scanner sc  = new Scanner(System.in);
        
        System.out.println("Enter a numner: ");
        
        int number = sc.nextInt();
        int j =2;
        
        while( number >= 1 || number <=1000){
            System.out.println("Enter a number greater or equal to 1 OR less or equal to 1000.");
            if(number%j !=0){
                System.out.println(number + "is a prime number.");
            }else{
                System.out.println(number + "is not a prime number.");
            }
            
        }
        sc.close();
    }
}
