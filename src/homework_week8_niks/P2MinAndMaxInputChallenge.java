package homework_week8_niks;

import java.util.Scanner;

/**
 * 2. -Read the numbers from the console entered by the user and print the minimum  and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum  number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */

public class P2MinAndMaxInputChallenge {
    public static void main(String[] args) {
        P2MinAndMaxInputChallenge obj = new P2MinAndMaxInputChallenge();
        obj.minMax();

    }

    public void minMax() {
        System.out.println("Enter number : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int min;
        int max;
        min = max = num;

        while (scanner.hasNextInt()) {
            num = scanner.nextInt();

            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }

            System.out.println("Minimum number is " + min);
            System.out.println("Maximum number is " + max);
        }

        System.out.println("Minimum number is " + min);
        System.out.println("Maximum number is " + max);
        scanner.close();
    }

}

