import javax.swing.*;
import java.awt.event.*;
public class Menu extends JFrame implements ActionListener{
    JMenu menu;
    JMenuBar bar;
    JMenuItem select,copy,cut,paste,exit;
    JTextArea ta;
    public Menu(){
        setSize(500,500);
        ta=new JTextArea();
        ta.setBounds(200,300,100,100);
        add(ta);
        bar=new JMenuBar();
        setJMenuBar(bar);
        menu=new JMenu("Menu");
        bar.add(menu);
        select=new JMenuItem("Select");
        copy=new JMenuItem("Copy");
        cut=new JMenuItem("Cut");
        paste=new JMenuItem("Paste");
        exit=new JMenuItem("Exit");
        menu.add(select);
        menu.add(copy);
        menu.add(cut);
        menu.add(paste);
        menu.addSeparator();
        menu.add(exit);
        setVisible(true);
        setLayout(null);
        select.addActionListener(this);
        copy.addActionListener(this);
        cut.addActionListener(this);
        paste.addActionListener(this);
        exit.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==select){
            ta.selectAll();
        }else if(e.getSource()==copy){
            ta.copy();
        }else if(e.getSource()==cut){
            ta.cut();
        }else if(e.getSource()==paste){
            ta.paste();
        }else{
            System.exit(0);
        }
    }
    public static void main(String[] args){
        new Menu();
    }
}
