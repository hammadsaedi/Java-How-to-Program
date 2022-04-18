// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 26 March, 2022 4:12 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**
 * 2.23 What does the following code print?
 * System.out.printf("%s%n%s%n%s%n%s%n", " *", " ***", "*****", " ***", " *");;
 */

public class ex_2_23 {
    public static void main(String[] args) {
        System.out.printf("%s%n%s%n%s%n%s%n", " *", " ***", "*****", " ***", " *"); // %n is formate specifier for new line
    }
}