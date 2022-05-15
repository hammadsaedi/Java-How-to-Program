package calculator;

/**
 * <h3>Data Type Check and Balance</h3>
 * Checks if String is Parsable into Data Type of Integer and Floating Point numbers. 
 * @author Hammad Saeedi (@hammadsaedi  everywhere)
 * @version 1.0
*/
public class dataTypeFactory {
    
    /**
     * Checks if String is parsable in given Integers Data Type or not.
     * @param number which has to be parse in {@code Integers} Data Type
     * @param type representing Integers Data Type {@code Byte} or {@code Short} or {@code Integer} or {@code Long}
     * @return same passed {@code String}, if number is parsable in given {@code Integers} Data Type. else; return Error Message as {@code String}
    */
    public static String isIntegerParsable(String number, String type){
        // try to parse in given data type and again convert into String
        try {
            if (type.equals("Byte")){
                number = Byte.toString(Byte.parseByte(number));
            } else if (type.equals("Short")){
                number = Short.toString(Short.parseShort(number));
            } else if (type.equals("Short")){
                number = Integer.toString(Integer.parseInt(number));
            } else if (type.equals("Integer")){
                number = Integer.toString(Integer.parseInt(number));
            } else if (type.equals("Long")){
                number = Double.toString(Double.parseDouble(number));
            }
        } catch (java.lang.NumberFormatException e){ // In case, NumberFormatException (Not Parsable)
            number = "NumberFormatException";
        }

        // returning number string
        return number;
    }

    /**
     * Checks if String is parsable in given Doubles Data Type or not.
     * @param number which has to be parse in {@code Double} Data Type
     * @param type representing Double Data Type {@code Float} or {@code Double}
     * @return same passed {@code String}, if number is parsable in given {@code Double} Data Type. else; return Error Message as {@code String}
    */
    public static String isDoubleParsable(String number, String type){
        // try to parse in given data type and again convert into String
        try {
            if (type.equals("Float")){
                number = Float.toString(Float.parseFloat(number));
            } else if (type.equals("Double")){
                number = Double.toString(Double.parseDouble(number));
            }
        } catch (java.lang.NumberFormatException e){ // In case, NumberFormatException (Not Parsable)
            number = "NumberFormatException";
        }

        // returning number string
        return number;
    }
}
