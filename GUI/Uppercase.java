import java.awt.event.*;
import javax.swing.*;
class Uppercase implements ActionListener
{
    JFrame f;
    JTextField t;
    JButton b;
    public Uppercase()
    {
        f=new JFrame("Uppercase");
        f.setSize(500,400);
        t=new JTextField();
        t.setBounds(200,150,250,100);
        b=new JButton("Press");
        b.setBounds(200,100,200,150);
        f.add(t);
        f.add(b);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        String txt=t.getText();
        txt=txt.toUpperCase();
        t.setText(txt);
    }
    public static void main(String[] args) {
        new Uppercase();
    }
}
