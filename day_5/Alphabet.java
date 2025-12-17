package day_5;

import java.util.Scanner;

class Alphabet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter:");
        char ch = input.next().charAt(0);
        ch = Character.toLowerCase(ch);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");
                break;
        }

        input.close();
    }
}
