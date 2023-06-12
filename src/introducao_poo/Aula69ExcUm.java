package introducao_poo;

import java.util.Locale;
import java.util.Scanner;

public class Aula69ExcUm {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aula69Area retangulo = new Aula69Area();
        System.out.println("Entre com altura: ");
        retangulo.height = sc.nextDouble();
        System.out.println("Entre com largura: ");
        retangulo.width = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", retangulo.area());
        System.out.printf("PERIMETER = %.2f%n", retangulo.perimetro());
        System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());

        sc.close();
    }
}
