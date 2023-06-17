package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> list = new ArrayList<>();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Employee #" + i + ": ");

            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            list.add(new Funcionario(id, name, salary));
        }


        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Funcionario fun = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (fun == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            fun.aumentoSalario(percentage);
        }


        System.out.println();
        System.out.println("List of employees:");
        for (Funcionario obj : list) {
            System.out.println(obj);
        }

        sc.close();
    }

    public static boolean hasId(List<Funcionario> list, int id) {
        Funcionario fun = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return fun != null;
    }


}
