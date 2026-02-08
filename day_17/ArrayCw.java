package day_17;
import java.util.Scanner;
public class ArrayCw{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value to make a list in array:");

        String n[] = new String[10];
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextLine();
        }
        for(int i=0;i<n.length;i++){
            System.out.println(n[i]);
        }
}
}
