package homework_week8_niks;

import java.util.Scanner;

/**
 * 6. Write a program in Java to display the pattern like a triangle with a number.   For eg.
 *  Input number of rows: 10
 *  Expected Output:
 *  1
 *  12
 *  123
 *  1234
 *  12345
 *  123456
 *  1234567
 *  12345678
 *  123456789
 *  12345678910
 */
public class P6DisplayPatternTriangle {
    public static void main(String[] args) {
    P6DisplayPatternTriangle obj = new P6DisplayPatternTriangle();
    obj.patternTriangle();
    }

    public void patternTriangle(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number  of row : ");
    int b =scanner.nextInt();


        for(int i  = 1; i <=b ; i++){                      // i is loop for = number of rows  10    = 1st loop > i1 = only 1 row
            for(int a = 1; a <= i ; a++) {                  // a is to print numbers in each row     =   a<=i  will print only 1 digit
                System.out.print(a);                        // to print the numbers in 1st loop all in 1 line
            }
            System.out.println();                           // to print in the next line after 1 loop
        }
    }

}
