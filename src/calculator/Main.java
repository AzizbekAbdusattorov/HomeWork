package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calculator c = new Calculator();

        while (true) {
            System.out.print("Birinchi sonni kiriting: ");
            c.x = in.nextInt();

            System.out.print("Arifmetik amalni kiriting -> ( '+', '-', '*', '/' ): ");
            c.sign = in.next().charAt(0);

            System.out.print("Ikkinchi sonni kiriting: ");
            c.y = in.nextInt();

            c.result();
        }


    }
}
