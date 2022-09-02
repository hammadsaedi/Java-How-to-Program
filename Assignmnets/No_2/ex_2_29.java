// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 27 March, 2022 12:10 am
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**
 * 2.29 (Integer Value of a Character) Here’s another peek ahead. In this chapter, you learned
 * about integers and the type int. Java can also represent uppercase letters, lowercase letters and a considerable variety of special symbols. Every character has a corresponding integer representation. The
 * set of characters a computer uses together with the corresponding integer representations for those
 * characters is called that computer’s character set. You can indicate a character value in a program
 * simply by enclosing that character in single quotes, as in 'A'.
 * You can determine a character’s integer equivalent by preceding that character with (int), as in
 * (int) 'A'
 * An operator of this form is called a cast operator. (You’ll learn about cast operators in Chapter 3.)
 * The following statement outputs a character and its integer equivalent:
 * System.out.printf("The character %c has the value %d%n", 'A', ((int) 'A'));
 * When the preceding statement executes, it displays the character A and the value 65 (from the Unicode® character set) as part of the string. The format specifier %c is a placeholder for a character (in
 * this case, the character 'A').
 * Using statements similar to the one shown earlier in this exercise, write an application that displays the integer equivalents of some uppercase letters, lowercase letters, digits and special symbols.
 * Display the integer equivalents of the following: A B C a b c 0 1 2 $ * + / and the blank character.
*/


package Assignmnets.No_2;

public class ex_2_29 {
    public static void main(String[] args){ 
    
        // Space
        System.out.printf("The character %c has the value %d%n", ' ', ((int) ' '));
        // Numbers
        System.out.printf("The character %c has the value %d%n", '0', ((int) '0'));
        System.out.printf("The character %c has the value %d%n", '1', ((int) '1'));
        System.out.printf("The character %c has the value %d%n", '2', ((int) '2'));
        System.out.printf("The character %c has the value %d%n", '3', ((int) '3'));
        System.out.printf("The character %c has the value %d%n", '4', ((int) '4'));
        System.out.printf("The character %c has the value %d%n", '5', ((int) '5'));
        System.out.printf("The character %c has the value %d%n", '6', ((int) '6'));
        System.out.printf("The character %c has the value %d%n", '7', ((int) '7'));
        System.out.printf("The character %c has the value %d%n", '8', ((int) '8'));
        System.out.printf("The character %c has the value %d%n", '9', ((int) '9'));
        // Upper Case Alphabets
        System.out.printf("The character %c has the value %d%n", 'A', ((int) 'A'));
        System.out.printf("The character %c has the value %d%n", 'B', ((int) 'B'));
        System.out.printf("The character %c has the value %d%n", 'C', ((int) 'C'));
        System.out.printf("The character %c has the value %d%n", 'D', ((int) 'D'));
        System.out.printf("The character %c has the value %d%n", 'E', ((int) 'E'));
        System.out.printf("The character %c has the value %d%n", 'F', ((int) 'F'));
        System.out.printf("The character %c has the value %d%n", 'G', ((int) 'G'));
        System.out.printf("The character %c has the value %d%n", 'H', ((int) 'H'));
        System.out.printf("The character %c has the value %d%n", 'I', ((int) 'I'));
        System.out.printf("The character %c has the value %d%n", 'J', ((int) 'J'));
        System.out.printf("The character %c has the value %d%n", 'K', ((int) 'K'));
        System.out.printf("The character %c has the value %d%n", 'L', ((int) 'L'));
        System.out.printf("The character %c has the value %d%n", 'M', ((int) 'M'));
        System.out.printf("The character %c has the value %d%n", 'N', ((int) 'N'));
        System.out.printf("The character %c has the value %d%n", 'O', ((int) 'O'));
        System.out.printf("The character %c has the value %d%n", 'P', ((int) 'P'));
        System.out.printf("The character %c has the value %d%n", 'Q', ((int) 'Q'));
        System.out.printf("The character %c has the value %d%n", 'R', ((int) 'R'));
        System.out.printf("The character %c has the value %d%n", 'S', ((int) 'S'));
        System.out.printf("The character %c has the value %d%n", 'T', ((int) 'T'));
        System.out.printf("The character %c has the value %d%n", 'U', ((int) 'U'));
        System.out.printf("The character %c has the value %d%n", 'V', ((int) 'V'));
        System.out.printf("The character %c has the value %d%n", 'W', ((int) 'W'));
        System.out.printf("The character %c has the value %d%n", 'X', ((int) 'X'));
        System.out.printf("The character %c has the value %d%n", 'Y', ((int) 'Y'));
        System.out.printf("The character %c has the value %d%n", 'Z', ((int) 'Z'));
        System.out.printf("The character %c has the value %d%n", '[', ((int) '['));
        // Lower Case Alphabets
        System.out.printf("The character %c has the value %d%n", 'a', ((int) 'a'));
        System.out.printf("The character %c has the value %d%n", 'b', ((int) 'b'));
        System.out.printf("The character %c has the value %d%n", 'c', ((int) 'c'));
        System.out.printf("The character %c has the value %d%n", 'd', ((int) 'd'));
        System.out.printf("The character %c has the value %d%n", 'e', ((int) 'e'));
        System.out.printf("The character %c has the value %d%n", 'f', ((int) 'f'));
        System.out.printf("The character %c has the value %d%n", 'g', ((int) 'g'));
        System.out.printf("The character %c has the value %d%n", 'h', ((int) 'h'));
        System.out.printf("The character %c has the value %d%n", 'i', ((int) 'i'));
        System.out.printf("The character %c has the value %d%n", 'j', ((int) 'j'));
        System.out.printf("The character %c has the value %d%n", 'k', ((int) 'k'));
        System.out.printf("The character %c has the value %d%n", 'l', ((int) 'l'));
        System.out.printf("The character %c has the value %d%n", 'm', ((int) 'm'));
        System.out.printf("The character %c has the value %d%n", 'n', ((int) 'n'));
        System.out.printf("The character %c has the value %d%n", 'o', ((int) 'o'));
        System.out.printf("The character %c has the value %d%n", 'p', ((int) 'p'));
        System.out.printf("The character %c has the value %d%n", 'q', ((int) 'q'));
        System.out.printf("The character %c has the value %d%n", 'r', ((int) 'r'));
        System.out.printf("The character %c has the value %d%n", 's', ((int) 's'));
        System.out.printf("The character %c has the value %d%n", 't', ((int) 't'));
        System.out.printf("The character %c has the value %d%n", 'u', ((int) 'u'));
        System.out.printf("The character %c has the value %d%n", 'v', ((int) 'v'));
        System.out.printf("The character %c has the value %d%n", 'w', ((int) 'w'));
        System.out.printf("The character %c has the value %d%n", 'x', ((int) 'x'));
        System.out.printf("The character %c has the value %d%n", 'y', ((int) 'y'));
        System.out.printf("The character %c has the value %d%n", 'z', ((int) 'z'));
        // Symbols
        System.out.printf("The character %c has the value %d%n", '!', ((int) '!'));
        System.out.printf("The character %c has the value %d%n", '"', ((int) '"'));
        System.out.printf("The character %c has the value %d%n", '#', ((int) '#'));
        System.out.printf("The character %c has the value %d%n", '$', ((int) '$'));
        System.out.printf("The character %c has the value %d%n", '%', ((int) '%'));
        System.out.printf("The character %c has the value %d%n", '&', ((int) '&'));
        System.out.printf("The character %c has the value %d%n", '\'', ((int) '\''));
        System.out.printf("The character %c has the value %d%n", '(', ((int) '('));
        System.out.printf("The character %c has the value %d%n", ')', ((int) ')'));
        System.out.printf("The character %c has the value %d%n", '*', ((int) '*'));
        System.out.printf("The character %c has the value %d%n", '+', ((int) '+'));
        System.out.printf("The character %c has the value %d%n", ',', ((int) ','));
        System.out.printf("The character %c has the value %d%n", '-', ((int) '-'));
        System.out.printf("The character %c has the value %d%n", '.', ((int) '.'));
        System.out.printf("The character %c has the value %d%n", '/', ((int) '/'));
        
        // For Source Code
        // for (int i = 1; i < 127; i++){
        //     System.out.print("System.out.printf(\"The character %c has the value %d%n\"");
        //     System.out.printf(", '%c', ((int) '%c'));%n", (char)i, (char)i);   
        // }
    }
}

