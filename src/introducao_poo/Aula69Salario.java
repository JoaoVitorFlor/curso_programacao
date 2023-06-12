package introducao_poo;

public class Aula69Salario {
    public String name;
    public double grossSalary;
    public double tax;


    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        this.grossSalary = netSalary() + ((percentage / 100) * grossSalary);
    }
}
