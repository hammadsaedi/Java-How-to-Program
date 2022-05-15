package calculator;

import java.math.BigInteger;
import java.math.BigDecimal;


/**
 * <h3>Arithmetic Operation Unit</h3>
 * Performs arithmetic operation for passed numbers and return answers in given data type (packed in String). 
 * <p><b>Pre-Requirements:</b> BigInteger, BigDecimal, dataTypeUnit(user defined)</p>
 * @author Hammad Saeedi (@hammadsaedi  everywhere)
*/
public class arithmeticUnit {
    // Main Method
    public static void main(String[] args){
        // test code
        // System.out.println(sum(1.2, 2, "Byte"));
        // System.out.println(difference(1.2, 2, "Byte"));
        // System.out.println(product(1.2, 2, "Byte"));
        // System.out.println(division(2.9, 2, "Byte"));
        // System.out.println(division(2, 0, "Byte"));
        // System.out.println(reminder(29, 2, "Float"));
        // System.out.println(reminder(2, 0, "Byte"));
        
    }

    /**
     * Adds two {@code long} numbers 
     * @param number1 first number to add
     * @param number2 second number to add
     * @param type numeric data type, in which answer has to be parsable {@code Byte} or {@code Short} or {@code Integer} or {@code Long} or {@code Float} or {@code Double}
     * @return sum of two long numbers; if answer is not parsable return NumberFormatException
    */
    public static String sum(long number1, long number2, String type){
        // sum of two numbers
        String sum = new String();

        if (type.equals("Float") || type.equals("Double")){ // in case of floating point number
            sum = BigDecimal.valueOf(number1 + number2).toString(); // calculation and conversion into string
            sum = dataTypeUnit.isDoubleParsable(sum, type); // checking if sum is parsable in given data type
        } else {
            sum = BigInteger.valueOf(number1 + number2).toString(10); // calculation and conversion into string
            sum = dataTypeUnit.isIntegerParsable(sum, type); // checking if sum is parsable in given data type
        }

        // returning sum of two numbers
        return sum;
    }

    /**
     * Adds two {@code double} numbers 
     * @param number1 first number to add
     * @param number2 second number to add
     * @param type numeric data type, in which answer has to be parsable {@code Byte} or {@code Short} or {@code Integer} or {@code Long} or {@code Float} or {@code Double}
     * @return sum of two long numbers; if answer is not parsable return NumberFormatException
     * @since 1.0
    */
    public static String sum(double number1, double number2, String type){
        // sum of two numbers
        String sum = new String();

        if (type.equals("Float") || type.equals("Double")){ // in case of floating point number
            sum = BigDecimal.valueOf(number1 + number2).toString(); // calculation and conversion into string
            sum = dataTypeUnit.isDoubleParsable(sum, type); // checking if sum is parsable in given data type
        } else {
            sum = BigInteger.valueOf((long)(number1 + number2)).toString(10); // calculation and conversion into string
            sum = dataTypeUnit.isIntegerParsable(sum, type); // checking if sum is parsable in given data type
        }

        // returning sum of two numbers
        return sum;
    }

    /**
     * Difference of two {@code long} numbers 
     * @param number1 first number from which other is going to subtracted
     * @param number2 second number which has to be subtracted
     * @param type numeric data type, in which answer has to be parsable {@code Byte} or {@code Short} or {@code Integer} or {@code Long} or {@code Float} or {@code Double}
     * @return difference of two long numbers; if answer is not parsable return NumberFormatException
     * @since 1.0
    */
    public static String difference(long number1, long number2, String type){
        // difference of two numbers
        String diff = new String();
        
        if (type.equals("Float") || type.equals("Double")){ // in case of floating point number
            diff = BigDecimal.valueOf(number1 - number2).toString();  // calculation and conversion into string
            diff = dataTypeUnit.isDoubleParsable(diff, type); // checking if difference is parsable in given data type
        } else {
            diff = BigInteger.valueOf(number1 - number2).toString(10); // calculation and conversion into string
            diff = dataTypeUnit.isIntegerParsable(diff, type); // checking if difference is parsable in given data type
        }

        // returning difference of two numbers
        return diff;
    }

    /**
     * Difference of two {@code double} numbers 
     * @param number1 first number from which other is going to subtracted
     * @param number2 second number which has to be subtracted
     * @param type numeric data type, in which answer has to be parsable {@code Byte} or {@code Short} or {@code Integer} or {@code Long} or {@code Float} or {@code Double}
     * @return difference of two long numbers; if answer is not parsable return NumberFormatException
     * @since 1.0
    */
    public static String difference(double number1, double number2, String type){
        // difference of two numbers
        String sum = new String();

        if (type.equals("Float") || type.equals("Double")){ // in case of floating point number
            sum = BigDecimal.valueOf(number1 + number2).toString(); // calculation and conversion into string
            sum = dataTypeUnit.isDoubleParsable(sum, type); // checking if difference is parsable in given data type
        } else {
            sum = BigInteger.valueOf((long)(number1 + number2)).toString(10); // calculation and conversion into string
            sum = dataTypeUnit.isIntegerParsable(sum, type); // checking if difference is parsable in given data type
        }

        // returning difference of two numbers
        return sum;
    }

    /**
     * Product of two {@code long} numbers 
     * @param number1 first number to multiply
     * @param number2 second number to multiply
     * @param type numeric data type, in which answer has to be parsable {@code Byte} or {@code Short} or {@code Integer} or {@code Long} or {@code Float} or {@code Double}
     * @return product of two long numbers; if answer is not parsable return NumberFormatException
     * @since 1.0
    */
    public static String product(long number1, long number2, String type){
        // product of two numbers
        String product = new String();

        if (type.equals("Float") || type.equals("Double")){ // in case of floating point number
            product = BigDecimal.valueOf(number1 * number2).toString(); // calculation and conversion into string
            product = dataTypeUnit.isDoubleParsable(product, type); // checking if product is parsable in given data type
        } else {
            product = BigInteger.valueOf(number1 * number2).toString(10); // calculation and conversion into string
            product = dataTypeUnit.isIntegerParsable(product, type); // checking if product is parsable in given data type
        }

        // returning product of two numbers
        return product;
    }

    /**
     * Product of two {@code double} numbers 
     * @param number1 first number to multiply
     * @param number2 second number to multiply
     * @param type numeric data type, in which answer has to be parsable {@code Byte} or {@code Short} or {@code Integer} or {@code Long} or {@code Float} or {@code Double}
     * @return product of two long numbers; if answer is not parsable return NumberFormatException
     * @since 1.0
    */
    public static String product(double number1, double number2, String type){
        // product of two numbers
        String product = new String();

        if (type.equals("Float") || type.equals("Double")){ // in case of floating point number
            product = BigDecimal.valueOf(number1 * number2).toString(); // calculation and conversion into string
            product = dataTypeUnit.isDoubleParsable(product, type); // checking if product is parsable in given data type
        } else {
            product = BigInteger.valueOf((long)(number1 * number2)).toString(10); // calculation and conversion into string
            product = dataTypeUnit.isIntegerParsable(product, type); // checking if product is parsable in given data type
        }

        // returning product of two numbers
        return product;
    }

    /**
     * Division of two {@code long} numbers 
     * @param number1 dividend
     * @param number2 divisor
     * @param type numeric data type, in which answer has to be parsable {@code Byte} or {@code Short} or {@code Integer} or {@code Long} or {@code Float} or {@code Double}
     * @return quotient; if answer is not parsable return NumberFormatException
     * @since 1.0
    */
    public static String division(long number1, long number2, String type){
        // quotient
        String quotient = new String();

        try {
            if (type.equals("Float") || type.equals("Double")){ // in case of floating point number
                quotient = BigDecimal.valueOf(number1 / number2).toString(); // calculation and conversion into string
                quotient = dataTypeUnit.isDoubleParsable(quotient, type); // checking if quotient is parsable in given data type
            } else {
                quotient = BigInteger.valueOf((long)(number1 / number2)).toString(10); // calculation and conversion into string
                quotient = dataTypeUnit.isIntegerParsable(quotient, type); // checking if quotient is parsable in given data type
            }
        } catch (ArithmeticException e) {
            quotient = "ArithmeticException"; // Storing Arithmetic Exception
        }
        
        // returning quotient
        return quotient;
    }

    /**
     * Division of two {@code double} numbers 
     * @param number1 dividend
     * @param number2 divisor
     * @param type numeric data type, in which answer has to be parsable {@code Byte} or {@code Short} or {@code Integer} or {@code Long} or {@code Float} or {@code Double}
     * @return quotient; if answer is not parsable return NumberFormatException
     * @since 1.0
    */
    public static String division(double number1, double number2, String type){
        // quotient
        String quotient = new String();

        try {
            if (type.equals("Float") || type.equals("Double")){ // in case of floating point number
                quotient = BigDecimal.valueOf(number1 / number2).toString(); // calculation and conversion into string
                quotient = dataTypeUnit.isDoubleParsable(quotient, type); // checking if quotient is parsable in given data type
            } else {
                quotient = BigInteger.valueOf((long)(number1 / number2)).toString(10); // calculation and conversion into string
                quotient = dataTypeUnit.isIntegerParsable(quotient, type); // checking if quotient is parsable in given data type
            }
        } catch (ArithmeticException e) {
            quotient = "ArithmeticException"; // Storing Arithmetic Exception
        }
        
        // returning quotient
        return quotient;
    }

    /**
     * Reminder of two {@code long} numbers after division 
     * @param number1 dividend
     * @param number2 divisor
     * @param type numeric data type, in which answer has to be parsable {@code Byte} or {@code Short} or {@code Integer} or {@code Long} or {@code Float} or {@code Double}
     * @return reminder; if answer is not parsable return NumberFormatException
     * @since 1.0
    */
    public static String reminder(long number1, long number2, String type){
        // reminder
        String reminder = new String();

        try {
            if (type.equals("Float") || type.equals("Double")){ // in case of floating point number
                reminder = BigDecimal.valueOf(number1 % number2).toString(); // calculation and conversion into string
                reminder = dataTypeUnit.isDoubleParsable(reminder, type); // checking if reminder is parsable in given data type
            } else {
                reminder = BigInteger.valueOf((long)(number1 % number2)).toString(10); // calculation and conversion into string
                reminder = dataTypeUnit.isIntegerParsable(reminder, type); // checking if reminder is parsable in given data type
            }
        } catch (ArithmeticException e) {
            reminder = "ArithmeticException"; // Storing Arithmetic Exception
        }
        
        // returning reminder
        return reminder;
    }

    /**
     * Reminder of two {@code double} numbers after division 
     * @param number1 dividend
     * @param number2 divisor
     * @param type numeric data type, in which answer has to be parsable {@code Byte} or {@code Short} or {@code Integer} or {@code Long} or {@code Float} or {@code Double}
     * @return reminder; if answer is not parsable return NumberFormatException
     * @since 1.0
    */
    public static String reminder(double number1, double number2, String type){
        // reminder
        String reminder = new String();

        try {
            if (type.equals("Float") || type.equals("Double")){ // in case of floating point number
                reminder = BigDecimal.valueOf(number1 % number2).toString(); // calculation and conversion into string
                reminder = dataTypeUnit.isDoubleParsable(reminder, type); // checking if reminder is parsable in given data type
            } else {
                reminder = BigInteger.valueOf((long)(number1 % number2)).toString(10); // calculation and conversion into string
                reminder = dataTypeUnit.isIntegerParsable(reminder, type); // checking if reminder is parsable in given data type
            }
        } catch (ArithmeticException e) {
            reminder = "ArithmeticException"; // Storing Arithmetic Exception
        }
        
        // returning reminder
        return reminder;
    }
}