package estrtura_condicional;

import java.util.Scanner;

public class Aula36ExcUm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Positivo");
        }

        sc.close();
    }
}
