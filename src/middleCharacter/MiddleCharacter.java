package middleCharacter;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti un cuvant: ");
        String word = scanner.next();
        scanner.close();

        if(word.length() % 2 !=0){
            System.out.println(word.charAt(word.length() / 2));
        }
        else {
            System.out.println(word.charAt(word.length() / 2 -1)+ " " + word.charAt(word.length() / 2));
        }
    }
}
