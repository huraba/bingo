import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class App {
    private static int a = 0;
    public static void main(String[] args) throws Exception {

        
        List<Integer> bingoList = new ArrayList<>();
        Random random = new Random();

        for (int i = 1; i <= 75; i++) {
            bingoList.add(i);
        }
        Collections.shuffle(bingoList);
        
        
        JFrame frame = new JFrame("bingoゲーム");
        
       
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));


        JLabel label = new JLabel("Bingoゲーム");
        label.setAlignmentX(Component.CENTER_ALIGNMENT); 

        JLabel label2 = new JLabel();
        label2.setAlignmentX(Component.CENTER_ALIGNMENT);
      
        

        JButton button = new JButton("BINGO！");

        button.setAlignmentX(Component.CENTER_ALIGNMENT); 


        frame.getContentPane().add(label);
        
        frame.getContentPane().add(button);

        frame.getContentPane().add(label2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setVisible(true);
   

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
    
                
                if (a < bingoList.size()){

         
                    label2.setText(label2.getText() + (bingoList.get(a++) + ", "));
                } else {
        
                    label2.setText(label2.getText() + "終了");

                    button.setEnabled(false);
                }
            }
        });
    }

}


