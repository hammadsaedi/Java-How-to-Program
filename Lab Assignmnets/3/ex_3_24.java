// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 28 March, 2022 8:14 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

// Import the Scanner class
import java.util.Scanner;

public class ex_3_24 {
    public static void main(String[] args) {
        // Variable Decalration
        int result;

        // Scanner Object
        Scanner input = new Scanner(System.in);

        // While True
        while(true) {
            // Taking Input
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            result = input.nextInt();

            // Checking Input
            if(result == 1) {
                System.out.print("Pass");
                break;
            } else if(result == 2) {
                System.out.print("Fail");
                break;
            }
        }
        
        // Closing Scanner
        input.close();
       
   }    
} 
