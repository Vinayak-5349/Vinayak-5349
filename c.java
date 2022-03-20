import javax.swing.*;
import java.awt.event.*;
public class Simple{
  public static void main(String [] args){
    JFrame f=new JFrame("welcom to java");
    final JTextField tf=new JTextField();
    tf.setBounds(20,30,10,10);
    JButton  b=new JButton("ck");
    b.setBounds(20,2,40,40);
    b.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        tf.setText("welcome");
      }
    });
      f.add(b);
    f.add(tf);
    f.setVisible(true);
      f.setLayout(null);
    f.setSize(120,120);
    
    
  }
  
}
