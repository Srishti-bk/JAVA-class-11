package day_3;
import java.util.Scanner;
class Input{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=input.nextInt();
        if(num>=0)
        {
            System.out.println("positive");
        }
        else{
            System.out.println("negative");
        }
        
    }
}