// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 28 March, 2022 8:14 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

package Assignmnets.No_3;

// Import the Scanner class
import java.util.Scanner;

public class ex_4_25 {
    public static void main(String[] args) {
        // Variable Decalration
        int i,j,r,k=1;
        
        // Scanner Object
        Scanner in = new Scanner(System.in);
 
        // Taking Input
        System.out.print("Input number of rows in range (1-19) : ");
        r = in.nextInt();

        if(r%2!=0)  {
            for(i=0;i<=r;i++) {
                for(j=1;j<=r-i;j++)
                    System.out.print(" ");
                    for(j=1;j<=2*i-1;j++)
                        System.out.print(k);
                    System.out.print("\n");
                     }
                    for(i=r-1;i>=1;i--) {
                        for(j=1;j<=r-i;j++)
                            System.out.print(" ");
                        for(j=1;j<=2*i-1;j++)
                            System.out.print(k+1);
                        System.out.print("\n");
                        k++;
                     }
                } else 
                     System.out.println("Invalid");
    }        
}   
