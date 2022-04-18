// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 10 April 2022 1:30 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/** 
 * 6.10 (Pixel Quantization) Use a one-dimensional array to solve the following problem: You
 * want to eventually perform some basic compression on an image. Assume that you will only be operating on a single row of the image, and that pixel colors are represented as simple numbers in the
 * array. You are required to quantize the values of the pixels in the row. In other words, any pixel values appearing in a range will assume a value in that range as indicated below. This creates redundancy that can lead to better compression. Overwrite the original values in the array.
 * a) For 0–20: 10
 * b) For 21–40: 30
 * c) For 41–60: 50
 * d) For 61–80: 70
 * e) For 81–100: 90
 * f) For 101–120: 110
 * g) For 121–140: 130
 * h) For 141–160: 150
 * i) For 161–180: 170, and for all other pixel values, assumed a quantized value of 190
 * Print the array with the new, quantized values
*/

// Importing Secure Random Class
import java.security.SecureRandom;

public class ex_6_10 {
    // array containing pixels of single row of image
    private static int[] pixels = new int[10]; // Lets assume there are 10 pixels in row
     
    // main method
    public static void main(String[] args) {
        // Variable declarations
        int index;
         
        // Banner
        System.out.println("Pixel Quantization");
        
        // Generating a single row of image
        pixelsRow();

         // Displaying random colors containing row of image
         System.out.println("Random colors containing row of image: ");
         for (index = 0; index < pixels.length; index ++){
            System.out.printf("%d ", pixels[index]); // Integer Formate Specifier as assignment is integer array
        } System.out.println();

        // Pixel Quantization
        for (index = 0; index < pixels.length; index++){
            // Pixel Quantization and Setting Quantized Value
            pixels[index] = quantize(pixels[index]); 
        }

        // Displaying Image Row with Quantized Pixels
        System.out.println("Quantized Pixel: ");
        for (index = 0; index < pixels.length; index ++){
            System.out.printf("%d ", pixels[index]); // Integer Formate Specifier as assignment is integer array
        }
    }

    // method to return a single row of image (colors are represented as simple numbers)
    public static void pixelsRow(){
        // Variable declaration
        int index, start, randomNumber;
       
        // Secure random object creation (as its non-static)
        SecureRandom random = new SecureRandom();

        // We can either get pixels from user or create random number based for the sake automation
        // Here we go with array containing random numbers (Row of random color pixel)
        for (index = 0, start = 0; index < pixels.length; index++, start += 20){
            if (index == 0) {
                // range based random number (0 - 20)
                randomNumber = start + random.nextInt(20);
                start++; // for remaining ranges
            } else {
                // range based random number 
                randomNumber = start + random.nextInt(20);
            }
            // Assigning random value to pixel' elements
            pixels[index] = randomNumber;
        }
    }

    // method to return quantized value
    public static int quantize(int pixel){

        // Setting Quantized values  
        if (pixel >= 0 && pixel <= 20) {
            pixel = 10;
        } else if (pixel >= 21 && pixel <= 40) {
            pixel = 30;
        } else if (pixel >= 41 && pixel <= 60) {
            pixel = 50;
        } else if (pixel >= 61 && pixel <= 80) {
            pixel = 70;
        } else if (pixel >= 81 && pixel <= 100) {
            pixel = 90;
        } else if (pixel >= 101 && pixel <= 120) {
            pixel = 110;
        } else if (pixel >= 121 && pixel <= 140) {
            pixel = 130;
        } else if (pixel >= 141 && pixel <= 160) {
            pixel = 150;
        } else if (pixel >= 161 && pixel <= 180) {
            pixel = 170;
        } else {
            pixel = 190;
        }

        // returning quantized pixel
        return pixel;
    }
}