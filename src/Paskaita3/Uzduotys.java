package Paskaita3;

import java.util.Scanner;

/**
 * Created by Bronius on 2017-04-06.
 */
public class Uzduotys {

    public static void main(String [] a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite skaiciu ");
        int skaicius = sc.nextInt();
        if (skaicius%2==0){
            System.out.println("Skaicius yra lyginis");
        }else{
            System.out.println("Skaicius yra nelyginis");
        }

        uzduotis2();


    }

    public static void uzduotis2 (){
        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.println("Iveskite zodi ");
        String zodis = sc.nextLine();
        if(zodis.equals("pabaiga")){
            break;
        }

    }

    }

    private static void
}
