package day_4;
import java.util.Scanner;

class Class11{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to class 11");
        System.out.println("Enter the service you want ");
        System.out.println("Service we provide:");
        System.out.println("1)Software development");
        System.out.println("2)Automation");
        System.out.println("3)Web development");
        System.out.println("Exit");

        int choice=input.nextInt();
        switch (choice){
            case 1:
                System.out.println("Software development");
                break;
            case 2:
                System.out.println("Automation");
                break;
            case 3:
                System.out.println("Web development");
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("invalid input");   
        }
        System.out.println("Thank you for visiting goodbye!!!");
    }
}