// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 28 March, 2022 8:14 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

// Import the Scanner class
import java.util.Scanner;

public class ex_4_17 {
    public static void main(String[] args) {
        // Variable Decalration
        char grade;
        int marks;

        // Scanner Object
        Scanner input=new Scanner(System.in);

        // 4 times iteration
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter marks of students:");
            marks = input.nextInt();

            // Condition
            if ((marks >= 0) && (marks <= 100)) {
                 switch (marks / 10) {
                    case 10:
                    case 9:
                        grade = 'A';
                        System.out.println(grade);
                        break;
                    case 8:
                        grade = 'B';
                        System.out.println(grade);
                        break;
                    case 7:
                        grade = 'C';
                        System.out.println(grade);
                        break;
                    case 6:
                        grade = 'D';
                        System.out.println(grade);
                        break;
                     case 5:
                      grade = 'E';
                        System.out.println(grade);
                        break;
                    default:
                            grade = 'F';
                            System.out.println(grade);
                        }
                    } else {
                        System.out.println("Invalid output");
                    }
                }
        // close input
        input.close();
 }        
}   
