// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 28 March, 2022 8:14 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

// Import the Scanner class
import java.util.Scanner;

public class ex_4_16  {
    public static void main(String[] args) {
        // Variable Decalration
        byte choice;

        // Scanner Object
        Scanner input=new Scanner(System.in);

        for (int j = 1;j <6;j++){
            System.out.print("How much stars u want to print(1-30): ");
            choice = input.nextByte();
            if (choice > 0 && choice <= 29) {
                for (int i = 1; i <= choice; i++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                    System.out.println("Number must be between 1 and 30!!");
            }
         }

        // close input
        input.close();
   }    
} 
