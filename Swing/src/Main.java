import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame(); // Creates a frame

        frame.setTitle("My first swing app");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out on click X button
        frame.setResizable(false); // prevent frame resize
        frame.setSize(420, 420);
        frame.setVisible(true);

        frame.getContentPane().setBackground(new Color(120,45,250));
    }
}