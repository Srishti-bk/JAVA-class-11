package day_12;

import java.util.Scanner;

public class Guess {

    int secretNumber;

    Guess() {
        secretNumber = 7;
    }

    void checkGuess(int guess) {
        if (guess > secretNumber) {
            System.out.println("Too high!");
        } else if (guess < secretNumber) {
            System.out.println("Too low!");
        } else {
            System.out.println("Correct!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Guess g = new Guess();
        int userGuess = 0;

        while (userGuess != g.secretNumber) {
            userGuess = sc.nextInt();
            g.checkGuess(userGuess);
        }
    }
}
