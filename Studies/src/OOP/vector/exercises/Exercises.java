package OOP.vector.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos quartos serão alugados?: ");
        int roomsRented = sc.nextInt();
        System.out.println();

        RentRoom[] rooms = new RentRoom[10];
        for (int i = 0; i < roomsRented; i++) {
            System.out.printf("Quarto #%d:%n", i + 1);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Quarto: ");
            int room = sc.nextInt();
            System.out.println();

            rooms[room - 1] = new RentRoom(name, email, room);
        }

        System.out.println("Quartos Ocupados:");
        for (RentRoom room : rooms) {
            if (!(room == null))
                room.displayRent();
        }

        sc.close();
    }
}
