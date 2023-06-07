package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Aula29ExcCinco {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codPecaUm, codPecaDois, numPecasUm, numPecasDois;
        double valorPecaUm, valorPecaDois, valorPago;

        codPecaUm = sc.nextInt();
        codPecaDois = sc.nextInt();
        numPecasUm = sc.nextInt();
        numPecasDois = sc.nextInt();

        valorPecaUm = sc.nextDouble();
        valorPecaDois = sc.nextDouble();

        valorPago = numPecasUm * valorPecaUm + numPecasDois * valorPecaDois;

        System.out.printf("Valor a pagar é: %.2f", valorPago);

        sc.close();
    }
}
