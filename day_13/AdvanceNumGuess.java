package day_13;

import java.util.Scanner;
<<<<<<< HEAD
=======

>>>>>>> 4a1c68a5cfd85a081bf653089b9419025c554a0e
public class AdvanceNumGuess {

    int secretNumber;

    AdvanceNumGuess() {
<<<<<<< HEAD
        secretNumber = 70;
=======
        secretNumber = 50;
>>>>>>> 4a1c68a5cfd85a081bf653089b9419025c554a0e
    }

    void checkGuess(int guess) {
        int difference = Math.abs(secretNumber - guess);

        if (guess == secretNumber) {
            System.out.println("Correct! You guessed the number.");
        } else if (guess * 2 == secretNumber) {
            System.out.println("Half of the secret number!");
        } else if (difference == 1) {
            System.out.println("Too near!");
<<<<<<< HEAD
        } else if (difference <= 5) {
=======
        } else if (difference <= 2) {
>>>>>>> 4a1c68a5cfd85a081bf653089b9419025c554a0e
            System.out.println("Near! Try again.");
        } else if (guess < secretNumber) {
            System.out.println("Too low!");
        } else {
            System.out.println("Too high!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AdvanceNumGuess g = new AdvanceNumGuess();
        int userGuess;

        System.out.println("Guess a number between 1 and 100");

        do {
            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();
            g.checkGuess(userGuess);
        } while (userGuess != g.secretNumber);

        sc.close();
    }
<<<<<<< HEAD
}   

    
=======
}
>>>>>>> 4a1c68a5cfd85a081bf653089b9419025c554a0e
