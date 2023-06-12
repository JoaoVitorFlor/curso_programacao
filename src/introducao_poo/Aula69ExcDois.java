package introducao_poo;

import java.util.Locale;
import java.util.Scanner;

public class Aula69ExcDois {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aula69Salario employee = new Aula69Salario();
        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println("Employee: " + employee.name + ", $ " + employee.netSalary());
        System.out.print("Which percentage to increase salary?: ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println("Updated data:  " + employee.name + ", $ " + employee.grossSalary);

        sc.close();
    }
}
