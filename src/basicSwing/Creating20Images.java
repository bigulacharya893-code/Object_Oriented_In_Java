package basicSwing;
import javax.swing.*;
import java.awt.*;
public class Creating20Images {
    public static void main(String[] args){
        JFrame frame = new JFrame("20 Shapes Example");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(){
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawRect(50,50,100,50);
                g.drawOval(200,50,100,50);
                g.drawLine(50,150,300,150);
            }
        };
        frame.add(panel);
        frame.setVisible(true);
    }
}
