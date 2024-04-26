/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RyanCalculatorPkg;

/**
 *
 * @author user
 */
public class RyanCalculatorCls {
   public static void main(String[] args){
System.out.println("Addition: " + add(5, 3));
    System.out.println("Subtraction: " + subtract(5, 3));
    System.out.println("Multiplication: "+multiply(5,3));
    System.out.println("Division: " + divide(5, 3));
}
// Method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two numbers
    public static double divide(int a, int b) {
        return a / b;
    }
}
