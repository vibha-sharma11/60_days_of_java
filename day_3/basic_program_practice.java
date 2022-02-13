import java.util.Scanner;

public class practice {
public static void main(String[] args) {
    // Q-- Input a number and print all the factors of that number 

    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    int factors = 0 ;
    int divisor = 1;
    while(number >= divisor ){
        int temp_var = number % divisor;
        if (temp_var == 0) {
             System.out.println(divisor);
             divisor++;
        }
        else if(temp_var != 0){
            divisor ++;
        }  
    }
    // Q-- Take integer inputs till the user enters 0 and print the sum of all numbers

   int sum = 0;
   int num = 0;
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter numbers :");
    do{
        num = in.nextInt(); 
        sum = sum + num; 
    }
    while (num != 0);
    System.out.println("Sum = " + sum);

   // Take integer inputs till the user enters 0 and print the largest number from all.
   System.out.println("PLEASE ENTER NUMBERS:");
    int max = 0;
    int num;
    int small;
    Scanner in = new Scanner(System.in);
    do {
        num = in.nextInt();
        if (num > max) {
            int temp = num;
            max =+ temp;
        }
    } while (num  != 0);
    System.out.println(max);

    
}

}  

