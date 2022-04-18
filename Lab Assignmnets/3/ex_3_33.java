// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 28 March, 2022 8:14 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

public class ex_3_33 {
    public static void main(String[] args) {
        // Outer Loop
        for(int i = 0; i < 8; i++) {
            // even lines prepend extra space
            if(i % 2 == 0){
                System.out.print(" ");
            }
            // Inner Iteration to print stars
            for(int j = 0; j < 8; j++) {
                System.out.print("* ");
            }
            // New Line with every outer iteration
            System.out.println();
        }

    }
    
}