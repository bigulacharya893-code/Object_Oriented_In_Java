package eventHandling;
import javax.swing.*;
import java.awt.event.*;

public class MouseImageExample implements MouseListener {
    public MouseImageExample(){
        JFrame f = new JFrame("MouseEvent Example");
        JButton b = new JButton("Hover or Click");
        b.addMouseListener(this);
        f.add(b);
        f.setSize(30,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void mouseClicked(MouseEvent e){
        System.out.println("Mouse Clicked");
    }
    public void mousePressed(MouseEvent e){
        System.out.println("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent e){
        System.out.println("Mouse Released");
    }
    public void mouseEntered(MouseEvent e){
        System.out.println("Mouse Entered");
    }
    public void mouseExited(MouseEvent e){
        System.out.println("Mouse Exited");
    }
    public static void main(String[] args){
        new MouseImageExample();
    }
}
