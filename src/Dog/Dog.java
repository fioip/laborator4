package Dog;

import java.util.Scanner;

public class Dog {
    String nume, rasa;

    public Dog(String nume, String rasa) {
       this.nume = nume;
       this.rasa = rasa;
    }

    public static void main(String[] args) {
        Dog caine = new Dog("Rex", "Amstaff");
        System.out.println(caine.nume + " " + caine.rasa);
    }
}
