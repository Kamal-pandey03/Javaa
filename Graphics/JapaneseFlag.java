import javax.swing.*;
import java.awt.*;

public class JapaneseFlag extends JFrame{
    public JapaneseFlag(){
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g){
        final int x=125;
        final int y=125;
        final int width=150;
        final int height=150;
        g.setColor(Color.RED);
        g.fillOval(x, y, width, height);
    }
    public static void main(String [] args){
        new JapaneseFlag();
    }
}
