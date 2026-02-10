
        package day_17;
import java.util.Scanner;

public class ArrayCw2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n[] = new String[10];

        for (int i = 0; i < n.length; i++) {
            System.out.print("Enter a value to make a list in array: ");
            n[i] = sc.nextLine();
        }

        System.out.println("\nValues in the array:");
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }
}
