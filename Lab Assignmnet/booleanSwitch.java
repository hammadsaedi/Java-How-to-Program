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
