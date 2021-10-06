package SwingUI;

import javax.swing.*;
import java.awt.event.*;

public class RePassword {
    private JButton forwardButton;
    private JTextField Username;
    private JPasswordField password1;
    private JTextField password2;
    private JPanel REPASSWORD;


    public RePassword() {
        forwardButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
            }
        });
        Username.addInputMethodListener(new InputMethodListener() {
            @Override
            public void inputMethodTextChanged(InputMethodEvent event) {
                Username.getText();
            }

            @Override
            public void caretPositionChanged(InputMethodEvent event) {

            }
        });
        forwardButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

            }
        });
    }
}
