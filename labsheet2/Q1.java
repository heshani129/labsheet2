/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labsheet02;

import java.util.Scanner;

/**
 *
 * @author shinr
 */
public class Q1 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        
        System.out.print("Enter the height of the rectangle: ");
        double height = scanner.nextDouble();
        
        // Calculate the area
        double area = width * height;
        
        System.out.println("The area of the rectangle is: " + area);
        
        // Close the scanner
        scanner.close();
    }
}
