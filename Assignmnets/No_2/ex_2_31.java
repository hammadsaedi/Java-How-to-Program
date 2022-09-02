// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 28 March, 2022 4:11 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**
 * 2.31 (Table of Squares and Cubes) Using only the programming techniques you learned in this
 * chapter, write an application that calculates the squares and cubes of the numbers from 0 to 10 and
 * prints the resulting values in table format, as shown below. 
 * number square cube
    0       0      0
    1       1      1
    2       4      8
    3       9     27
    4       16    64
    5       25    125
    6       36    216
    7       49    343
    8       64    512
    9       81    729
    10      100   1000
*/


package Assignmnets.No_2;

public class ex_2_31 {
    public static void main(String[] args){ 
        // Initialization of Variables
        int number;

        // Banner
        System.out.printf("Number\tSquare\tCube%n");
        
        // Displaying result for nummber 1 to 10, with assignemts
        number = 1;
        System.out.printf("%d\t%d\t%d%n",number, number*number, number*number*number);
        number = 2;
        System.out.printf("%d\t%d\t%d%n",number, number*number, number*number*number);
        number = 3;
        System.out.printf("%d\t%d\t%d%n",number, number*number, number*number*number);
        number = 4;
        System.out.printf("%d\t%d\t%d%n",number, number*number, number*number*number);
        number = 5;
        System.out.printf("%d\t%d\t%d%n",number, number*number, number*number*number);
        number = 6;
        System.out.printf("%d\t%d\t%d%n",number, number*number, number*number*number);
        number = 7;
        System.out.printf("%d\t%d\t%d%n",number, number*number, number*number*number);
        number = 8;
        System.out.printf("%d\t%d\t%d%n",number, number*number, number*number*number);
        number = 9;
        System.out.printf("%d\t%d\t%d%n",number, number*number, number*number*number);
        number = 10;
        System.out.printf("%d\t%d\t%d%n",number, number*number, number*number*number);
    }
}