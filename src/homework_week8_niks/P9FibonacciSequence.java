package homework_week8_niks;

import java.util.Scanner;

/**
 * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class P9FibonacciSequence {

    public static void main(String[] args) {
    P9FibonacciSequence obj = new P9FibonacciSequence();
    obj.fibonacci();
    }

    public void fibonacci() {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int firstnum = 1;
        int nextnum = 1;
        System.out.print((firstnum + " " + nextnum + " "));

        for (int i = 1; i <= n; i++) {
            int sum = firstnum + nextnum;
            System.out.print(sum + " ");
            firstnum = nextnum;
            nextnum = sum;
            i++;
        }

        scanner.close();

    }

}


