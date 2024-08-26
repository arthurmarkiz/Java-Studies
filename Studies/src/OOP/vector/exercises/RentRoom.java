package OOP.vector.exercises;

public class RentRoom {
    private final String name;
    private final String email;
    private final int room;
    public RentRoom(String name, String email, int room) {
        this.name = name;
        this.email = email;
        this.room = room;
    }
    public void displayRent() {
        System.out.printf("%d: %s, %s%n", room, name, email);
    }
}
