package estrutura_sequencial;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Locale;
import java.util.Scanner;

/*
 *
 * Faça um programa para ler dois valores inteiros, e depois mostrar na
 * tela a soma desses números com uma mensagem explicativa.
 *
 */
public class Aula29ExcUm {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu primeiro numero:");
        double primeiroNumero = sc.nextDouble();

        System.out.println("Digite seu segundo numero:");
        double segundoNumero = sc.nextDouble();

        double soma = primeiroNumero + segundoNumero;
        System.out.printf("A soma dos numeros é: %.2f", soma);


        sc.close();

    }

}