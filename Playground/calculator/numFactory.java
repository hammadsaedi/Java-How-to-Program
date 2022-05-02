package calculator;

import java.util.*;

/**
 * <h3>Number System Conversion</h3>
 * Hexadecimal, Decimal, Octal and Binary Number System, respectively.
 * (UnSigned Integer Support Only)
 * @author Hammad Saeedi (@hammadsaedi  everywhere)
 * @version 1.0
*/

public class numFactory {


    public static void main(String[] args) {

        // System.out.println(Arrays.toString(byteModeConversion("-7", 1)));
        // System.out.println(Arrays.toString(longModeConversion("11111111111111111111111111111001", 3)));
        // System.out.println(Arrays.toString(shortModeConversion("fffffff9", 5)));
        // System.out.println(Arrays.toString(shortModeConversion("70", 2)));

        // System.out.println(Arrays.toString(intModeConversion("16")));
        // System.out.println(Arrays.toString(intModeConversion("16f")));

        
        System.out.println(complements("fffffffe"));

    }
    
    /**
     * For Byte Data Type
     * @param NUM HEX or DEC or OCT or BIN String
     * @param type 0, 1, 2, 3 for HEX, DEC, OCT, BIN respectively; in case of wrong type selection, method will consider HEX.
     * @return String[] which contains HEX, DEC, OCT, BIN and Error Message (in case of wrong data type selection)
    */
    public static String[] byteModeConversion(String NUM, int type){
        // decimal in byte data type
        byte decimal;
        // // if number is negative or not
        // boolean isNegative = false;
        // Arrays to store Numbers (HEX, DEC, OCT, BIN)
        String[] numbers = new String[5]; 


        // // Checking for negative negative number
        // if (NUM.contains("-")){
        //     // if number is negative 
        //     isNegative = true;
        //     // replacing negative sign
        //     NUM = NUM.replace("-", "");
        //     System.out.println("Negative");
        // }

        // Converting into Decimal
        try {
            // byte decimal
            switch (type) {
                case 1: // for DEC type
                    decimal = Byte.parseByte(NUM);
                    break;
                case 2: // for OCT type
                    decimal = Byte.parseByte(NUM, 8);
                    break;
                case 3: // for BIN type
                    decimal = Byte.parseByte(NUM, 2);
                    break;
                default: // for HEX (Its default case, in case of wrong params, method will consider HEX)
                    decimal = Byte.parseByte(NUM,16);
            }
            /**
             * Byte Class has no method to convert decimal numbers to other number system
             * As, system has already tried to store text in Byte typed variable, if successfully stored then using higher data type's class has no problem.
            */
            
            // number conversion
            numbers = decimalConversion(decimal);

            // // if number was negative
            // if (isNegative){
            //     // negate each number string
            //     for (int i = 0; i < numbers.length; i++){
            //         numbers[i] = "-" + numbers[i];
            //     }
            // }
        } catch (java.lang.NumberFormatException e) { // In Case; system tried to store value in numeric variable
            // storing error message
            numbers[4] = "Wrong Data Type Selection";
            // displaying on console
            System.out.print("Wrong Data Type Selection");
        }

        // returning Numbers (HEX, DEC, OCT, BIN) and error message array
        return numbers;
    }


    /**
     * For Short Data Type
     * @param NUM HEX or DEC or OCT or BIN String
     * @param type 0, 1, 2, 3 for HEX, DEC, OCT, BIN respectively; in case of wrong type selection, method will consider HEX.
     * @return String[] which contains HEX, DEC, OCT, BIN and Error Message (in case of wrong data type selection) 
    */
    public static String[] shortModeConversion(String NUM, int type){
        // decimal in short data type
        short decimal;
        // Arrays to store Numbers (HEX, DEC, OCT, BIN)
        String[] numbers = new String[5]; 

        // Converting into Decimal
        try{
            // short decimal
            switch (type) {
                case 1: // for DEC type
                    decimal = Short.parseShort(NUM);
                    break;
                case 2: // for OCT type
                    decimal = Short.parseShort(NUM, 8);
                    break;
                case 3: // for BIN type
                    decimal = Short.parseShort(NUM, 2);
                    break;
                default: // for HEX (Its default case, in case of wrong params, method will consider HEX)
                    decimal = Short.parseShort(NUM,16);
            }

            /**
             * Short Class has no method to convert decimal numbers to other number system
             * As, system has already tried to store text in Short typed variable, if successfully stored then using higher data type's class has no problem.
            */
            
            // number conversion
            numbers = decimalConversion(decimal);

        } catch (java.lang.NumberFormatException e) { // In Case; system tried to store value in numeric variable
            // storing error message
            numbers[4] = "Wrong Data Type Selection";
            // displaying on console
            System.out.print("Wrong Data Type Selection");
        }

        // returning Numbers (HEX, DEC, OCT, BIN) and error message array
        return numbers;
    }
    

    /**
     * For Integer Data Type
     * @param NUM HEX or DEC or OCT or BIN String
     * @param type 0, 1, 2, 3 for HEX, DEC, OCT, BIN respectively; in case of wrong type selection, method will consider HEX.
     * @return String[] which contains HEX, DEC, OCT, BIN and Error Message (in case of wrong data type selection)
    */
    public static String[] intModeConversion(String NUM, int type){
        // decimal in integer data type
        int decimal;
        // Arrays to store Numbers (HEX, DEC, OCT, BIN)
        String[] numbers = new String[5]; 

        // Converting into Decimal
        try{
            // integer decimal
            switch (type) {
                case 1: // for DEC type
                    decimal = Integer.parseInt(NUM);
                    break;
                case 2: // for OCT type
                    decimal = Integer.parseInt(NUM, 8);
                    break;
                case 3: // for BIN type
                    decimal = Integer.parseInt(NUM, 2);
                    break;
                default: // for HEX (Its default case, in case of wrong params, method will consider HEX)
                    decimal = Integer.parseInt(NUM,16);
            }
            
            // number conversion
            numbers = decimalConversion(decimal);

        } catch (java.lang.NumberFormatException e) { // In Case; system tried to store value in numeric variable
            // storing error message
            numbers[4] = "Wrong Data Type Selection";
            // displaying on console
            System.out.print("Wrong Data Type Selection");
        }

        // returning Numbers (HEX, DEC, OCT, BIN) and error message array
        return numbers;
    }


    /**
     * For Long Data Type
     * @param NUM HEX or DEC or OCT or BIN String
     * @param type 0, 1, 2, 3 for HEX, DEC, OCT, BIN respectively; in case of wrong type selection, method will consider HEX.
     * @return String[] which contains HEX, DEC, OCT, BIN and Error Message (in case of wrong data type selection)
    */
    public static String[] longModeConversion(String NUM, int type){
        // decimal in short data type
        long decimal;
        // Arrays to store Numbers (HEX, DEC, OCT, BIN)
        String[] numbers = new String[5]; 

        // Converting into Decimal
        try{
            switch (type) {
                case 1: // for DEC type
                    decimal = Long.parseLong(NUM);
                    break;
                case 2: // for OCT type
                    decimal = Long.parseLong(NUM, 8);
                    break;
                case 3: // for BIN type
                    decimal = Long.parseLong(NUM, 2);
                    break;
                default: // for HEX (Its default case, in case of wrong params, method will consider HEX)
                    decimal = Long.parseLong(NUM,16);
            }
            
            // number conversion
            numbers = decimalConversion(decimal);

        } catch (java.lang.NumberFormatException e) { // In Case; system tried to store value in numeric variable (failed) 
            // storing error message
            numbers[4] = "Wrong Data Type Selection";
            // displaying on console
            System.out.print("Wrong Data Type Selection");
        }

        // returning Numbers (HEX, DEC, OCT, BIN) and error message array
        return numbers;
    }

    /**
     * Converts Decimal Number into Hexadecimal, Octal and Binary Numbers 
     * @param decimal Double Type Decimal Number which has to be converted
     * @return String[] Array of 5 Element which contains HEX, DEC, OCT, BIN
     */
    public static String[] decimalConversion(long decimal){
        // Arrays to store Numbers (HEX, DEC, OCT, BIN)
        String[] numbers = new String[5]; 

        // Converting into Hexadecimal String
        numbers[0] = Long.toHexString(decimal);

        // Converting into Decimal String
        numbers[1] = Long.toString(decimal);
    
        // Converting into Octal String
        numbers[2] = Long.toOctalString(decimal);

        // Converting into Binary String
        numbers[3] = Long.toBinaryString(decimal);
        
        // returning Numbers (HEX, DEC, OCT, BIN)
        return numbers;
    }


    /**
     * Converts Negative Hexadecimal Number into Binary
     * @param HEX Hexadecimal String to be converted into Binary Number String
     * @return Binary Number String (in Negative or 1's complement form)
     */
    public static int complements(String HEX){
        String hex = "FFF2";

        // First convert the Hex-number into a binary number:
        String bin = Integer.toString(Integer.parseInt(hex, 16), 2);

        // Now create the complement (make 1's to 0's and vice versa)
        String binCompl = bin.replace('0', 'X').replace('1', '0').replace('X', '1');


        // Now parse it back to an integer, add 1 and make it negative:
        int result = (Integer.parseInt(binCompl, 2) + 1) * -1;
        
        return result;
        // return (Integer.parseInt(Integer.toString(Integer.parseInt("F0BDC0", 16), 2).replace('0', 'X').replace('1', '0').replace('X', '1'), 2) + 1) * -1;
    }

    /**
     * Converts Negative Binary Number into Decimal Number
     * @param BIN Negative Binary Number String which has to be converted into 
     * @param sign Boolean Type
     * @return Long type number converted from Binary
     */
    public static long negativeBinaryConversion(String BIN, Boolean sign){
        // Taking 1's complement of Binary Number (Changing the sign)
        String binComplement = BIN.replace('0', 'X').replace('1', '0').replace('X', '1'); // (make 1's to 0's and vice versa)

        // Converting Binary Number into Decimal Number
        long number = Long.parseLong(binComplement, 2);

        // Now, Lets Change sign again; As already done in 1's complement
        number *= -1;

        return number;
    }
}