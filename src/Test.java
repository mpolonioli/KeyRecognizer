import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class Test extends KeyAdapter
{
    public static void main(String[] args) throws Exception
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setFocusable(true);
        frame.getContentPane().addKeyListener(new Test());
        frame.pack();
        frame.setSize(200, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
 
    public void keyReleased(KeyEvent e)
    {
        Component parent = e.getComponent();
        int code = e.getKeyCode();
        char c = e.getKeyChar();
        String text = KeyEvent.getKeyText(code);
        String message = String.format("%d / %c: %s", code, c, text);
        JOptionPane.showMessageDialog(parent, message);
    }
}