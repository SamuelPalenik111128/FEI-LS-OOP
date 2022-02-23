package org.example;

import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner klavesnica = new Scanner(System.in);
        String a = "a";
        String b = "a";
        System.out.println("Zadaj pismeno: ");
        String c = klavesnica.nextLine();

        System.out.println("Equals:" + Objects.equals(a, c));
        System.out.println("Equals:" + b.equals(c));
    }
}
