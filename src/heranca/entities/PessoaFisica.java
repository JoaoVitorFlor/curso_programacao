package heranca.entities;

public class PessoaFisica extends Imposto {

    private Double gastoSaude;


    public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public Double tax() {
        if (20000.0 > getRendaAnual() )  {
            return (getRendaAnual() * 0.15) - (0.5 * gastoSaude);
        } else {
            return (getRendaAnual() * 0.25) - gastoSaude * 0.5;
        }
    }
}


