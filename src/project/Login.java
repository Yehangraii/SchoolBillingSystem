package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login implements ActionListener {
    JFrame frame;
    //    Image img;
    JLabel lbl_username, lbl_password, txt_title;
    JButton btn_login, btn_register;
    JTextField txt_username;
    JPasswordField txt_password;
    JPanel pan;
    Font fn, fn1;
    Image bgimage;

    public Login() {
        frame = new JFrame("Login Page");

        fn = new Font("Cambria", Font.BOLD, 25);
        fn1 = new Font("Cambria", Font.ITALIC, 15);


        ImageIcon background = new ImageIcon
                ("/Users/kriipa/IdeaProjects/ManagementSystem/src/project/Images/Sign up today!.png");
        bgimage = background.getImage();
        Image temp = bgimage.getScaledInstance(700, 550, Image.SCALE_SMOOTH);
        background = new ImageIcon(temp);
        JLabel back = new JLabel(background);
        back.setBounds(0, 0, 700, 550);
        back.setLayout(null);
        back.setVisible(true);
        frame.add(back);

//        txt_title = new JLabel("Login Credentials");
//        txt_title.setFont(fn);
//        txt_title.setForeground(Color.decode("#628474"));
//        txt_title.setBounds(250, 50, 250, 30);

        lbl_username = new JLabel("Email");
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
        back.add(btn_login);

        btn_register = new JButton("Register");
        btn_register.setForeground(Color.darkGray);
        btn_register.setBackground(Color.CYAN);
        btn_register.setBounds(360, 370, 100, 50);
        btn_register.addActionListener(this);

        back.add(btn_register);
//        back.add(txt_title);
        back.add(lbl_username);
        back.add(lbl_password);
        back.add(txt_password);
        back.add(txt_username);

        // JPanel
        pan = new JPanel();
        pan = new JPanel();
        pan.setLayout(null);
//            pan.setSize(450, 300);
        pan.setVisible(true);
        pan.setBackground(Color.decode("#628474"));
        pan.setBounds(125, 100, 450, 350);
        pan.setBorder(BorderFactory.createMatteBorder
                (8, 8, 8, 8, Color.decode("#090C09")));

        back.add(pan);

        frame.getContentPane().setBackground(Color.decode("#276891"));
        frame.setLayout(null);
        frame.setSize(700, 550);
        frame.setVisible(true);
        frame.setLocation(380, 200);
    }

    public static void main(String[] Args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String username = txt_username.getText();
        String password = txt_password.getText();

        if (e.getSource()==btn_login){
            String query = "Select email,password from register where email='"+username+"'and password ='"
                    +password+"'";
            DataBase db =new DataBase();
            ResultSet rs= db.select(query);
            try {
                if (username.length()==0 && password.length()==0){
                    JOptionPane.showMessageDialog(btn_login,"fill the fields!!");
                }else if (rs.next()){
                    JOptionPane.showMessageDialog(btn_login,"Login Successful!");
                    new Dashboard();
                    frame.dispose();
                }else{
                    JOptionPane.showMessageDialog(btn_login,"credentials do not match our record");
                }
            }catch (SQLException throwables){
                throwables.printStackTrace();
            }
        }
          else if (e.getSource() == btn_register) {
              new RegisterPage();
              frame.dispose();
          }
    }


}
