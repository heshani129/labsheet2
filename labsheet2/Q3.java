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
public class Q3 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the length in kilometers: ");
        double kilometers = scanner.nextDouble();
        
        // Convert kilometers to meters (1 kilometer = 1000 meters)
        double meters = kilometers * 1000;
        
        System.out.println("The length in meters is: " + meters + " meters");
        
        // Close the scanner
        scanner.close();
    }
}
