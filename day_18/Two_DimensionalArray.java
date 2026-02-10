package day_18;
import java.util.Scanner;
public class Two_DimensionalArray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int columns = sc.nextInt();
        int[][] array = new int[rows][columns];

        System.out.println("Enter th elements of the array:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                array[i][j] = sc.nextInt();
            }
        }
    }
}