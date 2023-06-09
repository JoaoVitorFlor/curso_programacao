package estrtura_repeticao;

import java.util.Scanner;

public class Aula48ExcTres {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int alcool, gasolina, diesel, codigo;
            alcool = 0;
            gasolina = 0;
            diesel = 0;

            codigo = sc.nextInt();


            while (codigo != 4) {
                if (codigo == 1) {
                    alcool = alcool + 1;
                }
                else if (codigo == 2) {
                    gasolina = gasolina + 1;
                }
                else if (codigo == 3) {
                    diesel = diesel + 1;
                }

                codigo = sc.nextInt();
            }

            System.out.println("Muito obrigado!");
            System.out.println("Alcool: " + alcool);
            System.out.println("Gasolina: " + gasolina);
            System.out.println("Diesel: " + diesel);

            sc.close();
    }
}
