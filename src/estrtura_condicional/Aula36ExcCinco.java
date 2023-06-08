package estrtura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Aula36ExcCinco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo, quantidade;
        double preco;

        codigo = sc.nextInt();
        quantidade = sc.nextInt();

        if (codigo == 1) {
            preco = 4.00 * quantidade;
            System.out.printf("Total R$: %.3f%n", preco);
        } else if (codigo == 2) {
            preco = 4.50 * quantidade;
            System.out.printf("Total R$: %.3f%n", preco);
        } else if (codigo == 3) {
            preco = 5.00 * quantidade;
            System.out.printf("Total R$: %.3f%n", preco);
        } else if (codigo == 4) {
            preco = 2.00 * quantidade;
            System.out.printf("Total R$: %.3f%n", preco);
        } else {
            preco = 1.50 * quantidade;
            System.out.printf("Total R$: %.3f%n", preco);
        }

        sc.close();
    }
}
