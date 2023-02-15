import javax.swing.*;
import java.awt.*;

class StudentPie extends JFrame{
    final int[] data={20,12,10,6};
    public StudentPie(){
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public int getTotal(){
        int sum=0;
        for(int i: data){
            sum+=i;
        }
        return sum;
    }
    public int[] getAngle(){
        int [] angles=new int[data.length];
        int total=getTotal();
        for(int i=0; i<data.length; i++){
            angles[i]=Math.round(360*data[i]/total);
        }
        return angles;
    }
    public void paint(Graphics g){
        Color [] colors={Color.BLUE,Color.GRAY,Color.RED,Color.GREEN};
        int[] angles= getAngle();
        int startAngle=0;
        for(int i=0;i<angles.length;i++){
            g.setColor(colors[i]);
            g.fillArc(100,100,200,200,startAngle,angles[i]);
            startAngle+=angles[i];
        }
    }
    public static void main(String[] args){
        new StudentPie();
    }
}