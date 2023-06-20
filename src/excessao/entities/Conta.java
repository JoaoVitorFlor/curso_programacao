package excessao.entities;

import excessao.exceptions.BusinessException;

public class Conta {

    private String nomeCliente;

    private int numeroAtendimento;

    private Double saldo;

    private Double saqueLimite;

    public Conta(String nomeCliente, int numeroAtendimento, Double saldo, Double saqueLimite) {
        this.nomeCliente = nomeCliente;
        this.numeroAtendimento = numeroAtendimento;
        this.saldo = saldo;
        this.saqueLimite = saqueLimite;
    }

    public void Depoista (Double valorDepositado) {
        this.saldo = saldo + valorDepositado;
    }

    public void Saque (Double valorSaque){
        if (valorSaque > saldo){
            throw new BusinessException("Erro de saque: A quantia excede o limite de saque");
        }
        else if(valorSaque > saqueLimite){
            throw new BusinessException("Erro de saque: Saldo insuficiente");
        }
        else{
            this.saldo = saldo - valorSaque;
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", numeroAtendimento=" + numeroAtendimento +
                ", saldo=" + saldo +
                ", saqueLimite=" + saqueLimite +
                '}';
    }
}
