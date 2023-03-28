package homework_week8_niks;

import java.util.Scanner;

/**
 * 14. Write a program in Java to display the pattern like a diamond.
 *  While loop
 *  *
 *  ***
 *  *****
 *  *******
 *  *********
 * ***********
 * *************
 * ***********
 *  *********
 *  *******
 *  *****
 *  ***
 *  *
 */


public class P14Diamond {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int n = scanner.nextInt();

        for(int i=1; i<=n; i++) {

            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i = n; i >= 1; i--) {

            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }







}
