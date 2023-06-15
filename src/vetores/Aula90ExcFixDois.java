package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Aula90ExcFixDois {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        double vec[] = new double[n];

        for (int i = 0; i < vec.length; i++){
            vec [i] = sc.nextDouble();
        }

        for (int i = 0; i < vec.length; i++){
            System.out.println(vec[i]);
        }

        for (int i = 0; i < vec.length; i++) {
            sum += vec[i];
        }

        System.out.println("Soma: " + sum);
        System.out.println("Média: " + sum/n);


    }
}
