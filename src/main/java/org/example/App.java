package org.example;

public class App {
    public static void main(String[] args) {
        int num1 = 15;
        float num2 = 3.5f;
        float result;

        if ((result = (num1 / num2))> 2.0f) {
            System.out.println("Statement is true, result = " + result);
        }
        else {
            System.out.println("Statement is false, result =  " + result);
        }
    }
}
