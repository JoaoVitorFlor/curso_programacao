package introducao_poo;

import java.util.Locale;
import java.util.Scanner;

public class AulaExcTres {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aula69Estudante student = new Aula69Estudante();

        student.nome = sc.nextLine();
        student.notaPrimeiroTrimestre = sc.nextDouble();
        student.notaSegundoTrimestre = sc.nextDouble();
        student.notaTerceiroTrimestre = sc.nextDouble();
        student.aprovacao();

        sc.close();
        
    }
}
