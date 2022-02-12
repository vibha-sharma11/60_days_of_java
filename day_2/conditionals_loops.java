

public class conditionals_loops {
    public static void main(String[] args, int i) {

    // conditionals 
    // 1. if-else statement

        int salary = 25000;
        if (salary > 20000) {
            salary += 2000;
        }
        else if (salary == 20000){
            salary += 1500;

        }
        else {
            salary += 1000;
        }
        System.out.println(salary);
     
    // Loops
    // 2. for loop(initialisation,condition,increment/decrement)

    // print numbers from 1 to 5
    for (int i = 1; i <= 5; i+= 1) {
        System.out.println(i);
    }

    // 3. while loop

    // print numbers from 1 to 5
    int num = 1;
    while (num <= 5){
        System.out.println(num);
        num++;
    }

    // use while loop when i dont know the loop numbers otherwise go for for loop 

    // 4. do while loop

    int n = 1;
    do {
        System.out.println(n);
        n++;

    } while (n <= 5);
    
        
    }
    
} 