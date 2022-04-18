// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 12 April 2022 9:20 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**
 * Conditionals statement executes based on result which is mostly Boolean Data Type: (True or False); 
 * In Switch-Case Statement, Boolean Expression is not Valid. (Specifically Java, allowed in C - language) 
 * Any primitive data type concatenating with String result in String. (String +  Primitive-datatype = String)
 * Now, we can implement Boolean Expression in switch-case statement. (Finding Ranges of Numbers etc)  
 */

 // Import Scanner class
import java.util.Scanner;

public class booleanSwitch {
    public static Scanner input = new Scanner(System.in);
    // Main Method
    public static void main(String[] args){
        // Variable Declarations
        int number;

        // Taking User input
        System.out.print("Enter any Integer: ");
        number = input.nextInt();

        // Closing Scanner Object
        input.close();

        // Boolean Switch Statement
        switch(""+ (number % 2 == 0)){
            case "true":
                System.out.printf("%d is Even Number.", number);
                break;
            case "false":
                System.out.printf("%d is Odd Number.", number);
                break;
        }
    }
}
