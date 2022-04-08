// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 28 March, 2022 8:14 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

// Import the Scanner class
import java.util.Scanner;

public class ex_3_23 {
    public static void main(String[] args) {
        // Variable Decalration
        int number, largest = 0, secondLargest = 0;

        // Scanner Object
        Scanner input=new Scanner(System.in);

        // 10 times iterations
        for (int i = 1; i <= 10; i++){
            // Taking Input
            System.out.print("Enter number: ");
            number = input.nextInt();

            // Checking condition
            if(number > largest) {
                secondLargest = largest; 
                largest = number;
            } else if(number > secondLargest){
                secondLargest = number;
            }
        }
        
        // Dispalying result
        System.out.println("Largest number is "+largest);
        System.out.println("Second largest number is "+secondLargest);

        // close input
        input.close();
   }    
} 
