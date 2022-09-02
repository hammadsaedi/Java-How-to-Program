// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 28 March, 2022 8:14 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

package Assignmnets.No_3;

public class ex_4_20 {
    public static void main(String[] args) {
        // Variable Decalration
        double result = 0;
        int j = 1;
        int k = 1; //controls the if part for finding the term
        int term = 0; //variable for term that we're looking for

        
        for (int i = 1; i <= 200000; i += 1) {
            if ((i % 2) != 0) {
                result += (double) 4 / j; //positive part
                j += 2;
            } else {
                result -= (double) 4 / j; //negative part
                j += 2;
            }
            if (k != 0) {
                // Attempts to detect when result == 3.14159
                if (result > 3.14158 && result < 3.14160) {
                term = i;
                k = 0;
                }
            }
            System.out.printf("pi = %f\n", result);
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");
    }
    System.out.println("Terms at which pi has value 3.14159: " + term);
    }        
}   
