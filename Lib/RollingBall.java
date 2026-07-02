package Lib;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class RollingBall extends JPanel implements ActionListener{

    int x = 100;
    int start_angle = 0;
   
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(x, 90, 80, 80);
        g.fillArc(x, 90, 80, 80, start_angle, 180);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }


}
