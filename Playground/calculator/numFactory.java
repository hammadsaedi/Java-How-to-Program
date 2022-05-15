package calculator;

import java.util.*;

/**
 * <h3>Number System Conversion</h3>
 * Hexadecimal, Decimal, Octal and Binary Number System, respectively.
 * (UnSigned Integer Support Only)
 * @author Hammad Saeedi (@hammadsaedi  everywhere)
 * @version 2.0
*/

public class numFactory {

    /**
     * Main Method
     * <p>For Testing Program</p>
    */
    public static void main(String[] args) {
        // System.out.println(Arrays.toString(byteModeConversion("-7", 1)));
        // System.out.println(Arrays.toString(longModeConversion("11111111111111111111111111111001", 3)));
        // System.out.println(Arrays.toString(shortModeConversion("fffffff9", 5)));
        // System.out.println(Arrays.toString(shortModeConversion("70", 2)));

        // System.out.println(Arrays.toString(intModeConversion("16")));
        // System.out.println(Arrays.toString(intModeConversion("16f")));

        
        // System.out.println(hexToDecimal("FF01", true));
        // System.out.println(binaryToDecimal("0101", true));
        // System.out.println(decimalToBinary("-11"));

        // System.out.println(Integer.parseInt("-10", 2));

        // System.out.println(Integer.toBinaryString(-2));
        // System.out.println(decimalToBinary("-2"));

        // System.out.println(hexComplement("F2"));
        // System.out.println(decimalComplement("1"));
        // System.out.println(octalComplement(octalComplement("7")));
        // System.out.println(binaryComplement(binaryComplement("1011", 2),2));

        // long abs = -922337203685;
        // System.out.println(Math.abs(abs));

        // System.out.println(Integer.parseInt(s, beginIndex, endIndex, radix));


    }
    
    /**
     * For Byte Data Type
     * @param NUM HEX or DEC or OCT or BIN String
     * @param type 0, 1, 2, 3 for HEX, DEC, OCT, BIN respectively; in case of wrong type selection, method will consider HEX.
     * @return String[] which contains HEX, DEC, OCT, BIN and Error Message (in case of wrong data type selection)
     * @since 1.0
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
     * @since 1.0
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
     * @since 1.0
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
     * @since 1.0
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
     * @since 1.0
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
     * Converts Signed Hexadecimal Number into Decimal Number
     * <p>While passing Hexadecimal Number String, make sure the type of number, Is it's positive or negative?</p>
     * @param HEX Hexadecimal Number String which has to be converted into decimal
     * @param negative Boolean Type indication for negative form (true if number is in negative form)
     * @return Long type number converted from Hexadecimal to Decimal form
     * @since 2.0
    */
    public static long hexToDecimal(String HEX, boolean negative){
        // decimal number
        long number;

        // Number Conversion
        if (negative) { // number is in negative form
            // converting hexadecimal into decimal number
            number = Long.parseLong(HEX, 16);

            // converting into Binary Number
            String BIN = Long.toBinaryString(number);

            // Now converting binary into decimal number
            number = binaryToDecimal(BIN, true); // true as number is negative
        } else {
            // converting hexadecimal into decimal number
            number = Long.parseLong(HEX, 16);
        }

        // returning number converted from Hexadecimal to Decimal form
        return number;
    }

    /**
     * Converts Signed Octal Number into Decimal Number
     * <p>While passing Octal Number String, make sure the type of number, Is it's positive or negative?</p>
     * @param OCT Octal Number String which has to be converted into decimal 
     * @param negative Boolean Type indication for negative form. (true if number is in negative form).
     * @return Long type number converted from Octal to Decimal form
     * @since 2.0
    */
    public static long octalToDecimal(String OCT, boolean negative){ 
        // decimal number
        long number;

        // Number Conversion
        if (negative) { // number is in negative form
            // converting octal into decimal number
            number = Long.parseLong(OCT, 8);

            // converting into Binary Number
            String BIN = Long.toBinaryString(number);

            // Now converting binary into decimal number
            number = binaryToDecimal(BIN, true); // true as number is negative
        } else {
            // converting octal into decimal number
            number = Long.parseLong(OCT, 16);
        }

        // returning number converted from Hexadecimal to Decimal form
        return number;
    }

    /**
     * Converts Signed Binary Number into Decimal Number
     * <p>While passing Binary Number String, make sure the type of number, Is it's positive or negative?</p>
     * @param BIN Binary Number String which has to be converted into decimal 
     * @param negative Boolean Type indication for negative form. (true if number is in negative form).
     * @return Long type number converted from Binary to Decimal form
     * @since 2.0
    */
    public static long binaryToDecimal(String BIN, boolean negative){
        // decimal number
        long number;

        // Number conversion
        if (negative){ // if number is in negative form
            // Taking 1's complement of Binary Number (Changing the sign)
            String binComplement = BIN.replace('0', 'X').replace('1', '0').replace('X', '1'); // (make 1's to 0's and vice versa)

            // Converting Binary Number into Decimal Number
            number = Long.parseLong(binComplement, 2);

            // Adding 1 (Otherwise does not works according to windows calculator)
            number += 1;

            // Now, Lets Change sign again; As already done in 1's complement
            number *= -1;
        } else {
            // Converting Binary Number into Decimal Number
            number = Long.parseLong(BIN, 2);
        }
        
        // returning number converted from Binary to Decimal form
        return number;
    }

    // if number is greater than Long Bound?
    /**
     *  @since 2.0
    */ 
    public static String decimalToBinary(String DEC){
        // binary number string
        String BIN;
        // Converting String into Long Number
        long number = Long.parseLong(DEC);

        // Number conversion
        if (DEC.contains("-")){ // if number is negative
            // Changing sign of number
            number = Math.abs(number);

            // converting decimal number into binary
            BIN = Long.toBinaryString(number);

            // Now, Lets Change sign again;
            // Taking 1's complement of Binary Number (Changing the sign)
            BIN = BIN.replace('0', 'X').replace('1', '0').replace('X', '1'); // (make 1's to 0's and vice versa)

            // Adding 1 (Otherwise does not works according to windows calculator)
            BIN = Long.toBinaryString(Long.parseLong(BIN, 2) + 1);
        } else {
            // converting decimal number into binary
            BIN = Long.toBinaryString(number);
        }

        // returning binary number
        return BIN;

    }

    /**
     *  @since 2.0
    */ 
    // Hexadecimal Complement
    public static String hexComplement(String HEX){
        long number;
        String BIN;

        // HEX to BIN
        number = Long.parseLong(HEX, 16);
        BIN = Long.toBinaryString(number);

        // Taking complement
        BIN = binaryComplement(BIN, 2);

        // BIN to OCT
        number = Long.parseLong(BIN, 2);
        HEX = Long.toHexString(number);
        
        return HEX;
    }

    /**
     *  @since 2.0
    */ 
    // Decimal Complement
    public static String decimalComplement(String DEC){ 
        return Long.toString(Long.parseLong(DEC) * -1);
    }

    /**
     *  @since 2.0
    */ 
    // Octal Complement
    public static String octalComplement(String OCT){
        long number;
        String BIN;

        // OCT to BIN
        number = Long.parseLong(OCT, 8);
        BIN = Long.toBinaryString(number);

        // Taking complement
        BIN = binaryComplement(BIN, 2);

        // BIN to OCT
        number = Long.parseLong(BIN, 2);
        OCT = Long.toOctalString(number);

        return OCT;
    }

    /**
     *  @since 2.0
    */ 
    // Binary 2's Complement
    public static String binaryComplement(String BIN, int complement){
        // Taking 1's complement of Binary Number (Changing the sign)
        // (make 1's to 0's and vice versa)
        BIN = BIN.replace('0', 'X');
        BIN = BIN.replace('1', '0');
        BIN = BIN.replace('X', '1'); 

        // Taking 2's complement 
        // (Adding 1 in 1's complement form)
        BIN = binaryAddition(BIN, Long.toBinaryString(complement - 1));

        // returning binary string in 2's complement form
        return BIN;
    }


     /**
     *  @since 2.0
    */ 
    // Binary Additions
    public static String binaryAddition(String BIN1, String BIN2) {
        // If BIN String is empty
        if (BIN1 == null || BIN2 == null){
            return "";
        }
        
        int first = BIN1.length() - 1;
        int second = BIN2.length() - 1;

        StringBuilder sb = new StringBuilder();

        int carry = 0;
        
        while (first >= 0 || second >= 0) {
            int sum = carry;
            if (first >= 0) {
                sum += BIN1.charAt(first) - '0';
                first--;
            }
            if (second >= 0) {
                sum += BIN2.charAt(second) - '0';
                second--;
            }
            carry = sum >> 1;
            sum = sum & 1;
            sb.append(sum == 0 ? '0' : '1');
        }
        if (carry > 0)
            sb.append('1');
    
        sb.reverse();
        return String.valueOf(sb);
    }

}