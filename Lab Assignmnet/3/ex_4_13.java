// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 28 March, 2022 8:14 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)


public class ex_4_13 {
    public static void main(String[] args) {
        // Initilization of variable
        int n = 1, sum = 0;

        // Banner
        System.out.println("No.\tSum");

        // Sum
        while(n <= 100) {
            sum += n;
            System.out.println(n + "\t" + sum);
            n = n+1;
        }
   }    
} 
