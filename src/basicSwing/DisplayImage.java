package basicSwing;

import javax.swing.*;

public class DisplayImage {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Example");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon("D:\\images.jpeg");
        JLabel label = new JLabel(icon);
        frame.add(label);
        frame.setVisible(true);
    }
}
