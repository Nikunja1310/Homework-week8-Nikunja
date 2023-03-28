package homework_week8_niks;

/**
 * 10. Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
import java.util.Scanner;
public class P10ArmstrongNumber {
    public static void main(String[] args) {

    }

    public void armstrongNum(int number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it is Armstrong or not : ");
        int n = scanner.nextInt();

        int sum = 0;
        int digit = 0;
        int a = number;

        while (number != 0) {
            digit = number % 10;
        sum = sum / 10;
    }
        if (sum == a){
            System.out.println(a + " is Armstrong  number");
        }else {
            System.out.println(a + " is not Armstrong  number");
        }
    }
}
