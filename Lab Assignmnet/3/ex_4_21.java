// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 28 March, 2022 8:14 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

public class ex_4_21 {
    public static void main(String[] args) {
        // Variable Decalration
        int limit = 500;
        int a, b, c = 0; // triplet: a^2 + b^2 = c^2
        int m = 2; // loop from 2 to max_limit
        
        while (c < limit) { // Limiting c would limit all a, b and c
            for (int n = 1; n < m; ++n) { // now loop on j from 1 to i-1
                a = m * m - n * n; // Evaluate and print triplets using the relation between a, b and c
                b = 2 * m * n;
                c = m * m + n * n;
                if (c > limit)
                    break;
                System.out.println(a + "\t" + b + "\t" + c);
            }
            m++;
        }
    }        
}   
