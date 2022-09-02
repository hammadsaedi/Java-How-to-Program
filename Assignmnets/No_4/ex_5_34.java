// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 6 April, 2022 9:48 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**   
 * 5.34 (Table of Binary, Octal and Hexadecimal Numbers) Write an application that displays a
 * table of the binary, octal and hexadecimal equivalents of the decimal numbers in the range 1
 * through 256. If you aren’t familiar with these number systems, read online Appendix J first.
*/

package Assignmnets.No_4;

public class ex_5_34 {
    // main method
    public static void main(String[] args) {
        // Variable declarations
        String binary, octal, hexadecimal;
        int decimal;
        
        // Banner
        System.out.println("Table of Binary, Octal and Hexadecimal Numbers"); 

        // Header
        System.out.printf( "%-8s%-12s%-8s%-8s\n", "Decimal", "Binary", "Octal", "Hexadecimal");

        // Looping through 1 - 256 decimal number
        for (decimal = 1; decimal <= 256; decimal++){

            // Conversions
            binary = binary(decimal);
            octal = octal(decimal);
            hexadecimal = hexadecimal(decimal);

            // Displaying Converted Numbers
            System.out.printf( "%-8d%-12s%-8s%-8s\n", decimal, binary, octal, hexadecimal );

        }
    }

    // method to convert decimals to binary
    public static String binary(int decimal) {
        // variable declarations
        String binary = "";
        int value;

        // Convertion
        while(decimal >= 1) { // 'll terminate when 1 is left
            value = decimal % 2; 
            binary = value + binary; // concatinate value to bianry
            decimal /= 2;
        }

        // retuning binary
        return binary;
    }

        // method to convert decimals to octal
        public static String octal(int decimal) {
            // variable declarations
            String octal = "";
            int value;
    
            // Convertion
            while(decimal >= 1) { // 'll terminate when 1 is left
                value = decimal % 8; // octal -- 8
                octal = value + octal; // concatinate value to bianry
                decimal /= 8;
            }
    
            // retuning octal
            return octal;
        }

        // method to convert decimals to octal
        public static String hexadecimal(int decimal) {
            // variable declarations
            String hexadecimal = "";
            int value;
    
            // Convertion
            while(decimal >= 1) { // 'll terminate when 1 is left
                value = decimal % 16; // octal -- 8
                switch (value){ // 10 - 15 are represented as A to F
                    case 10:
                        hexadecimal = "A" + hexadecimal;
                        break;
                    case 11:
                        hexadecimal = "B" + hexadecimal;
                        break;
                    case 12:
                        hexadecimal = "C" + hexadecimal;
                        break;
                    case 13:
                        hexadecimal = "D" + hexadecimal;
                        break;
                    case 14:
                        hexadecimal = "E" + hexadecimal;
                        break;
                    case 15:
                        hexadecimal = "F" + hexadecimal;
                        break;
                    default:
                        hexadecimal = value + hexadecimal;
                }
                decimal /= 8;
            }
    
            // retuning hexadecimal
            return hexadecimal;
        }
}