package estrtura_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Aula48ExcDois {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        while (x != 0 || y != 0) {
            if (x > 0.0 && y > 0.0) {
                System.out.println("Primeiro");

            } else if (x < 0.0 && y > 0.0) {
                System.out.println("Segundo");

            } else if (x < 0.0 && y < 0.0) {
                System.out.println("Terceiro");

            } else {
                System.out.println("Quarto");

            }
            x = sc.nextDouble();
            y = sc.nextDouble();
        }
        sc.close();
    }
}