import javax.swing.*;
import java.awt.*;

public class SolitaireFrame extends JFrame {
    public SolitaireFrame() {
        add(new SolitairePanel());

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[]args) {
        SolitaireFrame frame = new SolitaireFrame();
        frame.setSize(new Dimension(795,600));
        frame.setMinimumSize(new Dimension(795,500));
    }
}
