package excessao.application;

import excessao.entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nomeCliente;
        double saldo, saqueLimite, saque, deposito;
        int numeroAtendimento;

        nomeCliente = sc.nextLine();
        numeroAtendimento = sc.nextInt();
        saldo = sc.nextDouble();
        saqueLimite = sc.nextDouble();


        Conta cc1 = new Conta(nomeCliente,numeroAtendimento,saldo, saqueLimite);

        saque = sc.nextDouble();
        cc1.Saque(saque);
        deposito = sc.nextDouble();
        cc1.Depoista(deposito);


        System.out.printf("Total R$: %.3f%n", saldo);
    }
}
