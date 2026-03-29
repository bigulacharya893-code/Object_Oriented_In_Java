package basicSwing;

import javax.swing.*;
import java.awt.*;

public class usingFont {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Font Example");
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(){
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.setFont(new Font("Times New Roman", Font.ITALIC,30));
                g.drawString("Hello, Swing!",200,20);
            }
        };
        frame.add(panel);
        frame.setVisible(true);
    }
}
