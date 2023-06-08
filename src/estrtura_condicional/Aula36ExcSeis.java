package estrtura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Aula36ExcSeis {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();

        if(0 > valor || valor < 25.00) {
            System.out.println("O valor está entre 0 e 25");
        }
        else if (25.00 > valor || valor < 50.00)
        {
            System.out.println("O valor está entre 25.00 e 50.00");
        }
        else if (50.00 > valor || valor <= 75.00){
            System.out.println("O valor está entre 50.00 e 75.00");
        }
        else if (75.00 >= valor || valor <= 100.00){
            System.out.println("O valor está entre 75.00 e 100.00");
        }
        else {
            System.out.println("Fora de intervalo");
        }

        sc.close();
    }
}
