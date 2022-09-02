// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 28 March, 2022 8:14 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

package Assignmnets.No_3;

public class ex_3_22 {
  public static void main(String[] args) {
        // Banner
        System.out.println("N\tn^2\tN^3\tN^4");
        
        // 5 times iteration
        for (int n = 1; n <= 5; n++) {
            System.out.printf("%d\t%d\t%d\t%d\n",n,n*n,n*n*n,n*n*n*n);
        }
    } 
}