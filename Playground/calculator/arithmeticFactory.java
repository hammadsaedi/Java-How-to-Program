package calculator;

/**
 * <h3>Arithmetic Operation Center</h3>
 * Performs arithmetic operation for passed numbers and return answers in given data type (packed in String). 
 * @author Hammad Saeedi (@hammadsaedi  everywhere)
 * @version 1.0
*/
public class arithmeticFactory {
    // Main Method
    public static void main(String[] args){
        // test code
    }

    /**
     * Adds two {@code long} numbers 
     * @param number1 first number to add
     * @param number2 second number to add
     * @param type numeric data type, in which answer has to be parsable {@code Byte} or {@code Short} or {@code Integer} or {@code Long} or {@code Float} or {@code Double}
     * @return sum of two long numbers; if answer is not parsable return NumberFormatException
     * @since 1.0
     */
    public static String sum(long number1, long number2, String type){
        // sum of two numbers
        String sum = new String();
        
        if (type.equals("Float") || type.equals("Double")){ // in case of floating point number
            sum = Double.toString(number1 + number2); // calculation and conversion into string
            sum = dataTypeFactory.isDoubleParsable(sum, type); // checking if sum is parsable in given data type
        } else {
            sum = Long.toString(number1 + number2); // calculation and conversion into string
            sum = dataTypeFactory.isIntegerParsable(sum, type); // checking if sum is parsable in given data type
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
            diff = Double.toString(number1 - number2); // calculation and conversion into string
            diff = dataTypeFactory.isDoubleParsable(diff, type); // checking if sum is parsable in given data type
        } else {
            diff = Long.toString(number1 - number2); // calculation and conversion into string
            diff = dataTypeFactory.isIntegerParsable(diff, type); // checking if sum is parsable in given data type
        }

        // returning sum of two numbers
        return diff;
    }
}
