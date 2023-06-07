package estrutura_sequencial;

import java.util.Scanner;

/*
Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
calcule e mostre a diferença do produto de A e B pelo produto de C e D
segundo a fórmula: DIFERENCA = (A * B - C * D).
*/
public class Aula29ExcTres {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B, C, D, DIF;

        System.out.println("Digite o número A:");
        A = sc.nextInt();

        System.out.println("Digite o número B:");
        B = sc.nextInt();

        System.out.println("Digite o número C:");
        C = sc.nextInt();

        System.out.println("Digite o número D:");
        D = sc.nextInt();

        DIF = (A * B - C * D);

        System.out.println("O resultado é: " + DIF);

        sc.close();
    }
}
