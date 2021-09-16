package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login implements ActionListener {
    JFrame frame;
    //    Image img;
    JLabel lbl_username, lbl_password, txt_title;
    JButton btn_login, btn_register;
    JTextField txt_username;
    JPasswordField txt_password;
    JPanel pan;
    Font fn, fn1;

        public Login() {
            frame = new JFrame("LMS");

            fn = new Font("Cambria", Font.BOLD, 25);
            fn1 = new Font("Cambria", Font.ITALIC, 15);

            txt_title = new JLabel("Login Credentials");
            txt_title.setFont(fn);
            txt_title.setForeground(Color.decode("#A7C0C8"));
            txt_title.setBounds(250, 50, 250, 30);

            lbl_username = new JLabel("User Name");
            lbl_username.setFont(fn1);
            lbl_username.setBounds(310, 150, 100, 20);

            lbl_password = new JLabel("Password");
            lbl_password.setFont(fn1);
            lbl_password.setBounds(310, 260, 100, 20);

            txt_username = new JTextField();
            txt_username.setBounds(240, 190, 210, 40);

            txt_password = new JPasswordField();
            txt_password.setBounds(240, 300, 210, 40);

            btn_login = new JButton("Login");
            btn_login.setForeground(Color.darkGray);
            btn_login.setBackground(Color.CYAN);
            btn_login.setBounds(240, 370, 100, 50);
            btn_login.addActionListener(this);
            frame.add(btn_login);

            btn_register = new JButton("Register");
            btn_register.setForeground(Color.darkGray);
            btn_register.setBackground(Color.CYAN);
            btn_register.setBounds(360, 370, 100, 50);
            btn_register.addActionListener(this);

            frame.add(btn_register);
            frame.add(txt_title);
            frame.add(lbl_username);
            frame.add(lbl_password);
            frame.add(txt_password);
            frame.add(txt_username);

            // JPanel
            pan = new JPanel();
            pan = new JPanel();
            pan.setLayout(null);
//            pan.setSize(450, 300);
            pan.setVisible(true);
            pan.setBackground(Color.decode("#A7C0C8"));
            pan.setBounds(125, 100, 450, 350);
            pan.setBorder(BorderFactory.createMatteBorder
                    (8, 8, 8, 8, Color.decode("#090C09")));

            frame.add(pan);

            frame.getContentPane().setBackground( Color.decode("#276891"));
            frame.setLayout(null);
            frame.setSize(700, 550);
            frame.setVisible(true);
            frame.setLocation(380,200);
        }
        public static void main(String[] Args) {
            new Login();
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn_register ){
            new RegisterPage();
            frame.dispose();
        }
        else if (e.getSource() == btn_login){

            String username = txt_username.getText();
            String password = txt_password.getText();
//            String query = " Select "
        }
    }


}
