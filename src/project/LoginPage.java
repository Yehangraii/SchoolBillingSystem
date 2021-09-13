//package project;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.Image;
//import javax.swing.Icon;
//import javax.swing.ImageIcon;
////public class LoginPage {
//public class LoginPage implements ActionListener{
//        JFrame fr;
//        JLabel lbl_heading, lbl_username, lbl_password;
//        JTextField txt_username;
//        JPasswordField txt_password;
//        JButton btn_login, btn_cancel, btn_reg;
//        Font fon1, fon2;
//        Image bgimage;
//
//        public LoginPage(){
//            fr = new JFrame("Login Page");
//
////        ImageIcon background = new ImageIcon("/Users/kriipa/IdeaProjects/SecondSem/src/images/background.png");
////        bgimage = background.getImage();
////        Image temp = bgimage.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
////        background = new ImageIcon(temp);
////        JLabel back = new JLabel(background);
////        back.setBounds(0, 0, 500, 500);
////        back.setLayout(null);
////        back.setVisible(true);
////        fr.add(back);
//
//
//            fon1 = new Font("cambria", Font.BOLD, 24);
//            fon2 = new Font("cambria", Font.BOLD, 16);
//
//            // heading
//            lbl_heading = new JLabel("Login credentials");
//            lbl_heading.setBounds(150, 10,250, 90 );
//            lbl_heading.setForeground(Color.blue);
//            lbl_heading.setFont(fon1);
//            fr.add(lbl_heading);
//
//            // label
//            lbl_username = new JLabel("username");
//            lbl_username.setForeground(Color.gray);
//            lbl_username.setFont(fon2);
//            lbl_username.setBounds(50, 150, 150, 60);
//            fr.add(lbl_username);
//
//            // text field
//            txt_username = new JTextField();
//            txt_username.setFont(fon1);
//            txt_username.setBounds(200, 155, 250, 50);
//            fr.add(txt_username);
//
//            // label for pw:
//            lbl_password = new JLabel("password");
//            lbl_password.setForeground(Color.gray);
//            lbl_password.setFont(fon2);
//            lbl_password.setBounds(50, 250, 150, 60);
//            fr.add(lbl_password);
//
//            //text field for pw
//            txt_password = new JPasswordField();
//            txt_password.setFont(fon1);
//            txt_password.setBounds(200, 250, 250, 50);
//            fr.add(txt_password);
//
//            // button
//            btn_login = new JButton("login");
//            btn_login.setFont(fon2);
//            btn_login.setBounds(200, 300, 70, 50);
//            fr.add(btn_login);
//
//
//            btn_cancel = new JButton("cancel");
//            btn_cancel.setFont(fon2);
//            btn_cancel.setBounds(300, 300, 70, 50);
//            fr.add(btn_cancel);
//
////        btn_reg = new JButton("register");
////        btn_reg.setForeground(Color.ORANGE);
////        btn_reg.setBounds(350, 300, 80, 40);
////        btn_reg.addActionListener(this);
////        fr.add(btn_reg);
//
//            btn_reg = new JButton("register");
//            btn_reg.setFont(fon2);
//            btn_reg.setBounds(350, 370, 100, 40);
//            fr.add(btn_reg);
//
//
//            fr.setVisible(true);
//            fr.setSize(500, 500);
//            fr.setLayout(null);
//
//        }
//
//        public static void main(String[] args){
//            new LoginPage() ;
//        }
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            if (e.getSource()== btn_reg) {
//                new RegisterPage();
//            }
//        }
//
//
//
//}
