// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 28 March, 2022 8:14 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

package Assignmnets.No_3;

public class ex_3_25 {
    public static void main(String[] args) {
        // Variable Decalration
        int count = 1;

        // For 20 times Iteration
        while (count <= 20) {
            System.out.println(count % 3 == 1 ? "########" : "++++++++");
            ++count;
        }
       
   }    
} 
