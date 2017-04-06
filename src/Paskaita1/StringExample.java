package Paskaita1;

import java.util.Scanner;

/**
 * Created by Bronius on 2017-04-04.
 */
public class StringExample {

    public static void main(String[] args) {
        System.out.print("Hi Bronius");
        FirstExampleSupportClass example = new FirstExampleSupportClass();
        example.sayHi();

        System.out.print(example.sum(10, 20));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert a number ");
        int insertedNumb = scanner.nextInt();
        System.out.print("Insert number >>" + insertedNumb);

        example.userName(scanner);
        example.pirmassk(scanner);

    }


}


class FirstExampleSupportClass{

    public void sayHi () {
        System.out.print("Labas");
    }

    public int sum(int firstNumb, int secondNumb) {
        return firstNumb + secondNumb;
    }

    public void userName(Scanner sc) {
        System.out.println("Iveskite savo varda");
        String name = sc.next();
        System.out.println("Labas " + name);
        System.out.println("Zodzio ilgis " + name.length());

    }
    public void pirmassk(Scanner sk) {
        System.out.println( "Iveskite pirma sk ");
        int name = sk.nextInt();
        System.out.println("Iveskite antra sk ");
        int name1 = sk.nextInt();
        System.out.println("suma" + (name+name1));
        System.out.println("skirtumas" + (name-name1));

    }
}