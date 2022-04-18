// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 28 March, 2022 8:14 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

public class ex_4_18 {
    public static void main(String[] args) {
        // Variable Decalration
        int pennies = 100000, dollars, cents, amount, temp2;
        double rate = 0.05;
        
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        for (int year = 1; year <= 10; ++year) {
            amount = (int) ((pennies * Math.pow(1.0 + rate, year)) * 100);
            temp2 = amount;
            dollars = ((amount / 100) / 100);
            cents = ((temp2 / 100) % 100);
            // display each year
            System.out.printf("%4d%,16d.%02d%n", year, dollars, cents);
        }
        System.out.println("End of Program_4_18...");
    }        
}   
