import javax.swing.*;
import java.awt.*;

public class lab12020 extends JFrame {
    private MyPanel panel = new MyPanel();

    public lab12020() {
        setTitle("커피");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        setSize(700, 300);
        setVisible(true);
}

class MyPanel extends JPanel {
    Image imgA=new ImageIcon("images/6.gif").getImage();
    Image imgB=new ImageIcon("images/24.gif").getImage();

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width=getWidth()/2;

        g.drawImage(imgA,0,0,width,getHeight(),this);
        g.drawImage(imgB,width,getHeight(),this);
    }
}
public static void main(String[]args) {
    new lab12020();
}
    }