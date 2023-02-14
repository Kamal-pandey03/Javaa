import javax.swing.*;
import java.awt.*;

public class ItalianFlag extends JFrame{
    public ItalianFlag(){
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g){
        final int x=0;
        final int y=0;
        final int width=100;
        final int height=300;
        Color [] colors={Color.GREEN,Color.WHITE,Color.RED};
        for(int i=0;i<3;i++){
            g.setColor(colors[i]);
            g.fillRect(x+(i*width), y, width, height);
        }
    }
    public static void main(String [] args){
        new ItalianFlag();
    }
}
