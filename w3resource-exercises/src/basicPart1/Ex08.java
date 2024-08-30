package basicPart1;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        char[] letters = sc.nextLine().toCharArray();

        StringBuilder reversed = new StringBuilder();
        for (int i = letters.length - 1; i >= 0; i--) {
            reversed.append(letters[i]);
        }
        System.out.print("Frase invertida: " + reversed);
        sc.close();
    }
}
