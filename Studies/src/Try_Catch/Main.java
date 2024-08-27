package Try_Catch;

import java.lang.reflect.Method;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        method1();

        System.out.println("Fim do programa.");

    }

    public static void method1() {
        System.out.println("**** METHOD1 START ****");
        method2();
        System.out.println("**** METHOD1 END ****");
    }

    public static void method2() {
        System.out.println("**** METHOD2 START ****");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição Inválida!");
//            e.printStackTrace();
        }
        catch (InputMismatchException e) {
            System.out.println("Valor Inválido!");
        }
        finally {
            System.out.println("Opa, aqui é o FINALLY :)");
        }
        System.out.println("**** METHOD2 END ****");
        sc.close();
    }
}
