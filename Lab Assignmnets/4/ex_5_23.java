// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 4 April, 2022 1:45 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**  
 * 5.23 (Palindrome Numbers) A positive integer is a palindrome if its value is the same after reversing the order of the digits in the number. For example, 12321 is a palindrome, but 12563 is not.
 * Write a method that determines whether a number is a palindrome. Use this method in an application that determines whether a number entered by the user is a palindrome or not and prints the
 * result to the console. 
*/

// Import the Scanner class
import java.util.Scanner;

public class ex_5_23 {
    // main method
    public static void main(String[] args) {
        // Variable declarations
        int number;
        boolean isPalindrome;

        // Scanner Object
        Scanner input = new Scanner(System.in); 
        
        // Banner
        System.out.println("Palindrome Numbers"); 

        // Taking Number Input
        System.out.print("Enter any Integer: ");
        number = input.nextInt(); 

        // Checking palindrome
        isPalindrome = isPalindrome(number);

        // displaying result
        if (isPalindrome){ // true case
            System.out.print("Number is Palindrome.");
        } else { // false case
            System.out.print("Number is not Palindrome.");
        }

        // closing scanner object
        input.close();
    }

    // method to check palindrome or not
    public static boolean isPalindrome(int number){
        // variable declaration
        boolean isPalindrome;
        int reversedNumber, actualNumber, digit;

        // Initialization
        actualNumber = number;
        reversedNumber = 0; // 'll fetch last digit and concatinate it to last number


        while (number != 0) {
            // get last digit from number
            digit = (number % 10);

            // Adding in reversing number
            reversedNumber = reversedNumber * 10 + digit;

            // remove the last digit from number
            number /= 10;
        }

        // Checking palindrome
        isPalindrome = (actualNumber == reversedNumber)?true:false;
        
        // retuning true if number is palindrome
        return isPalindrome;
    } 
}