// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 28 March, 2022 8:14 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

package Assignmnets.No_3;

// Import the Scanner class
import java.util.Scanner;

public class ex_4_23 {
    public static void main(String[] args) {
           // Variable Decalration
            int a,b,g,i,j,x,y;
            
            // Scnanner Object
            Scanner input = new Scanner(System.in);
            
            // Taking input
            // a
            System.out.print("Enter value of a:");
            a = input.nextInt();
            // b
            System.out.print("Enter value of b:");
            b = input.nextInt();
            // g
            System.out.print("Enter value of g:");
            g = input.nextInt();
            // i
            System.out.print("Enter value of i:");
            i = input.nextInt();
            // j
            System.out.print("Enter value of j:");
            j = input.nextInt();
            // x
            System.out.print("Enter value of x:");
            x = input.nextInt();
            // y
            System.out.print("Enter value of y:");
            y = input.nextInt();
            
            // Dispaling out put
            System.out.println("a)");
            System.out.println("Original expression : !( x < 5 ) && !( y >= 7) = " + (!( x < 5 ) && !( y >= 7)));
            System.out.println(" New expression : !(( x < 5 ) || ( y >= 7)) = " + (!(( x < 5 ) || ( y >= 7))));
            System.out.println("\nb)");
            System.out.println("Original expression : !( a == b ) || !( g != 5) = " + (!( a == b ) || !( g != 5)));
            System.out.println(" New expression : !(( a == b ) && ( g != 5)) = " + (!(( a == b ) && ( g != 5))));
            System.out.println("\nc)");
            System.out.println("Original expression : !((x <= 8) && (y > 4)) = " + (!((x <= 8) && (y > 4))));
            System.out.println(" New expression : (x <= 8) || (y > 4) " + ((x <= 8) || (y > 4)));
            System.out.println("\nd)"); //!((i > 4) || (j <= 6))
            System.out.println("Original expression : !(( i > 4 ) || ( j <= 6 ) = " +(!((i > 4) || (j <= 6))));
            System.out.println(" New expression : ((i > 4) && (j <= 6)) " + ((i > 4) && (j <= 6)));

        // closing input
        input.close();
    }        
}   
