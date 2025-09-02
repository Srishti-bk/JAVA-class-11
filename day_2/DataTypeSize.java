package day_2;
public class DataTypeSize{
    public static void main(String[]agrs){
        int number=1234567890;
        String stringvariable="Hello"
        char charvariable='b';
        short shortvariable=12345;
        long longvariable=12345678900000L;
        byte bytevariable=(byte)3444;

        float temperature=36.667f;
        double gravity=9.80665;

        Long worldpop=8_000_000_000L;

        int Binary=0b1010;
        int octa=012;
        int hex=0xA;

        byte small=(byte)127;
        char grade='A';
        boolen isValid=true;
        String message="Literals demo";

        System.out.println("Integer: " + number);
        System.out.println("String: " + stringVariable);
        System.out.println("Char: " + charVariable);
        System.out.println("Short: " + shortVariable);
        System.out.println("Long: " + longVariable);
        System.out.println("Byte: " + byteVariable);
        System.out.println("Float: " + temperature);
        System.out.println("Double: " + gravity);
        System.out.println("Long (world population): " + worldPop);
        System.out.println("Binary literal (0b1010): " + binary);
        System.out.println("Octal literal (012): " + octa);
        System.out.println("Hexadecimal literal (0xA): " + hex);
        System.out.println("Byte (small): " + small);
        System.out.println("Char (grade): " + grade);
        System.out.println("Boolean: " + isValid);
        System.out.println("Message: " + message);
    }
}