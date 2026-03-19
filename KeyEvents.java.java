//Q1. write program to demonstrate key events when key is pressed and diaplay key press message
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
class Q1{
    JFrame f;
    JPanel p;
    JTextField t;
    JLabel l;  
    JLabel l1;  
  
    Q1(){
        f = new JFrame("Key Event");
        f.setSize(500,500);
        f.setLocation(1000,100);
        
        p = new JPanel();
        p.setLayout(null);
        f.add(p);

        t = new JTextField("Type Here..!");
        t.setBounds(150, 200, 200, 50);
        p.add(t);

        l = new JLabel("State :");
        l.setBounds(150,250,50,50);
        p.add(l);

        l1 = new JLabel("No Change...!");
        l1.setBounds(200,250,100,50);
        p.add(l1);   
        
        t.addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e){
                l1.setText("Key Pressed..!");
            }

            public void keyReleased(KeyEvent e){
                l1.setText("key Released..!");
            }

            public void keyTyped(KeyEvent e){
                l1.setText("Typing...");
            }
        });

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new Q1();
    }
}