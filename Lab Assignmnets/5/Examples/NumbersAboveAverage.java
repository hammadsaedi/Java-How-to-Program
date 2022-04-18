// Program to read 10 values from an array and display the average, and find out 
// how many numbers are above average.


import java.util.Scanner;



public class  NumbersAboveAverage{
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        int[] numbers  = new int[10];

        //Declare variables.
        int sum = 0;
        double mean = 0;
        double max = 0;


        // Input values into the array.
        for (int i = 0; i < numbers.length; i++) {
            
            System.out.print("Enter a number: ");

            numbers[i] = input.nextInt();

            if(numbers[i]> max) {
                max = numbers[i];
            }

            sum += numbers[i];
    
        }

        //calculate average
        mean = sum / numbers.length;
        
        // Print average Value.
        System.out.println("");
        System.out.println("The average is: "+ mean);

        
        
        // Printing values greater than average.
        System.out.println("The numbers above average are: ");
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] > mean)
            {
                System.out.println(numbers[j]); /** numbers[j] will print arrays element */
            }
            
        }
        // Close input object.
        input.close();
        
    }
    
}
