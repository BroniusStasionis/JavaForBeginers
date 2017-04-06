package Paskaita3;

/**
 * Created by Bronius on 2017-04-06.
 */
public class Konstruktorius {
    // tuscias konstruktorius visos klases turi pagal nutylejima tuscia konstruktoriu
    public Konstruktorius() {
        System.out.println("Tuscias konstruktorius");

    }


    public Konstruktorius(int id) {
        System.out.println("2 konstruktorius su reiksme >> " + id);

    }
}

class MyMainApp{
    public static void main(String[] args) {
        Konstruktorius example = new Konstruktorius();
        Konstruktorius example1 = new Konstruktorius(123);
    }

}
