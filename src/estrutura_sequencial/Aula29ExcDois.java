package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

/*
*
Faça um programa para ler o valor do raio de um círculo, e
depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
*
*/
public class Aula29ExcDois {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.141659;

        System.out.println("Digite o raio do terreno:");
        double raio = sc.nextDouble();

        double raioQuadrado = raio * raio;
        double areaCirculo = pi * raioQuadrado;


        System.out.printf("A sua área é: %.4f", areaCirculo + "m2");

        sc.close();

    }
}
