// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 28 March, 2022 8:14 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

// Import the Scanner class
import java.util.Scanner;

public class ex_3_34 {
    public static void main(String[] args) {
        // Variable Declaration
        int firstNum, number, sum = 0;
        
        // Scanner Object
        Scanner input = new Scanner(System.in);

        //Taking Input
        System.out.print("Enter Beginning Integer: ");
        firstNum = input.nextInt();

        // Reading numbers until a specified sum
        while(!(sum >= firstNum)) { 
            System.out.print("Enter any integer: ");
            number = input.nextInt();
            sum += number;
        }
        
        // Displaying result
        System.out.println(sum + " is greater than or equal to " + firstNum);

        // Close Scanner Object
        input.close();
    }
}