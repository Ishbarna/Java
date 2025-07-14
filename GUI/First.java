import java.awt.*;
class First{
    Frame f;
    TextField t;
    Button b;
    public First()
    {
        f=new Frame();
        f.setTitle("Gui application");
        f.setSize(400,500);
        t=new TextField();
        t.setBounds(100,150,250,100);
        b=new Button("OK");
        b.setBounds(100,350,150,100);
        f.add(t);
        f.add(b);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new First();
    }
}