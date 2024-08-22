import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String name = "Arthur";
        char gender = 'M';
        int y = 20;
        System.out.printf("name: %s, gender: %c, age: %d%n", name, gender, y);

        double x = 10.1416;
        System.out.printf("Result = %.2f cm%n", x);
    }
}