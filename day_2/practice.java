import java.util.Scanner;

public class practice {
public static void main(String[] args) {
    
    //Q-- fabonacci series 

    // Scanner input = new Scanner(System.in);
    // int numbers = input.nextInt();
    // int a = 1;
    // int b = 2;
    // int c = 0;
    // while (numbers >= c) {
    //     int temp_var = b; //creating temporary variable to store value
    //     c = a + temp_var; 
    //     a = b; // reassigning values for further calculations
    //     b = c;
    //     System.out.println(c);
    // }

    // Q-- Subtract the Product and Sum of Digits of an Integer

    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    int num = 0;
    while (number != 0) {
        int reminder = number % 10; //to get the individual digits
        num = num + reminder;
        number= number/10;
        
    }
    System.out.println(num); 


}

}  
