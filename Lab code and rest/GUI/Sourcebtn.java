import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Sourcebtn implements ActionListener{
    TextField t;
    Button b, b2;
    public Sourcebtn(){
        Frame f=new Frame("Odd Even");
        t = new TextField();
        b=new Button("Button 1");
        b2= new Button("Button 2");
        f.setSize(400,400);
        t.setBounds(150,50,100,50);
        b.setBounds(100,150,60,30);
        b2.setBounds(200,150,60,30);
        f.add(t);
        f.add(b);
        f.add(b2);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b){
            t.setText("Button 1");
        }
        else{
            t.setText("Button 2");
        }
        //System.out.println(e.getSource());
    }
    public static void main(String[] args){
        new Sourcebtn();
    }
}

