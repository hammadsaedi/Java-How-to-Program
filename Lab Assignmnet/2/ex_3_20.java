// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 28 March, 2022 8:14 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)


// Import the Scanner class
import java.util.Scanner;

public class ex_3_20 {
  public static void main(String[] args) {
    String name;
    int earning;
    // Scanner Object
    Scanner input = new Scanner(System.in);
    
    // Tax Calculation for three citizens
    for (int i = 1; i <= 3; i++) { 
        // name of person
        System.out.print("Enter the name of the person: ");
        name = input.nextLine();

        // total earning
        System.out.print("Enter the total earning of the person: ");
        earning = input.nextInt();

        // Condition
        if (earning <= 30000) {
            System.out.println(name + " has to pay tax of " + earning * 15 / 100 + " Dollars");
        } else if (earning > 30000) {
        System.out.println(name+" has to pay tax of " + earning * 20 / 100 + " Dollars");
        }
    }

    // Closing Scanner Object
    input.close();
  } 
}