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

        int a = 5;

        for(int i = 0; i <= a; i++) {
            switch (i) {
                case 1:
                    System.out.println("a je jedna");
                    break;
                case 2:
                    System.out.println("a je dva");
                    break;
                case 3:
                case 4:
                    System.out.println("a je tri ale bo styri");
                    break;
                default:
                    System.out.println(String.format("a je %d", i));
                    break;
            }
        }
    }
}
