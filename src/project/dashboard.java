package project;

import javax.swing.*;
import java.awt.*;

public class dashboard {
    JFrame frame;
    JPanel leftPanel, rightP, leftdownP, rightTopP, recordP;
    JPanel Psname, Psgrade, Psum;
    //    Image img;
    JLabel field_lbl ,lbl_date, lbl_receipt, lbl_ACno, lbl_Snmae, lbl_Sgrade, Lbl_Sum;
    JButton btn1, btn2, btn3, btn4;
    JTextField txt_date, txt_receipt, txt_ACno, txt_Snmae, txt_Sgrade, txt_Sum;

    Font fon1, fon2;

    public dashboard(){
        frame = new JFrame("BILL BOARD");

        // Fonts
        fon1 = new Font("cambria", Font.BOLD, 22);
        fon2 = new Font("cambria", Font.BOLD, 18);

        // BUTTONS
        btn1 = new JButton("Submit");
        btn2 = new JButton("Update");
        btn3 = new JButton("Delete");
        btn4 = new JButton("Show");

        btn1.setBounds(15,515, 190, 90);
        btn2.setBounds(230,515, 190, 90);
        btn3.setBounds(15,620, 190, 90);
        btn4.setBounds(230,620, 190, 90);

        btn1.setForeground(Color.decode("#76877D"));
        btn2.setBackground(Color.decode("#76877D"));
        btn3.setBackground(Color.decode("#76877D"));
        btn4.setBackground(Color.decode("#76877D"));

//        btn1.getContentPane().setBackground(Color.decode("#5375e2"));


//        leftdownP.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 25));

        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);


        // left panel
        leftPanel = new JPanel();
        leftPanel.setLayout(null);
        leftPanel.setSize(450, 750);
        leftPanel.setVisible(true);
        leftPanel.setBackground(Color.decode("#A7C0C8"));
        leftPanel.setBorder(BorderFactory.createMatteBorder
                (8, 8, 8, 8, Color.decode("#090C09")));

        frame.add(leftPanel);

//        // right Panel
//        rightP = new JPanel();
//        rightP.setLayout(null);
//        rightP.setVisible(true);
//        rightP.setBackground(Color.decode("#6EA2C4"));
//        rightP.setBounds(450, 0, 550, 300);
//        rightP.setBorder(BorderFactory.createMatteBorder
//                (8, 0, 8, 8, Color.decode("#090C09")));
//        frame.add(rightP);



        // buttons Panel
        leftdownP = new JPanel();
        leftdownP.setLayout(null);
        leftdownP.setVisible(true);
        leftdownP.setBackground(Color.decode("#587458"));
        leftdownP.setBounds(0, 500, 450, 250);
        leftdownP.setBorder(BorderFactory.createMatteBorder
                (8, 8, 10, 8, Color.decode("#090C09")));



//        leftdownP.setLayout(new GridLayout(2,2));
//        JButton btn1 = new JButton("Submit");
//        JButton btn2 = new JButton("Update");
//        JButton btn3 = new JButton("Delete");
//        JButton btn4 = new JButton("Show");
//
//        btn1.setBounds(15,15, 190, 90);
//        btn2.setBounds(230,15, 190, 90);
//        btn3.setBounds(15,120, 190, 90);
//        btn4.setBounds(230,120, 190, 90);
//
//        btn1.setBackground(Color.decode("#76877D"));
//        btn2.setBackground(Color.decode("#76877D"));
//        btn3.setBackground(Color.decode("#76877D"));
//        btn4.setBackground(Color.decode("#76877D"));
//
////        leftdownP.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 25));
//
//
//        leftdownP.add(btn1);
//        leftdownP.add(btn2);
//        leftdownP.add(btn3);
//        leftdownP.add(btn4);

        leftPanel.add(leftdownP);

// record panel
//        recordP = new JPanel();
//        recordP.setLayout(null);
//        recordP.setVisible(true);
//        recordP.setBackground(Color.decode("#82A6B1"));
//        recordP.setBounds(450, 300, 550, 450);
//        recordP.setBorder(BorderFactory.createMatteBorder
//                (0, 0, 10, 8, Color.decode("#090C09")));
//        frame.add(recordP);


        // LABELS
        lbl_date = new JLabel("Date");
        lbl_date.setForeground(Color.BLACK);
        lbl_date.setFont(fon2);
        lbl_date.setBounds(10, 60, 150, 60);
        leftPanel.add(lbl_date);

        // text field
        txt_date = new JTextField();
        txt_date.setFont(fon1);
        txt_date.setBounds(190, 65, 250, 50);
        leftPanel.add(txt_date);

        lbl_receipt = new JLabel("Receipt No.");
        lbl_receipt.setForeground(Color.BLACK);
        lbl_receipt.setFont(fon2);
        lbl_receipt.setBounds(10, 120, 150, 60);
        leftPanel.add(lbl_receipt);

        // text field
        txt_receipt = new JTextField();
        txt_receipt.setFont(fon1);
        txt_receipt.setBounds(190, 125, 250, 50);
        leftPanel.add(txt_receipt);

        lbl_ACno = new JLabel("A/C No.");
        lbl_ACno.setForeground(Color.BLACK);
        lbl_ACno.setFont(fon2);
        lbl_ACno.setBounds(10, 180, 150, 60);
        leftPanel.add(lbl_ACno);

        // text field
        txt_ACno = new JTextField();
        txt_ACno.setFont(fon1);
        txt_ACno.setBounds(190, 185, 250, 50);
        leftPanel.add(txt_ACno);

        // Student's name
        lbl_Snmae = new JLabel("Student name");
        lbl_Snmae.setForeground(Color.BLACK);
        lbl_Snmae.setFont(fon2);
        lbl_Snmae.setBounds(10, 240, 150, 60);
        leftPanel.add(lbl_Snmae);

        txt_Snmae = new JTextField();
        txt_Snmae.setFont(fon1);
        txt_Snmae.setBounds(190, 245, 250, 50);
        leftPanel.add(txt_Snmae);


        // Class
        lbl_Sgrade = new JLabel("Student's grade");
        lbl_Sgrade.setForeground(Color.BLACK);
        lbl_Sgrade.setFont(fon2);
        lbl_Sgrade.setBounds(10, 300, 150, 60);
        leftPanel.add(lbl_Sgrade);

        txt_Sgrade = new JTextField();
        txt_Sgrade.setFont(fon1);
        txt_Sgrade.setBounds(190, 305, 250, 50);
        leftPanel.add(txt_Sgrade);

        // sum paid by student
        Lbl_Sum = new JLabel("Sum");
        Lbl_Sum.setForeground(Color.BLACK);
        Lbl_Sum.setFont(fon2);
        Lbl_Sum.setBounds(10, 360, 150, 60);
        leftPanel.add(Lbl_Sum);

        txt_Sum = new JTextField();
        txt_Sum.setFont(fon1);
        txt_Sum.setBounds(190, 365, 250, 50);
        leftPanel.add(txt_Sum);




        frame.getContentPane().setBackground(Color.decode("#82A6B1"));

        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(1400, 750);
        frame.setVisible(true);
        frame.setLocation(15,60);


    }
    public static void main(String[] args){
        new dashboard();
    }

}
