package construtores_encapsulamento;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta("Joao Silva", 5550, 0.00);

        c1.deposito(200.00);

        c1.saque(50.00);

        System.out.println(c1.toString());
    }
}
