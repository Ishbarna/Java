import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Evenodd extends JFrame implements ActionListener
{
    JButton b;
    JTextField t, ans;
    public Evenodd(){
        setSize(400,500);
        t=new JTextField();
        ans=new JTextField();
        b=new JButton("Click");
        t.setColumns(10);
        ans.setColumns(10);
        add(t);
        add(ans);
        add(b);
        setLayout(new FlowLayout());
        ans.setEditable(false);
        b.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        int num=Integer.parseInt(t.getText());
        if(num%2==0){
            ans.setText("even");
        }
        else{
            ans.setText("odd");
        }
    }
    public static void main(String[] args) {
        new Evenodd();
    }
}