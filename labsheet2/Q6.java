/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsheet02;

import java.util.Scanner;

/**
 *
 * @author shinr
 */
public class Q6 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a two-digit number: ");
        int number = scanner.nextInt();

        int tensDigit = number / 10;
        int onesDigit = number % 10;

        int addition = tensDigit + onesDigit;
        int subtraction = tensDigit - onesDigit;
        int division = tensDigit / onesDigit;
        int multiplication = tensDigit * onesDigit;
        int remainder = number % 10;
        
        int largerDigit = (tensDigit > onesDigit) ? tensDigit : onesDigit;
        int smallerDigit = (tensDigit < onesDigit) ? tensDigit : onesDigit;

        int reverseNumber = onesDigit * 10 + tensDigit;

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Division: " + division);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Remainder: " + remainder);
        System.out.println("Larger digit: " + largerDigit);
        System.out.println("Smaller digit: " + smallerDigit);
        System.out.println("Reverse of the number: " + reverseNumber);

        // Close the scanner
        scanner.close();
    }
}
