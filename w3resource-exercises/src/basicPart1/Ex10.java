package basicPart1;

public class Ex10 {
    public static void main(String[] args) {

        int total = 0;

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (i != j && i != k && j != k) {
                        total++;
                        System.out.println(i + "" + j + k);
                    }
                }
            }
        }
        System.out.println("Número total de combinações diferentes: " + total);
    }
}
