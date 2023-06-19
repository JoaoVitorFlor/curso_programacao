package heranca.application;

import heranca.entities.PessoaJuridica;
import heranca.entities.PessoaFisica;
import heranca.entities.Imposto;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Imposto> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int number = sc.nextInt();

        for (int i=1; i<=number; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("PessoaFisica or company (i/c)? ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Anual income: ");
            double renda = sc.nextDouble();
            if (type == 'i') {
                System.out.print("Health expenditures: ");
                double gastoSaude = sc.nextDouble();
                list.add(new PessoaFisica(nome, renda, gastoSaude));
            }
            else {
                System.out.print("Number of employees: ");
                int numeroFuncionario = sc.nextInt();
                list.add(new PessoaJuridica(nome, renda, numeroFuncionario));
            }
        }

        double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAID:");
        for (Imposto tp : list) {
            double tax = tp.tax();
            System.out.println(tp.getNome() + ": $ " + String.format("%.2f", tax));
            sum += tax;
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

        sc.close();

    }
}
