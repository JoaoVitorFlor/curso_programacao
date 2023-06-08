package estrtura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Aula36ExcOito {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario, impostos;

        salario = sc.nextDouble();

        if (salario <= 2000.0) {
            impostos = 0.0;
        }
        else if (salario <= 3000.0) {
            impostos = (salario - 2000.0) * 0.08;
        }
        else if (salario <= 4500.0) {
            impostos = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else {
            impostos = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (impostos == 0.0) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f", impostos);
        }

        sc.close();
    }
}
