// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 28 March, 2022 8:14 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)


public class ex_4_12 {
    public static void main(String[] args) {
        // Initilization of variable
        int sum = 0, i = 3;

        // divisible by 3
        while(i<30) {
            if (i%3==0){
            sum += i;
            }
            i+=1;
        }

        // Displaying result
        System.out.println("Sum of integers between 1 and 30 that are divisible by 3 is " + sum);
   }    
} 
