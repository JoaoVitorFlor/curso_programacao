package construtores_encapsulamento;

public class Conta {

    public static final double TAXA_SAQUE = 5.00;
    private String nomeTitular;
    private double numeroConta;
    private double saldoInicial;

    public Conta(String nomeTitular, double numeroConta, double saldoInicial) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldoInicial = saldoInicial;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getNumeroConta() {
        return numeroConta;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void deposito (double valorDepoisto){
        this.saldoInicial = saldoInicial + valorDepoisto;
    }

    public void saque (double valorSaque){
        this.saldoInicial = saldoInicial - valorSaque - TAXA_SAQUE;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nomeTitular='" + nomeTitular + '\'' +
                ", numeroConta=" + numeroConta +
                ", saldoInicial=" + saldoInicial +
                '}';
    }
}
