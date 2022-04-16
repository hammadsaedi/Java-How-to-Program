// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 16 April 2022 5:20 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/** 
 * 6.16 (Using the Enhanced for Statement) Write an application that uses an enhanced for statement to find the absolute values of int numbers passed by command-line arguments.
*/ 

// Importing Arrays class
import java.util.Arrays;

public class ex_6_16 {
    // main method
    public static void main(String[] args) {
        // Variable declarations
        int number, absolute;

        // args is treated as array --> args[0] for first argument
        if (args.length > 0) { // Making sure there are arguments to compute average
            // Banner
            System.out.println("Using the Enhanced for Statement");

            // Using the Enhanced for Statement to iterate through command line arguments and displaying their absolute value
            for (String argument : args){
                try { // numeric method works on numeric arguments (integer), there can be a case, user pass non-numeric arguments. 
                    // Storing numeric argument in number
                    number =  Integer.parseDouble(argument);
                    // Calculating absolute value
                    absolute = Math.abs(number);
                    // Displaying result
                    System.out.printf("Number: %d%nAbsolute Value: %d%n%n",number, absolute);
                } catch (NumberFormatException e) { // Handle run time error if arguments are non-numeric
                    System.out.printf("Error: %s%nOnly numeric arguments can be used for numeric operations.%n%n",e);
                }
            }
        } else { // if no argument is passed
            System.out.println("Error: Please enter the entire command while running java program.");
        }        
    }
}