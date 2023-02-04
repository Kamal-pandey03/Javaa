import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class OddEveninput implements ActionListener{
    TextField t;
    Label l;
    public OddEveninput(){
        Frame f=new Frame("Odd Even");
        t = new TextField();
        l=new Label();
        Button b=new Button("Click");
        f.setSize(300,300);
        t.setBounds(100,50,100,50);
        l.setBounds(150,110,70,30);
        b.setBounds(150,160,80,30);
        f.add(t);
        f.add(l);
        f.add(b);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        int num=Integer.parseInt(t.getText());
        if(num%2==0){
            l.setText("Evennnnn");
        }
        else{
            l.setText("Odddd");
        }
    }
    public static void main(String[] args){
        new OddEveninput();
    }
}
