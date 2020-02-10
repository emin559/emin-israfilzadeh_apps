package app;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        System.out.println("Add first number:");
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        System.out.println("Add second number:");
        int number2 = input.nextInt();
        System.out.println("Sum is: " + (number1+number2) );
        System.out.println("Substaraction is: " + (number1-number2) );
        System.out.println("Dividing is: " + (number1/number2) );
        System.out.println("multiplication is: " + (number1*number2) );
        System.out.println("multiplication is: " + (number1*number2) );
    }
}