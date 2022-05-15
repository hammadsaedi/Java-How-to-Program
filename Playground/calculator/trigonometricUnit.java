package calculator;

import java.math.BigInteger;
import java.math.BigDecimal;


/**
 * <h3>Trigonometric Operation Unit</h3>
 * Performs Trigonometric operation for passed numbers and return answers in given data type (packed in String). 
 * <p><b>Pre-Requirements:</b> BigInteger, BigDecimal, dataTypeUnit(user defined)</p>
 * @author Hammad Saeedi (@hammadsaedi  everywhere)
*/
public class trigonometricUnit {
    // Main Method
    public static void main(String[] args){
        // test code
        System.out.println(cos(0.5*Math.PI,"Float"));
        // System.out.println(difference(1.2, 2, "Byte"));
        // System.out.println(product(1.2, 2, "Byte"));
        // System.out.println(division(2.9, 2, "Byte"));
        // System.out.println(division(2, 0, "Byte"));
        // System.out.println(reminder(29, 2, "Float"));
        // System.out.println(reminder(2, 0, "Byte"));

    }

    public static String sin(double number, String type){
         // answer
         String answer = new String();

         if (type.equals("Float") || type.equals("Double")){ // in case of floating point number
            answer = BigDecimal.valueOf(Math.sin(number)).toString(); // calculation and conversion into string
            answer = dataTypeUnit.isDoubleParsable(answer, type); // checking if answer is parsable in given data type
         } else {
            answer = BigInteger.valueOf((long)Math.sin(number)).toString(10); // calculation and conversion into string
            answer = dataTypeUnit.isIntegerParsable(answer, type); // checking if answer is parsable in given data type
         }
 
         // returning answer
         return answer;
    }

    public static String cos(double number, String type){
        // answer
        String answer = new String();

        if (type.equals("Float") || type.equals("Double")){ // in case of floating point number
           answer = BigDecimal.valueOf(Math.cos(number)).toString(); // calculation and conversion into string
           answer = dataTypeUnit.isDoubleParsable(answer, type); // checking if answer is parsable in given data type
        } else {
           answer = BigInteger.valueOf((long)Math.cos(number)).toString(10); // calculation and conversion into string
           answer = dataTypeUnit.isIntegerParsable(answer, type); // checking if answer is parsable in given data type
        }

        // returning answer
        return answer;
   }

}