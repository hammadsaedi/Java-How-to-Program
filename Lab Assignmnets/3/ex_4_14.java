// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 28 March, 2022 8:14 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)


public class ex_4_14 {
    public static void main(String[] args) {
        // Initilization of variable
        double principal = 1000.0, rate = 0.05, amount;
        int year = 1;

        System.out.printf("%s%20s%n", "Year", " Amount on deposit");

        for (year = 1; year <= 10; ++year) {
            amount = principal * Math.pow(1.0 + rate, year); //calculates deposited amount for specified year
            System.out.printf("%4d%,20.2f%n", year, amount);
            for (rate = 0.06; rate <= 0.10; rate=rate+0.01) {
                amount = principal * Math.pow(1.0 + rate, year);
                System.out.printf("%4d%,20.2f%n", year, amount);
            }
        }    
    }
} 
