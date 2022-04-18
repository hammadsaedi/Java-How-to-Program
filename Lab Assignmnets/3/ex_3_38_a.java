// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 28 March, 2022 8:14 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

// Import the Scanner class
import java.util.Scanner;

public class ex_3_38_a {
    public static void main(String[] args) {
        // Variable Decalration
        int number, factorial = 1, n;

        // Scanner Object
        Scanner input=new Scanner(System.in);

        // Taking input
        System.out.print("Enter number to calculate its factorial: ");
        number = input.nextInt();

        // Before Operation
        n = number;

        // Factorial Calculation
        while(number != 0) {
            factorial *= number;
            number -= 1;
        }

        // Displaying Results
        System.out.printf("The factorial of %d is %d.", n, factorial);

        // close input
        input.close();
   }    
} 
