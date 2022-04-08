// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 3 April, 2022 4:50 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**  
 * 5.21 (Beautifying Strings) Write methods that accomplish each of the following tasks:
 * a) Check whether the string is terminated by a full stop, and if not, add a full stop.
 * b) Check whether the string starts with a capital letter, and if not, capitalize the first letter.
 * c) Use the methods developed in parts (a) and (b) and to write a method beautifyString
 * that receives a string from the user, and then calls the methods in (a) and (b) to make sure
 * that the string is properly formatted, in other words, the string has a full stop at the end,
 * and a capitalized first letter. Make sure you output the string after it has been beautified! 
*/

// Import the Scanner class
import java.util.Scanner;

public class ex_5_21 {
    // main method
    public static void main(String[] args) {
        // Variable declarations
        String aString;

        // Scanner Object
        Scanner input = new Scanner(System.in);          

        // Banner
        System.out.println("String Beautifier"); 

        // Taking String Input
        System.out.printf("Enter String: ");
        aString = input.nextLine();

        // closing scanner object
        input.close();

        // to Upper Case
        aString = toBeautify(aString);

        System.out.print(aString);        

        
    }

    // method to convert string into upper case
    public static String toUpperCase(String aString) {
        // variable declaration
        String upperCasedString;
        char firstCharacter;
        int stringLength, i;

        // Lenghth of String
        stringLength = aString.length();

        // first character
        firstCharacter = aString.charAt(0);

        // Capitalize
        if (firstCharacter >= 'a' && firstCharacter <= 'z'){
            firstCharacter -= 32; // ASCII Code Differece
        }

        // Upper Cased String (frist character only)
        upperCasedString = String.valueOf(firstCharacter); // string castings

        // Concatinating other characters to Upper Cased String
        for (i = 1; i < stringLength; i++){
            upperCasedString += aString.charAt(i); // From second to nth character
        }
        
        // retrun string to upper case
        return upperCasedString;
    }

    // method to display add full stop
    public static String toTerminate(String aString) {
        // variable declaration
        char lastCharacter;
        int stringLength;

        // Lenghth of String
        stringLength = aString.length();

        // Last character
        lastCharacter = aString.charAt(stringLength - 1);

        // Terminate String
        if (lastCharacter != '.' && lastCharacter != '?' && lastCharacter != '!'){
            aString += '.'; // concatinate at last
        }
        
        // retrun terminated string
        return aString;
    }

    // method to beautify string
    public static String toBeautify(String aString) {
        // Upper Case the string
        aString = toUpperCase(aString);
        aString = toTerminate(aString);

        // retrun beautified string
        return aString;
    }    
}

