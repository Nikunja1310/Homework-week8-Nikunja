package homework_week8_niks;

/**
 * 1. Read 10 numbers from the console entered by the user and print the sum of those  numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read  10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the  count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number #1:, the next Enter number  #2:, and so on.
 * Hint:
 * -Use a while loop.
 * -Use a counter variable for counting valid numbers.
 * -Close the scanner after you don't need it anymore.
 * -Create a class with the name ReadingUserInputChallenge.
 */
import java.util.Scanner;
public class P1ReadingUserInputChallenge {

    public static void main(String[] args) {
    P1ReadingUserInputChallenge obj = new P1ReadingUserInputChallenge();
    obj.userInput();
    }

    public void userInput(){

        System.out.println("Enter number #x :");
        Scanner scanner = new Scanner(System.in);

        int count = 1;      // 1 to 10 hi accept karega hence start count with "1"
        int sum = 0;        // sum = 0 + next number and keeps on iterating or adding untill 10 count

        while (count <= 10) {                           // while(count = 1; count<=10; count++) can also be used
            System.out.println("#" + count + ":");

            if (scanner.hasNextInt()) {                     // if else to check if next input = Scanner has integer or alpha
                int number = scanner.nextInt();
                sum = sum + number;
                count++;

            } else {
                System.out.println("Invalid number. ");
                scanner.next();                 // next = this will ask user to input INTEGER and not any other symbols or alpha
            }
        }
        // scanner.close will end after while loop or else after 1 iteration it will close scanner.

        System.out.println("Sum of the number is : " + sum);            // print sum
        scanner.close();
    }
}