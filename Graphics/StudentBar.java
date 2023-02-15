import javax.swing.*;
import java.awt.*;

class StudentBar extends JFrame{
    final int[] data={20,12,10,6};
    final int frame_height=500;
    final int frame_width=500;
    final int bar_width=50;
    public StudentBar(){
        setSize(frame_width,frame_height);
        setVisible(true);
    }
    public int getMax(){
        int max=0;
        for(int i: data){
            if(i>max){
                max=i;
            }
        }
        return max;
    }
    public int[] transformData(){
        int [] td=new int[data.length];
        int max_height=420;
        int max=getMax();
        for(int i=0; i<data.length; i++){
            td[i]=Math.round((max_height*data[i])/max);
        }
        return td;
    }
    public void paint(Graphics g){
        Color [] colors={Color.BLUE,Color.GRAY,Color.RED,Color.GREEN};
        int[] t= transformData();
        for(int i=0;i<t.length;i++){
            g.setColor(colors[i]);
            g.fillRect(i*bar_width,frame_height-t[i],bar_width,t[i]);
        }
    }
    public static void main(String[] args){
        new StudentBar();
    }
}