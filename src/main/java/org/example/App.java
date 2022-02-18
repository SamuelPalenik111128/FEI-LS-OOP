package org.example;

public class App {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;

        while (a < 5) {
            System.out.println("a = " + a);
            a++;
        }

        do {
            System.out.println("b = " + b);
            b++;
        } while (b < 2);
    }
}
