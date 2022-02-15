import java.util.Arrays;
import java.util.Scanner;

/**
 * assignment
 */
public class assignment {
public static void main(String[] args) {
    // Q-- Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

    // int positive_even = 0 ;
    // int negative = 0;
    // int positive_odd = 0;
    // int number = 0;
    // Scanner in= new Scanner(System.in);
    // while (true) {
    //     System.out.print("Please enter numbers: ");
    //     number = in.nextInt(); 
      
    //     if (number > 0) {
    //         if (number % 2 == 0) {
    //             positive_even =+ number;
    //         } else {
    //           positive_odd =+ number;   
    //         }
    //     }
    //     else {negative =+ number;}
    //     if (number == 0) {
    //         System.out.println("Negative Sum " + negative + " Even sum " + positive_even + " Odd Sum " + positive_odd);
    //         break;
    //     }

        //Q-- Find if a number is palindrome or not
        Scanner in= new Scanner(System.in);
        System.out.print("Please enter numbers: ");
       int  number = in.nextInt();
       int  newnum = number;

       while (number != 0) {
          int  rev = number % 10 + rev * 10;
           number /= 10;
       }
       System.out.println((rev == newnum ) ?  "is a palindrome " : "is not a palindrome " );
     } 
}
