package OOP.vector;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int length = sc.nextInt();
        int[] vect = new int[length];

        for(int i = 0; i < length; i++) {
            System.out.printf("(%d/%d) Adicione um valor inteiro ao vetor: ", i+1, length);
            vect[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i=0; i < vect.length; i++) {
            sum += vect[i];
        }
        int avg = sum / length;

        System.out.printf("%nSoma total dos valores: %d%n", sum);
        System.out.printf("Média da soma dos valores: %d%n", avg);

        sc.close();
    }
}
