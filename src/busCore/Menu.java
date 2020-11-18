package busCore;
import javax.swing.*;

public class Menu {
    public static void main(String[] args) {
    new Menu();
}

    public Menu() {

        JFrame frame = new JFrame("Bus System");
        frame.add(new StartPane());
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
