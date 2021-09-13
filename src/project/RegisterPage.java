package project;

import javax.swing.*;
import java.awt.*;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class RegisterPage implements ActionListener {
        JFrame fr;
        JLabel lbl_heading, lbl_fname, lbl_lname, lbl_email, lbl_pass, lbl_cpass, background;
        JButton btn_register, btn_cancel;
        JTextField txt_fname, txt_lnamae, txt_email;
        JPasswordField pw, cpw;
        JPanel p;
        Font fon1, fon2;
        Image bgimage;

        public RegisterPage(){
            fr = new JFrame(" registration page");
//        fr.getContentPane().setBackground(Color.orange);

            ImageIcon background = new ImageIcon("/Users/kriipa/IdeaProjects/SecondSem/src/images/background.png");
            bgimage = background.getImage();
            Image temp = bgimage.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
            background = new ImageIcon(temp);
            JLabel back = new JLabel(background);
            back.setBounds(0, 0, 500, 500);
            back.setLayout(null);
            back.setVisible(true);
            fr.add(back);

            fon1 = new Font("cambria", Font.BOLD, 22);
            fon2 = new Font("cambria", Font.BOLD, 20);

            lbl_heading = new JLabel(" User Registration");
            lbl_heading.setForeground(Color.pink);
            lbl_heading.setBounds(140, 05, 210, 60 );
            lbl_heading.setFont(fon1);
            back.add(lbl_heading);


            lbl_fname = new JLabel("first name");
            lbl_fname.setForeground(Color.gray);
            lbl_fname.setFont(fon2);
            lbl_fname.setBounds(30, 60, 150, 60);
            back.add(lbl_fname);

            // text field
            txt_fname = new JTextField();
            txt_fname.setFont(fon1);
            txt_fname.setBounds(200, 65, 250, 50);
            back.add(txt_fname);

            lbl_lname = new JLabel("last name");
            lbl_lname.setForeground(Color.gray);
            lbl_lname.setFont(fon2);
            lbl_lname.setBounds(30, 120, 150, 60);
            back.add(lbl_lname);

            // text field
            txt_lnamae = new JTextField();
            txt_lnamae.setFont(fon1);
            txt_lnamae.setBounds(200, 125, 250, 50);
            back.add(txt_lnamae);

            lbl_email = new JLabel("email");
            lbl_email.setForeground(Color.gray);
            lbl_email.setFont(fon2);
            lbl_email.setBounds(30, 180, 150, 60);
            back.add(lbl_email);

            // text field
            txt_email = new JTextField();
            txt_email.setFont(fon1);
            txt_email.setBounds(200, 185, 250, 50);
            back.add(txt_email);

            // Password
            lbl_pass = new JLabel("password");
            lbl_pass.setForeground(Color.gray);
            lbl_pass.setFont(fon2);
            lbl_pass.setBounds(30, 240, 150, 60);
            back.add(lbl_pass);

            pw = new JPasswordField();
            pw.setFont(fon1);
            pw.setBounds(200, 245, 250, 50);
            back.add(pw);

            // Password
            lbl_cpass = new JLabel("confirm password");
            lbl_cpass.setForeground(Color.gray);
            lbl_cpass.setFont(fon2);
            lbl_cpass.setBounds(30, 300, 150, 60);
            back.add(lbl_cpass);

            cpw = new JPasswordField();
            cpw.setFont(fon1);
            cpw.setBounds(200, 305, 250, 50);
            back.add(cpw);

            btn_register = new JButton("register");
            btn_register.setFont(fon2);
            btn_register.setBounds(380, 370, 100, 40);
            btn_register.addActionListener(this);
            back.add(btn_register);


            btn_cancel = new JButton("cancel");
            btn_cancel.setFont(fon2);
            btn_cancel.setBounds(380, 430, 100, 30);
            btn_cancel.addActionListener(this);
            back.add(btn_cancel);


            fr.getContentPane().setBackground(Color.pink);

            fr.setLayout(null);
            fr.setSize(500, 500);
            fr.setVisible(true);
            fr.setLocation(480,230);


        }
        public static void main(String[] args){
            new RegisterPage();
        }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== btn_register){
            new Login();
            fr.dispose();
        }
        else if (e.getSource()== btn_cancel){
            fr.dispose();
        }
    }
}
