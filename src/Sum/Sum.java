package Sum;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti un numar: ");
        int number = scanner.nextInt();
        scanner.close();
        int uc=0,sum=0;

        while (number!=0) {
            uc = number % 10;
            sum = sum + uc;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
