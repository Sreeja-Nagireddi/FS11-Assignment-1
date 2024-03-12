
// 2)Create a Java class MathOperations with overloaded methods for addition (add) that can accept two integers, three doubles, and two strings, respectively. Demonstrate the usage of these methods in the main method by adding two integers, three doubles, and concatenating two strings.

import java.util.*;

public class MathOperations{

    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b, double c){
        return a + b + c;
    }
    
    public String add(String a, String b){
        return a + b;
    }

    public static void main(String[] args){
        MathOperations op = new MathOperations();
        int intSum = op.add(27, 59);
        System.out.println("Sum of two integers: " + intSum);
        double doubleSum = op.add(87.03, 67.58, 17.29);
        System.out.println("Sum of three doubles: " + doubleSum);
        String strConcat = op.add("Hello ", "World!");
        System.out.println("Concatenation of two strings: " + strConcat);
    }
}