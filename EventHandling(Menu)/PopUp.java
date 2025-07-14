import java.awt.event.*;
import javax.swing.*;
class PopUp extends MouseAdapter implements ActionListener
{
    JFrame f;
    JLabel l;
    JPopupMenu popUp;
    JMenuItem one,two;
    public PopUp()
    {
        f=new JFrame();
        f.setSize(400,400);
        l=new JLabel("Not Selected");
        l.setBounds(200,100,150,100);
        f.add(l);
        popUp=new JPopupMenu();
        one=new JMenuItem("one");
        two=new JMenuItem("Two");
        popUp.add(one);
        popUp.add(two);
        f.add(popUp);
        one.addActionListener(this);
        two.addActionListener(this);
        f.addMouseListener(this);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void mouseClick(MouseEvent e)
    {
        popUp.show(f,e.getX(),e.getY());
    }
    public void actionPerformed(ActionEvent e){
        String item=e.getActionCommand();
        l.setText(item);
    }
    public static void main(String[] args) {
        new PopUp();
    }
}