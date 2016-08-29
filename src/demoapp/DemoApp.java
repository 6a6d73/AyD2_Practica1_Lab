/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoapp;

import java.util.Scanner;

/**
 *
 * @author ao152867
 */
public class DemoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        
        // This will print Hello world! and add a newline.
        System.out.println("Hello world!");
        // Asks the user for input.
        System.out.println("Enter a number: ");
        int n = reader.nextInt(); // Scans the next token of the input as an int.
        System.out.println(n + " is a nice number but I prefer " + n*5/4+(n/3) + ".");
        
    }
    
}
