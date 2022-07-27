package week_14_UAS; // hapus ini jika terjadi error pada kompiler anda

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.sound.sampled.*;

import java.io.File;

public class Program{
    public static void main(String[] args) {
        File file = new File("week_14_UAS/Undertale.wav");

        JFrame frame = new JFrame("Program penyapa");
        

        JLabel Label = new JLabel("Input Nama :");
        Label.setForeground(Color.BLACK);
        Label.setBounds(30, 10, 100, 20);

        JTextField inputNamaJTextField = new JTextField();
        inputNamaJTextField.setBounds(160, 10, 130, 20);

        JButton Submit = new JButton("Submit");
        Submit.setBounds(125, 100, 100, 30);

        Submit.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                try{
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
                Clip clip = AudioSystem.getClip();
                clip.open(audioStream);
                clip.start();            
                
                String InputNama = inputNamaJTextField.getText().toString();

                ImageIcon Hai = new ImageIcon("week_14_UAS/Hai2.png");
                
                JLabel PositionImage = new JLabel(Hai);
                JPanel panel = new JPanel(new GridBagLayout());
                panel.add(PositionImage);
                JPanel namaJPanel = new JPanel(new GridLayout(3,10));
                

                namaJPanel.add(new JLabel( "Hai " + InputNama + ", Have a good day!"));
                JPanel panel2 = new JPanel(new BorderLayout());
                panel2.add(namaJPanel);
                panel2.add(panel, BorderLayout.SOUTH);
                JOptionPane.showMessageDialog(null, 
                panel2, "Hai", JOptionPane.DEFAULT_OPTION);
                clip.stop();
                }catch(Exception exception){}
            }  
        });  

        
        frame.add(Label);
        frame.add(inputNamaJTextField);
        frame.add(Submit);
        frame.setLocation(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350,200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
