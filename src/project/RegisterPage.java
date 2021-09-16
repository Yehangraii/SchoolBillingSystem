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
        JPanel pan;
        Font fon1, fon2;
        Image bgimage;

        public RegisterPage(){
            fr = new JFrame(" registration page");

            ImageIcon background = new ImageIcon
                    ("/Users/kriipa/IdeaProjects/ManagementSystem/src/project/Images/Earth Day Run 2020.png");
            bgimage = background.getImage();
            Image temp = bgimage.getScaledInstance(700, 650, Image.SCALE_SMOOTH);
            background = new ImageIcon(temp);
            JLabel back = new JLabel(background);
            back.setBounds(0, 0, 700, 650);
            back.setLayout(null);
            back.setVisible(true);
            fr.add(back);

            fon1 = new Font("cambria", Font.BOLD, 22);
            fon2 = new Font("cambria", Font.BOLD, 20);

            lbl_heading = new JLabel(" User Registration");
            lbl_heading.setForeground(Color.pink);
            lbl_heading.setBounds(290, 0, 210, 60 );
            lbl_heading.setFont(fon1);
            back.add(lbl_heading);


            lbl_fname = new JLabel("First name");
            lbl_fname.setForeground(Color.gray);
            lbl_fname.setFont(fon2);
            lbl_fname.setBounds(140, 60, 150, 60);
            back.add(lbl_fname);

            // text field
            txt_fname = new JTextField();
            txt_fname.setFont(fon1);
            txt_fname.setBounds(360, 65, 250, 50);
            back.add(txt_fname);

            lbl_lname = new JLabel("Last name");
            lbl_lname.setForeground(Color.gray);
            lbl_lname.setFont(fon2);
            lbl_lname.setBounds(140, 120, 150, 60);
            back.add(lbl_lname);

            // text field
            txt_lnamae = new JTextField();
            txt_lnamae.setFont(fon1);
            txt_lnamae.setBounds(360, 125, 250, 50);
            back.add(txt_lnamae);

            lbl_email = new JLabel("Email");
            lbl_email.setForeground(Color.gray);
            lbl_email.setFont(fon2);
            lbl_email.setBounds(140, 180, 150, 60);
            back.add(lbl_email);

            // text field
            txt_email = new JTextField();
            txt_email.setFont(fon1);
            txt_email.setBounds(360, 185, 250, 50);
            back.add(txt_email);

            // Password
            lbl_pass = new JLabel("Password");
            lbl_pass.setForeground(Color.gray);
            lbl_pass.setFont(fon2);
            lbl_pass.setBounds(140, 240, 150, 60);
            back.add(lbl_pass);

            pw = new JPasswordField();
            pw.setFont(fon1);
            pw.setBounds(360, 245, 250, 50);
            back.add(pw);

            // Password
            lbl_cpass = new JLabel("Confirm password");
            lbl_cpass.setForeground(Color.gray);
            lbl_cpass.setFont(fon2);
            lbl_cpass.setBounds(140, 300, 200, 60);
            back.add(lbl_cpass);

            cpw = new JPasswordField();
            cpw.setFont(fon1);
            cpw.setBounds(360, 305, 250, 50);
            back.add(cpw);

            btn_register = new JButton("register");
            btn_register.setFont(fon2);
            btn_register.setBounds(390, 410, 100, 60);
            btn_register.addActionListener(this);
            back.add(btn_register);


            btn_cancel = new JButton("cancel");
            btn_cancel.setFont(fon2);
            btn_cancel.setBounds(260, 410, 100, 60);
            btn_cancel.addActionListener(this);
            back.add(btn_cancel);

            pan = new JPanel();
            pan = new JPanel();
            pan.setLayout(null);
//            pan.setSize(450, 300);
            pan.setVisible(true);
            pan.setBackground(Color.decode("#8BCAE5"));
            pan.setBounds(125, 50, 500, 450);
            pan.setBorder(BorderFactory.createMatteBorder
                    (8, 8, 8, 8, Color.decode("#090C09")));

            back.add(pan);


            fr.getContentPane().setBackground(Color.decode("#F5CAC3"));

            fr.setLayout(null);
            fr.setSize(700, 650);
            fr.setVisible(true);
            fr.setLocation(400,140);


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
