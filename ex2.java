import javax.swing.*;
import java.awt.*;
public class lab1202 extends JFrame {
    private MyPanel panel = new MyPanel();
    public lab1202() {
        setTitle("fillArc 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        setSize(140, 160);
        setVisible(true);
    }
    class MyPanel extends JPanel {
        public void paintComponent(Graphics g)  {
            super.paintComponent(g);
            g.setColor(Color.RED);
            g.fillArc(10,10,100,100,90,120);
            g.setColor(Color.BLUE);
            g.fillArc(10,10,100,100,210,120);
            g.setColor(Color.YELLOW);
            g.fillArc(10,10,100,100,330,120);

        }
    }
    public static void main(String[]args) {
        new lab1202();
    }
}