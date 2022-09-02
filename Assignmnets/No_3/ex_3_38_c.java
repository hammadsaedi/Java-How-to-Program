// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 28 March, 2022 8:14 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

package Assignmnets.No_3;

// Import the Scanner class
import java.util.Scanner;

public class ex_3_38_c  {
    public static void main(String[] args) {
        // Variable Decalration
        int number, factorial = 1,x;
        double e = 0.0, pow = 1;

        // Scanner Object
        Scanner input=new Scanner(System.in);

        // Taking input
        System.out.print("Enter value of x: ");
        x = input.nextInt();
        System.out.print("Enter number of terms: ");
        number = input.nextInt();

        // Calculation
        for(int i = 0; i < number; i++){
            e += pow / factorial;
            factorial = factorial * (i + 1); //n! * (n+1) (n+1)!
            pow = pow * x; //power of x increases by one for each term
        }

        // Displaying result
        System.out.printf("The estimate of e^x is %f .", e+1);

        // close input
        input.close();
   }    
} 
