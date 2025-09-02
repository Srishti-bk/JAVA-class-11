
package day_1;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number1 = scanner.nextInt();

        System.out.println("You entered: " + number1);

        scanner.close();
    }
}
