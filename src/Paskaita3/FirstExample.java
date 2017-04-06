package Paskaita3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Bronius on 2017-04-06.
 */
public class FirstExample {
    public static void main(String[] args) {

        int a = 40;
        int b = 40;

        if (a >= b) {
            System.out.println("Taip tai ties");
        } else {
            System.out.println("Ne ne");
        }


        int val = 1;

        switch (val) {
            case 1:
                System.out.println("radom 1");
                break;
            case 2:
                System.out.println("radom 2");
                break;
            default:
                System.out.println("Nieko neradom");
                break;
        }

        exceptionExample();
        printMas();
    }

    private static void printMas(){
        for(int i = 1; i<6; i++);
        System.out.println("Tekstas");
    }

    private static void exceptionExample() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Irasyk skaiciu");

        try {
            int numb = sc.nextInt();
            System.out.println("Jusu skaicius yra >> " + numb);
        } catch (InputMismatchException e) {
            System.out.println("Duok skaiciu");
        }


    }

}



