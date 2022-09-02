// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 28 March, 2022 4:41 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**
 * 2.33 (Body Mass Index Calculator) We introduced the body mass index (BMI) calculator in
 * Exercise 1.10. The formulas for calculating BMI are
 * BMI = (weightInPounds × 703) / (heightInInches x heightInInches)
 * or
 * BMI = weightInKilorams / heightInMeters x heightInMeters
 * Create a BMI calculator that reads the user’s weight in pounds and height in inches (or, if you prefer, the user’s weight in kilograms and height in meters), then calculates and displays the user’s
 * body mass index. Also, display the BMI categories and their values from the National Heart Lung
 * and Blood Institute 
 * http://www.nhlbi.nih.gov/health/educational/lose_wt/BMI/bmicalc.htm
 * so the user can evaluate his/her BMI
 * [Note: In this chapter, you learned to use the int type to represent whole numbers. The BMI
 * calculations when done with int values will both produce whole-number results. In Chapter 7
 * you’ll learn to use the double type to represent numbers with decimal points. When the BMI calculations are performed with doubles, they’ll both produce numbers with decimal points—these
 * are called “floating-point” numbers
*/

package Assignmnets.No_2;

// Import the Scanner class
import java.util.Scanner;

public class ex_2_33 {
    public static void main(String[] args){ 
        // Initialization of Variables
        int BMI, weightInKilorams, heightInMeters;

        // Scanner Object
        Scanner input = new Scanner(System.in);

        // For Taking User Input
        System.out.println("This Application calculates BMI and dsiplays corresponding result.");
        // Weight in Kilogram
        System.out.print("Enter weight in kilogram: ");
        weightInKilorams = input.nextInt();  
        //Height in Meters
        System.out.print("Enter height in meters: ");
        heightInMeters = input.nextInt(); 
        
        // Close Scanner Object
        input.close();
        
        // Calculating BMI
        BMI = weightInKilorams / (heightInMeters*heightInMeters);

        // Computing Catagory
        if (BMI < 18.5){ // Unde5rweight 
            System.out.printf("You are under weight. BMI: %d", BMI);
        } else if (BMI >= 18.5 && BMI <= 24.9){ // Normal weight 
            System.out.printf("You have normal weight. BMI: %d", BMI);
        } else if (BMI >= 25 && BMI <= 29.9) { // Over Weight
            System.out.printf("You are over weight. BMI: %d", BMI);
        } else if (BMI > 30){ // Obesity
            System.out.printf("You are having obesity. BMI: %d", BMI);
        }
    }
}