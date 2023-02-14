import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Drawing extends JFrame implements MouseMotionListener{
    public Drawing(){
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseMotionListener(this);
    }
    public void mouseDragged(MouseEvent e){
        Graphics g=getGraphics();
        g.setColor(Color.BLACK);
        g.fillOval(e.getX(),e.getY(),10,10);
    }
    public void mouseMoved(MouseEvent e){}
    public static void main(String[] args){
        new Drawing();
    }
}