// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 28 March, 2022 8:14 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

package Assignmnets.No_3;

// Import the Scanner class
import java.util.Scanner;

public class ex_3_31 {
    public static void main(String[] args) {
        // Variable Decalration
        int num , length , remainder , rev = 0, n;

        // Scanner Object
        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a five digit number: ");
        num = input.nextInt();

        // Stroring before operation
        n = num;

        // Calculating lenght
        length = (int) (Math.log10(num)+1);


        // If Length is greater or less than 5
        while (length != 5) {
            // messege
            System.out.println("Sorry the input must be five digit number!!!");
            // Taking input
            System.out.print("Enter a five digit number:");
            num = input.nextInt();
            // Calculating length
            length = (int) (Math.log10(num)+1);
        }
        
        // reversing number by loop
        while(num > 0) {
            remainder = num % 10;
            rev = rev*10 + remainder;
            num = num / 10;
        }
        
        // Checking Condition
        if(rev == n){
            System.out.println(n + " is a palindrome");
        } else {
            System.out.println(n + " isn't a palindrome");
        }
            
        // Close Scanner
        input.close();
    }
    
}       

