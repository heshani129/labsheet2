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
public class Q4 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        
        // Calculate the square
        double square = number * number;
        
        System.out.println("The square of " + number + " is: " + square);
        
        // Close the scanner
        scanner.close();
    }
}






