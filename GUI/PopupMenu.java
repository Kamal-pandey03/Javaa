import javax.swing.*;
import java.awt.event.*;

class PopupMenu extends JFrame implements MouseListener, ActionListener{
    JPopupMenu popup;
    JMenuItem sa,copy,cut,paste,exit;
    JTextField ta;
    public PopupMenu(){
        setSize(500,500);
        ta=new JTextField();
        ta.setBounds(200,200,150,60);
        popup=new JPopupMenu("Menu");
        sa=new JMenuItem("Select");
        copy=new JMenuItem("Copy");
        cut=new JMenuItem("Cut");
        paste=new JMenuItem("Paste");
        exit=new JMenuItem("Exit");
        popup.add(sa);
        popup.add(copy);
        popup.add(cut);
        popup.add(paste);
        popup.addSeparator();
        popup.add(exit);
        setVisible(true);
        setLayout(null);
        sa.addActionListener(this);
        copy.addActionListener(this);
        cut.addActionListener(this);
        paste.addActionListener(this);
        exit.addActionListener(this);
        addMouseListener(this);
        add(popup);
        add(ta);
    }
    public void mouseClicked(MouseEvent e){
        popup.show(this,e.getX(),e.getY());
    }
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){
    }
    public void mouseExited(MouseEvent e){
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==sa){
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
        new PopupMenu();
    }
}
