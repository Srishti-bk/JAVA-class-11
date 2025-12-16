import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Given number is positive");
        } else if (n < 0) {
            System.out.println("Given number is negative");
        } else {
            System.out.println("Given number is zero");
        }
    }
}
