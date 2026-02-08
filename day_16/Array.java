package day_16;
import java.util.Scanner;
public class Array{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter "+size+" elements of array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements of array are: ");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
        sc.close();
}
}