import javax.swing.*;
import java.awt.*;

public class lab12 extends JFrame {
    private MyPanel panel = new MyPanel();
    public lab12() {
        setTitle("fillXXX 사용 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        setSize(150, 300);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.RED);
            g.drawRect(10,10,50, 50); g.fillRect(70,10,50,50);
            g.setColor(Color.ORANGE);
            g.fillOval(10, 70, 50, 50); g.drawOval(70,70,50, 50);
            g.setColor(Color.GREEN);
            g.drawRoundRect(10, 130, 50, 50, 20, 20); g.fillRoundRect(70,130,50,50,20,20);
            g.setColor(Color.MAGENTA);
            g.fillArc(40, 190, 50, 50, 0, 180);
            g.setFont(new Font("Times New Roman",Font.PLAIN,30));
            g.drawString("We win!!",20,240);
        }
    }
        

    public static void main(String[] args) {
        new lab12();
    }
}