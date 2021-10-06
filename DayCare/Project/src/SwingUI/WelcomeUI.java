package SwingUI;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;

import edu.neu.csye6200.*;
import SwingUI.LogInUI;
import java.awt.*;

public class WelcomeUI {

    public static JFrame welcome = new JFrame("Welcome");


    public WelcomeUI() {

        DaycareSingleton.getInstance().initializeData();

        //JFrame jf = new JFrame("Classroom Situation");

        welcome.setBounds(100, 100, 800, 500);
        welcome.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        welcome.setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        JLabel title = new JLabel("Welcome to NEU Day Care System");
        title.setBounds(150, 10, 600, 80);
        title.setFont(new Font("Serif", Font.ITALIC, 30));
        //title.setLineWrap(true);
        //title.setWrapStyleWord(true);
        panel.add(title);
        /*
        JTextArea titleJTextArea = new JTextArea("Welcome to NEU Day Care System");
        titleJTextArea.setBounds(250, 10, 300, 80);
        titleJTextArea.setFont(new Font("Serif", Font.ITALIC, 40));
        titleJTextArea.setLineWrap(true);
        titleJTextArea.setWrapStyleWord(true);
        panel.add(titleJTextArea);*/

        JLabel imageLabel = new JLabel(new ImageIcon("daycare.jpg"));

        imageLabel.setBounds(0, 0, 800, 400);
        imageLabel.setVisible(true);
        panel.add(imageLabel);


        JButton signinButton = new JButton("Sign in");
        signinButton.setBounds(350, 420, 100, 50);

        signinButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               // ClassroomUI homepage = new ClassroomUI();
                //LogInUI.initializeLoginView();
//                MyLoginGUI.initializeLoginView();
                new MyLoginGUI().setVisible(true);
                welcome.setVisible(false);
            }
        });
//        signinButton.addActionListener(new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                ClassroomUI homepage = new ClassroomUI();
//               LogInUI.initializeLoginView();
//                new MyLoginGUI();
//                MyLoginGUI.initializeLoginView();
//                welcome.setVisible(false);
//            }
//        });

        panel.add(signinButton);

        welcome.setContentPane(panel);
        welcome.setVisible(true);

    }
}
