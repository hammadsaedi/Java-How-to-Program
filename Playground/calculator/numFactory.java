package calculator;

import java.util.*;

/**
 * UnSigned Integer Support Only
*/

public class numFactory {


    public static void main(String[] args) {

        // System.out.println(Arrays.toString(byteModeConversion("-7", 1)));
        // System.out.println(Arrays.toString(longModeConversion("11111111111111111111111111111001", 3)));
        // System.out.println(Arrays.toString(shortModeConversion("fffffff9", 5)));
        // System.out.println(Arrays.toString(shortModeConversion("70", 2)));

        // System.out.println(Arrays.toString(intModeConversion("16")));
        // System.out.println(Arrays.toString(intModeConversion("16f")));
    }
    
    /**
     * For Byte Data Type
     * @param NUM String HEX or DEC or OCT or BIN
     * @param type 0, 1, 2, 3 for HEX, DEC, OCT, BIN respectively;  in case of wrong params, method will consider HEX.
     * @return String[] contains HEX, DEC, OCT, BIN and Error Message
     * 
    */
    public static String[] byteModeConversion(String NUM, int type){
        // decimal in byte data type
        byte decimal;
        // Arrays to store Numbers (HEX, DEC, OCT, BIN)
        String[] numbers = new String[5]; 

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
             * As, system has already tried to store text in Byte typed variable, if successfully stored then using higher dat type's class has no problem.
             * (If text is no byte specified, it will stores exception)
            */
            
            // number conversion
            // Converting into Hexadecimal String
            numbers[0] = Integer.toHexString(decimal);

            // Converting into Decimal String
            numbers[1] = Integer.toString(decimal);
        
            // Converting into Octal String
            numbers[2] = Integer.toOctalString(decimal);
    
            // Converting into Binary String
            numbers[3] = Integer.toBinaryString(decimal);

        } catch (java.lang.NumberFormatException e) { // In Case; system tried to store value in numeric variable
            // storing error message
            numbers[4] = "Wrong Data Type Selection";
            // displaying on console
            System.out.print("Wrong Data Type Selection");
        }

        // returning Numbers (HEX, DEC, OCT, BIN) array
        return numbers;
    }


    /**
     * For Short Data Type
     * @param NUM String HEX or DEC or OCT or BIN
     * @param type 0, 1, 2, 3 for HEX, DEC, OCT, BIN respectively;  in case of wrong params, method will consider HEX.
     * @return String[] contains HEX, DEC, OCT, BIN and Error Message
     * 
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
             * As, system has already tried to store text in Byte typed variable, if successfully stored then using higher dat type's class has no problem.
             * (If text is no byte specified, it will stores exception)
            */
            
            // number conversion
            // Converting into Hexadecimal String
            numbers[0] = Integer.toHexString(decimal);

            // Converting into Decimal String
            numbers[1] = Integer.toString(decimal);
        
            // Converting into Octal String
            numbers[2] = Integer.toOctalString(decimal);
    
            // Converting into Binary String
            numbers[3] = Integer.toBinaryString(decimal);

        } catch (java.lang.NumberFormatException e) { // In Case; system tried to store value in numeric variable
            // storing error message
            numbers[4] = "Wrong Data Type Selection";
            // displaying on console
            System.out.print("Wrong Data Type Selection");
        }

        // returning Numbers (HEX, DEC, OCT, BIN) array
        return numbers;
    }
    

    /**
     * For Integer Data Type
     * @param NUM String HEX or DEC or OCT or BIN
     * @param type 0, 1, 2, 3 for HEX, DEC, OCT, BIN respectively;  in case of wrong params, method will consider HEX.
     * @return String[] contains HEX, DEC, OCT, BIN and Error Message
     * 
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
            // Converting into Hexadecimal String
            numbers[0] = Integer.toHexString(decimal);

            // Converting into Decimal String
            numbers[1] = Integer.toString(decimal);
        
            // Converting into Octal String
            numbers[2] = Integer.toOctalString(decimal);
    
            // Converting into Binary String
            numbers[3] = Integer.toBinaryString(decimal);

        } catch (java.lang.NumberFormatException e) { // In Case; system tried to store value in numeric variable
            // storing error message
            numbers[4] = "Wrong Data Type Selection";
            // displaying on console
            System.out.print("Wrong Data Type Selection");
        }

        // returning Numbers (HEX, DEC, OCT, BIN) array
        return numbers;
    }


    /**
     * For Long Data Type
     * @param NUM String HEX or DEC or OCT or BIN
     * @param type 0, 1, 2, 3 for HEX, DEC, OCT, BIN respectively;  in case of wrong params, method will consider HEX.
     * @return String[] contains HEX, DEC, OCT, BIN and Error Message
     * 
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
            // Converting into Hexadecimal String
            numbers[0] = Long.toHexString(decimal);

            // Converting into Decimal String
            numbers[1] = Long.toString(decimal);
        
            // Converting into Octal String
            numbers[2] = Long.toOctalString(decimal);
    
            // Converting into Binary String
            numbers[3] = Long.toBinaryString(decimal);

        } catch (java.lang.NumberFormatException e) { // In Case; system tried to store value in numeric variable (failed) 
            // storing error message
            numbers[4] = "Wrong Data Type Selection";
            // displaying on console
            System.out.print("Wrong Data Type Selection");
        }

        // returning Numbers (HEX, DEC, OCT, BIN) array
        return numbers;
    }


}