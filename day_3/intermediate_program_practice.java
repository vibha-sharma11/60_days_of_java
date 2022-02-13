import java.util.Scanner;

public class intermediate_program_practice {

  public static void main (String[] args) {
    // In this, I'm solving intermediate java programs 

    //Q--Factorial Program In Java
    System.out.println("Please enter a number: ");
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int factorial= 1;
    while (num > 0) { //using while loop as the no. of times loop will work is on input entered and we dont know no. 
        factorial = factorial * num;
        num = num - 1; 
    }
    System.out.println(factorial);

    //Q-- Calculate Average Of N Numbers
        int n,num,sum=0, i; 
         //create scanner object to obtain input from keyboard 
         Scanner input =new Scanner(System.in); 
         System.out.print("Enter How Many Numbers : ");//input 
         n =input.nextInt(); //read total numbers 
         System.out.print("Enter the Numbers :"); 
         for(i=1;i<=n; i++) 
             { 
                  num=input.nextInt(); //input number 
                  sum += num; 
             } 
          double average=(double)sum/n; 
          System.out.println("Average of " + n + " Numbers = " + average); 
       
       //Q-- Java Program Vowel Or Consonant 
       Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0); 
       if (ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'c') {
        System.out.println( ch + " is a vowel");
       } else {
        System.out.println( ch + " is a constant"); 
       }
       // Q-- Check Leap Year Or Not
       Scanner in = new Scanner(System.in);
       System.out.println("please enter your year: ");
       int year = in.nextInt();
       if (year % 4 == 0 && year % 25 ==0 && year % 50 ==0 && year % 100 == 0) {
           System.out.println(year + " is a leap year");
       } else {
        System.out.println(year + " is not a leap year");
       }
    }
    
}
    