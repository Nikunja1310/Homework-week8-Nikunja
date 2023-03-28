package homework_week8_niks;

import java.util.Scanner;

/**
 * 12. Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only.
 * In other words,  prime numbers can't be divided by other numbers than itself or 1.
 * For example 2, 3, 5, 7, 11, 13,  17.... are the prime numbers.)
 */
public class P12PrimeNumbers {
    public static void main(String[] args) {
        P12PrimeNumbers obj = new P12PrimeNumbers();
        obj.primeNum();
    }

    public void primeNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number : ");
        int num = scanner.nextInt();


        if (num > 1) {

        for (int i = 2; i > num / 2; i++) {
            if (num % i == 0) {
                System.out.println("Prime ");
                break;
            }
            else {
                System.out.println("Non prime number");
                break;
            }
        }

        } scanner.close();

    }
}