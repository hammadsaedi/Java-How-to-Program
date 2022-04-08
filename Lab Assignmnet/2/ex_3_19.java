// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 28 March, 2022 8:14 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

// Import the Scanner class
import java.util.Scanner;

public class ex_3_19 {
    public static void main(String[] args) {
        // Delaration of variables
        double commission, earnings, gross_sales_in_the_week, sold_1_items, sold_2_items, sold_3_items, sold_4_items, weekly_salary =200;

        // Scanner Object
        Scanner input = new Scanner(System.in);

        // First Item
        System.out.print("Enter the value of sold 1 items: ");
        sold_1_items = input.nextDouble();
        // Second Item
        System.out.print("Enter the value of sold 2 items: ");
        sold_2_items = input.nextDouble();
        // Third Item
        System.out.print("Enter the value of sold 3 items: ");
        sold_3_items = input.nextDouble();
        // Forth Item
        System.out.print("Enter the value of sold 4 items: ");
        sold_4_items = input.nextDouble();
        
        // Calculation
        // Sale per week
        gross_sales_in_the_week = sold_1_items*239.99 + sold_2_items*129.75 + sold_3_items*99.95 + sold_4_items*350.89;
        // Commission
        commission = gross_sales_in_the_week*0.09;
        // Earning
        earnings = weekly_salary + commission;
        
        // Displaying results
        System.out.println("Value of commission: " + commission);
        System.out.println("Value of earnings: " + earnings);
        System.out.println("Value of gross sales in the week: " + gross_sales_in_the_week);
        System.out.println("Value of weekly salary: " + weekly_salary);

    }

}