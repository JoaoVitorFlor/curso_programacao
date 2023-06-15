package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Aula90ExcFixOne {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double vec[] = new double[n];
        if (n <= 10) {
            for (int i = 0; i < vec.length; i++) {
                System.out.println("Digite um numero:");
                vec[i] = sc.nextInt();
            }
            System.out.println("NUMEROS NEGATIVOS:");

            for (int i=0; i <vec.length; i++) {
                if (vec[i] < 0) {
                    System.out.println(vec[i]);
                }
            }

        }



        sc.close();
    }
}
