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
public class Q5 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);
        
        // Swapping logic using a temporary variable
        int temp = num1;
        num1 = num2;
        num2 = temp;
        
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
        
        // Close the scanner
        scanner.close();
    }
}
