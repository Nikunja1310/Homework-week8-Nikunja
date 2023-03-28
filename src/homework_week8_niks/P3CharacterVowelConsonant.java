package homework_week8_niks;

import java.util.Scanner;

/**
 * 3. Write a Java program that takes the user to provide a single character from the   alphabet. Print Vowel of Consonant, depending on the user input. If the user input   Is not a letter (between a and z or A and Z), or is a string of length > 1, print an  error message.
 * For eg:
 *  Input an alphabet: p
 *  Expected Output:
 *  Input letter is Consonant
 */
public class P3CharacterVowelConsonant {

    public static void main(String[] args) {
        P3CharacterVowelConsonant obj = new P3CharacterVowelConsonant();
        obj.charConstantConso();
    }

    public void charConstantConso() {

        System.out.println("Enter an aplhabet :");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        int count = 1;
        char ch = input.charAt(0);

        while (count != 1 || !Character.isLetter(ch)) {

                System.out.println("Error");
                break;

        }

            if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                System.out.println("Expected Output : ");
                System.out.println("It is vowel");

            } else {

                System.out.println("Expected Output : ");
                System.out.println("It is consonant");

            }

        scanner.close();
    }
}
