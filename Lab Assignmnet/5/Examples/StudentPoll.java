// Written by: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 11 April, 2022 9:20 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/** 
 * 6.5.6 Using the Elements of an Array as Counters (Fig. 6.7)
*/

public class StudentPoll {
    public static void main(String[] args) {
        // student response array (more typically, input at runtime)
        int[] responses = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
        int[] frequency = new int[6]; // array of frequency counters

        // for each answer, select responses element and use that value
        // as frequency index to determine element to increment
        for (int answer = 0; answer < responses.length; answer++){
            try {
                ++frequency[responses[answer]];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e); // invokes toString method
                System.out.printf("responses[%d] = %d%n%n", answer, responses[answer]);
            }
        }

        System.out.printf("%s%10s%n", "Rating", "Frequency");

        // output each array element's value
        for (int rating = 1; rating < frequency.length; rating++){  
            System.out.printf("%6d%10d%n",rating, frequency[rating]);
        }
    }
}