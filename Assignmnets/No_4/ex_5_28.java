// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 5 April, 2022 5:20 am
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**  
 * 5.28 Write a method sportsRecommender that inputs a Celsius temperature and returns “It’s
 * lovely weather for sports today!” if it’s 20–30 °C, “It’s reasonable weather for sports today.” if it’s
 * 10–40 °C, and “Please exercise with care today, watch out for the weather!” otherwise. Create an
 * application to test the method.
*/

package Assignmnets.No_4;

// Import the Scanner class
import java.util.Scanner;

public class ex_5_28 {
    // main method
    public static void main(String[] args) {
        // Variable declarations
        double temperature;
        String sportsRecommendion;

        // Scanner Object
        Scanner input = new Scanner(System.in); 
        
        // Banner
        System.out.println("Sports Recomendations"); 

        // Taking Temperature Input
        System.out.print("Enter temperature: ");
        temperature = input.nextDouble(); 

        // closing scanner object
        input.close();

        // checking recomendations
        sportsRecommendion = sportsRecommender(temperature);

        // displaying result
        System.out.print(sportsRecommendion);
    }

    // method to return sport recommendations
    public static String sportsRecommender(double temperature){
        // variable declaration
        String sportsRecommendion;

        // Checking recomendations
        if (temperature >= 20 && temperature <= 30) {
            sportsRecommendion = "It\'s lovely weather for sports today!";
        } else if (temperature >= 10 && temperature <= 40) {
            sportsRecommendion = "It\'s reasonable weather for sports today";
        } else {
            sportsRecommendion = "Please exercise with care today, watch out for the weather!";
        }

        // return recomendations
        return sportsRecommendion;
    } 
}