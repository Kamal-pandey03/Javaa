import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class GUI implements ActionListener{
    TextField t;
    public  GUI(){
        Frame f= new Frame("Kamal ^_^");
        t=new TextField();
        Button b=new Button("Click Me");
        f.setSize(500,500);
        t.setBounds(150,100,200,50);
        b.setBounds(200,200,100,50);
        f.add(t);
        f.add(b);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        t.setText("Kamal");
    }
    public static void main(String[] args){
        new GUI();
    }
}