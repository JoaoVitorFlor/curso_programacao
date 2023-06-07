package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;
/*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
*/

public class Aula29ExcQuatro {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numFuncionario;
        double horasTrab, valorHora, salarioFunc;

        System.out.println("Digite o número do funcionario: ");
        numFuncionario = sc.nextInt();

        System.out.println("Indique as horas trabalhadas: ");
        horasTrab = sc.nextDouble();

        System.out.println("Digite o valor de rais por horas: ");
        valorHora = sc.nextDouble();

        salarioFunc = horasTrab * valorHora;


        System.out.printf("Seu salario é: %.2f", salarioFunc);
        System.out.println("Seu número é de: " + numFuncionario);

        sc.close();
    }
}
