package introducao_poo;

public class Aula69Estudante {
    public String nome;
    public double notaPrimeiroTrimestre;
    public double notaSegundoTrimestre;
    public double notaTerceiroTrimestre;

    public double somaNotas(){
        return notaPrimeiroTrimestre*0.30
                + notaSegundoTrimestre*0.35
                + notaTerceiroTrimestre*0.35;
    }

    public void aprovacao(){
        somaNotas();
        if(somaNotas() > 60.00){
            System.out.println("PASS");
            System.out.printf("FINAL GRADE %.2f POINTS%n", somaNotas());
        }
        else {
            double notaParaAprovacao = 60.0 - somaNotas();
            System.out.println("FAILED");
            System.out.printf("FINAL GRADE %.2f POINTS%n", somaNotas());
            System.out.printf("MISSING %.2f POINTS%n", notaParaAprovacao);
        }
    }
}
