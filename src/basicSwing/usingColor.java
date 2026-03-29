package basicSwing;

import javax.swing.*;
import java.awt.*;

public class usingColor {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Example");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(){
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.setColor(Color.RED);
                g.fillRect(50,50,100,50);
                g.setColor(Color.BLUE);
                g.fillOval(200,50,100,50);
            }
        };
        frame.add(panel);
        frame.setVisible(true);
    }
}

