import java.awt.FlowLayout;
import javax.swing.*;
public class App {
    
    public static void main(String[] args) throws Exception {
        
        System.out.println("Hello, World!");
        JFrame frame = new JFrame("BINGOゲーム");
        JLabel label = new JLabel("BINGOゲーム");
        JButton button = new JButton("スタート");
        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(label);
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,100);
        frame.setVisible(true);

    }
}
