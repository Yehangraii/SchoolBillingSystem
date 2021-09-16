package project;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Dashboard implements ActionListener, MouseListener {
    JFrame frame;
    JPanel leftPanel, rightP, leftdownP;

    JLabel  lbl_date, lbl_receipt, lbl_ACno, lbl_Snmae, lbl_Sgrade, Lbl_Sum;
    JButton btn1, btn2, btn3, btn4;
    JTextField txt_date, txt_receipt, txt_ACno, txt_Snmae, txt_Sgrade, txt_Sum;

    JTable tab;
    Font fon1, fon2, fon3;


    int row;
    ArrayList<Table> studentList;
    DefaultTableModel dtm;
    String header[] = new String[]{"Date" , "Receipt_no" , "AC_no" , "Student_name" , "Students_grade" , "Sum"};
    


    public Dashboard(){
        frame = new JFrame("BILL BOARD");

        // Fonts
        fon1 = new Font("cambria", Font.BOLD, 22);
        fon2 = new Font("cambria", Font.BOLD, 18);
        fon3 = new Font("abhaya libre regular", Font.ITALIC, 15);

        // BUTTONS
        btn1 = new JButton("Submit");
        btn1.addActionListener(this);

        btn2 = new JButton("Update");
        btn2.addActionListener(this);

        btn3 = new JButton("Delete");
        btn3.addActionListener(this);

        btn4 = new JButton("Clear");
        btn4.addActionListener(this);

        btn1.setBounds(15,515, 190, 90);
        btn2.setBounds(230,515, 190, 90);
        btn3.setBounds(15,620, 190, 90);
        btn4.setBounds(230,620, 190, 90);

        btn1.setForeground(Color.decode("#76877D"));
        btn2.setBackground(Color.decode("#76877D"));
        btn3.setBackground(Color.decode("#76877D"));
        btn4.setBackground(Color.decode("#76877D"));


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


        // buttons Panel
        leftdownP = new JPanel();
        leftdownP.setLayout(null);
        leftdownP.setVisible(true);
        leftdownP.setBackground(Color.decode("#587458"));
        leftdownP.setBounds(0, 500, 450, 250);
        leftdownP.setBorder(BorderFactory.createMatteBorder
                (8, 8, 10, 8, Color.decode("#090C09")));


        leftPanel.add(leftdownP);


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

        tab = new JTable();
        studentList = new ArrayList<>();
        dtm = new DefaultTableModel(header,0);
        tab.setModel(dtm);
        dtm.fireTableDataChanged();
        tab.setRowHeight(25);
        tab.setEditingColumn(30);
        tab.setBorder(BorderFactory.createMatteBorder(3,5,6,5,Color.decode("#1A2B63")));
        tab.setBounds(480,65,880,600);

        tab.addMouseListener(this);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        tab.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        tab.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        tab.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        tab.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        tab.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        tab.getColumnModel().getColumn(5).setCellRenderer( centerRenderer );

        tab.setFont(fon3);
        frame.add(tab);

        datas();


        frame.getContentPane().setBackground(Color.decode("#82A6B1"));

        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(1400, 750);
        frame.setVisible(true);
        frame.setLocation(15,60);


    }
    public static void main(String[] args){
        new Dashboard();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn4){
            txt_date.setText("");
            txt_receipt.setText("");
            txt_ACno.setText("");
            txt_Snmae.setText("");
            txt_Sgrade.setText("");
            txt_Sum.setText("");
        }
        else if (e.getSource() == btn1){
            Table data = new Table(txt_date.getText(), txt_receipt.getText(), txt_ACno.getText(), txt_Snmae.getText(), txt_Sgrade.getText(), txt_Sum.getText());
            studentList.add(data);
            datas();
        }
        else if (e.getSource() == btn2){
            try {
                DataBase db = new DataBase();
                String query = "Update bill SET receipt_date='"+txt_date.getText()+"',receipt_no='"+txt_receipt.getText()+"',ac_no='"+txt_ACno.getText()+"'," +
                        "student_name='"+txt_Snmae.getText()+"', students_grade='"+txt_Sgrade.getText()+"',  total_amount='"+txt_Sum.getText()+"' where receipt_no='"+txt_receipt.getText()+"' ";

                int i = tab.getSelectedRow();

                dtm.setValueAt(txt_date.getText(), i, 0);
                dtm.setValueAt(txt_receipt.getText(), i, 1);
                dtm.setValueAt(txt_ACno.getText(), i, 2);
                dtm.setValueAt(txt_Snmae.getText(), i, 3);
                dtm.setValueAt(txt_Sgrade.getText(), i, 4);
                dtm.setValueAt(txt_Sum.getText(), i, 5);
                JOptionPane.showMessageDialog(null, "Data Updated!!!");
                db.update(query);
                datas();
            }catch (Exception throwables){
                throwables.printStackTrace();
            }
        }
        else if (e.getSource() == btn3){
            try {
                DataBase db = new DataBase();

                String query = "Delete from bill where receipt_no ='" + txt_receipt.getText() + "'";
                int i = tab.getSelectedRow();
                if (i >= 0) {
                    dtm.removeRow(i);
                    JOptionPane.showMessageDialog(null, "deleted datas!");
                    db.delete(query);
                    datas();
                }
            }catch (Exception exception){
                exception.printStackTrace();
            }
        }

    }

    public void datas(){
        try {
            DataBase db = new DataBase();
            String query = "Select * from bill";
            ResultSet rs = db.select(query);
            dtm.setRowCount(0);
            while (rs.next()) {
                Object[] obj = {rs.getString("receipt_date"), rs.getString("receipt_no"), rs.getString("ac_no"),rs.getString("student_name"), rs.getString("students_grade"), rs.getString("total_amount") };
                dtm.addRow(obj);
            }
        }catch (Exception throwables){
            throwables.printStackTrace();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int i = tab.getSelectedRow();
        txt_date.setText(dtm.getValueAt(i,0).toString());
        txt_receipt.setText(dtm.getValueAt(i,1).toString());
        txt_ACno.setText(dtm.getValueAt(i,2).toString());
        txt_Snmae.setText(dtm.getValueAt(i,3).toString());
        txt_Sgrade.setText(dtm.getValueAt(i,4).toString());
        txt_Sum.setText(dtm.getValueAt(i,5).toString());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
