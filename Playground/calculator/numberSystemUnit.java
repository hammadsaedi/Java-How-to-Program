package calculator;

import java.math.*;
import java.util.*;

/**
 * <h3>Number System Unit</h3>
 * Hexadecimal, Decimal, Octal and Binary Number System, respectively.
 * @author Hammad Saeedi (@hammadsaedi  everywhere)
*/

public class numberSystemUnit {

    /**
     * Main Method
     * <p>For Testing Program</p>
    */
    public static void main(String[] args) {
        // System.out.println(toDEC("7.5", 16));
        System.out.println(Arrays.toString(conversion("ff.abc", "Double", 16)));
        int[][] a = new int[5][];
        a[1] = new int[2];

    }


    /**
     * Coverts Number String among binary, octal, decimal and hexadecimal number system.
     * @param NUM String, which has to be converted
     * @param type Data type of number; Byte, Short, Integer, Long, Float, Double
     * @param radix of number system; 2, 8, 10, 16 for binary, octal, decimal and hexadecimal number respectively
     * @return String[] which contains hexadecimal, decimal, octal, binary and Error Message (in case of wrong data type selection), respectively.
    */
    public static String[] conversion(String NUM, String type, int radix){
        // DEC number system's container
        String DEC;
        // Arrays to store Numbers (HEX, DEC, OCT, BIN)
        String[] numbers = new String[5];
        // if number is negative or not
        boolean isNegative = false, isOnlyPoint = false;

        // Default zero after decimal
        if (NUM.charAt(NUM.length() - 1) == '.') { // Last Index
            isOnlyPoint = true;
            NUM += "0";

        }

        // Checking for negative negative number
        if (NUM.contains("-")){
            // if number is negative 
            isNegative = true;
            // replacing negative sign
            NUM = NUM.replace("-", "");
        }

        // Converting into Decimal
        try {
            // DEC number system's container
            DEC = dataTypeUnit.toParsableDECString(NUM, type, radix);
            
            // number conversion
            numbers = decimalConversion(DEC);

            // if number was negative
            if (isNegative){
                // negate each number string
                for (int i = 0; i < numbers.length - 1; i++){
                    numbers[i] = "-" + numbers[i];
                }
            }

            if (isOnlyPoint) { 
                // removing last char == point
                for (int i = 0; i < numbers.length - 1; i++){
                    numbers[i] = numbers[i].repeat(numbers[i].length() - 1);
                }
            }
        } catch (java.lang.NumberFormatException e) { // In Case; system tried to store value in numeric variable
            // storing error message
            numbers[4] = "NumberFormatException";
            // displaying on console
            System.out.println("Wrong Data Type Selection");
        }

        // returning Numbers (HEX, DEC, OCT, BIN) and error message array
        return numbers;
    }
    
   

    /**
     * Converts Decimal Number into Hexadecimal, Octal and Binary Numbers 
     * @param DEC String Type Decimal Number which has to be converted
     * @return String[] Array of 5 Element which contains HEX, DEC, OCT, BIN
    */
    public static String[] decimalConversion(String DEC){
        // Arrays to store Numbers (HEX, DEC, OCT, BIN)
        String[] numbers = new String[5]; 

        // Numeric Floating DEC
        double decimal = Double.parseDouble(DEC);
        // Converting into Hexadecimal String
        numbers[0] = fromDEC(DEC, 16, 8);

        if (DEC.contains(".")){
            // Converting into Decimal String
            numbers[1] = Double.toString(decimal);
        } else {
            numbers[1] = Long.toString((long)decimal);
        }
        
    
        // Converting into Octal String
        numbers[2] = fromDEC(DEC, 8, 8);
        // // Converting into Binary String
        numbers[3] = fromDEC(DEC, 2, 8);

        return numbers;
    }


    

    public static String toDEC(String NUM, int radix) {    

        if (NUM.contains(".")){
            // variable declaration
            String withoutPeriod, afterPeriod;
            double number, divisor;
            
            // Number without Period 
            withoutPeriod = NUM.replace(".", ""); 
            number = new BigInteger(withoutPeriod, radix).doubleValue();

            // Number's part after decimal
            int length = NUM.split("\\.")[1].length();
            afterPeriod = "1";
            for(int i = 0; i < length; i++) {
                afterPeriod += "0";
            }

            divisor =  new BigInteger(afterPeriod, radix).doubleValue();

            return Double.toString(number / divisor);    
        } 

        // returning DEC number after conversion
        return Integer.toString(new BigInteger(NUM, radix).intValue());
    }


    public static String fromDEC(String DEC, int radix, int digits) {
        if (DEC.contains(".")){
            BigDecimal number = BigDecimal.valueOf(Double.parseDouble(DEC));
            BigDecimal integerPart = number.setScale(0, RoundingMode.FLOOR);
            BigDecimal fractionalPart = number.subtract(integerPart);
    
            StringBuilder NUM = new StringBuilder();
    
            // Integer Part
            BigDecimal Radix = BigDecimal.valueOf(radix);
            BigDecimal zero = BigDecimal.ZERO;
            while ( integerPart.compareTo(zero) > 0 ) {
                BigDecimal[] result = integerPart.divideAndRemainder(Radix);
                switch(result[1].toString()) {
                    case "10":
                        NUM.append('A');
                        break;
                    case "11":
                        NUM.append('B');
                        break;
                    case "12":
                        NUM.append('C');
                        break;
                    case "13":
                        NUM.append('D');
                        break;
                    case "14":
                        NUM.append('E');
                        break;
                    case "15":
                        NUM.append('F');
                        break;
                    default:
                        NUM.append(result[1]);
                }
            integerPart = result[0];
            }

            NUM.reverse();
    
            // Fractional Part
            int count = 0;
            if ( fractionalPart.compareTo(zero) != 0 ) {
                NUM.append(".");
            } else if ( fractionalPart.compareTo(zero) == 0 ) {
                NUM.append(".0");
            }
            while (fractionalPart.compareTo(zero) != 0 ) {
                count++;
                fractionalPart = fractionalPart.multiply(Radix);
                System.out.println(fractionalPart);
                switch(fractionalPart.setScale(0, RoundingMode.FLOOR).toString()) {
                    case "10":
                        NUM.append('A');
                        break;
                    case "11":
                        NUM.append('B');
                        break;
                    case "12":
                        NUM.append('C');
                        break;
                    case "13":
                        NUM.append('D');
                        break;
                    case "14":
                        NUM.append('E');
                        break;
                    case "15":
                        NUM.append('F');
                        break;
                    default:
                        NUM.append(fractionalPart.setScale(0, RoundingMode.FLOOR));
                }
                
                BigDecimal i = fractionalPart.setScale(0, RoundingMode.FLOOR);;
                fractionalPart = fractionalPart.subtract(i);


                if (BigDecimal.ZERO.compareTo(fractionalPart) == 0) {
                    break;
                }
                if ( count >= digits ) {
                    break;
                }
            }

            return NUM.toString();
        } else {
            BigInteger number = BigInteger.valueOf(Long.parseLong(DEC));
    
            StringBuilder NUM = new StringBuilder();
    
            BigInteger Radix = BigInteger.valueOf(radix);
            BigInteger zero = BigInteger.ZERO;
            while (number.compareTo(zero) > 0 ) {
                BigInteger[] result = number.divideAndRemainder(Radix);
                switch(result[1].toString()) {
                    case "10":
                        NUM.append('A');
                        break;
                    case "11":
                        NUM.append('B');
                        break;
                    case "12":
                        NUM.append('C');
                        break;
                    case "13":
                        NUM.append('D');
                        break;
                    case "14":
                        NUM.append('E');
                        break;
                    case "15":
                        NUM.append('F');
                        break;
                    default:
                        NUM.append(result[1]);
                }
                number = result[0];
            }
            return NUM.toString();
        }       
    }
}