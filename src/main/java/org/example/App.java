package org.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Dlzka: " + args.length);

        for(int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }

        int[] pole = new int[10];
        for(int i = 0; i < pole.length; i++){
            if(i == 0){
                pole[i] = 1;
                continue;
            }
            pole[i] = pole[i - 1] * 2;
        }

        for(int i = 0; i < pole.length; i++){
            System.out.println(i + " : " + pole[i]);
        }
    }
}
