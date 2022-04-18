// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 28 March, 2022 8:14 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

public class ex_4_24 {
    public static void main(String[] args) {
        // Variable Decalration
        for (int i = 5, p = 1 ; p <= 5;p++) { // i used to control rows & p is used for printing numbers
            for (int j = 1; j <= i; j++) {// j is used to control columns
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }        
}   
