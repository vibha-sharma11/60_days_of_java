import java.util.Scanner;

/**
 * questions
 */
public class questions {
    public static void main(String[] args) {
        // Q-- Reverse A String In Java

        // Scanner in = new Scanner(System.in);
        // System.out.print("Please enter the word you want to be reversed: ");
        // String word = in.next();
        // String rev = "";
        // int i = word.length();
        // while (i > 0) {
        // rev = "" + word.charAt(i-1);
        // i--;
        // System.out.println("" + rev);
        // }

        // Q-- HCF Of Two Numbers Program

        // Scanner in = new Scanner(System.in);
        // System.out.println("Please enter two numbers:");
        // int num1 = in.nextInt();
        // int num2 = in.nextInt();
        // int factor = 2;
        // int max = 2;
        // while (num1 >= 2 && num2 >= 2) {
        // if (num1 % factor == 0 && num2 % factor == 0) {
        // if (factor > max ) {
        // max = factor;
        // }
        // factor++;
        // }else{factor++;}

        // System.out.println(max);
        // }
        // in.close();
        //Q-- Abir is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your month: ");
        String month = in.next();
        switch (in.next()){  
           
            case january, march, may, july, september, november -> System.out.println("15 even days ");
            case february -> System.out.println("14 even days ");
            case april, june, august, october, december -> System.out.println("15.5 even days ");
            in.close();
        }

    }
}
