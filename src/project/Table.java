package project;

import javax.swing.*;
import java.util.Date;

public class Table {
    JTable tab;
    JFrame fr;
    String date, receipt_no, ac_no, student_name, students_grade, sum;

    public Table(String date, String receipt_no, String ac_no, String student_name, String students_grade, String sum) {
        this.date = date;
        this.receipt_no = receipt_no;
        this.ac_no = ac_no;
        this.student_name = student_name;
        this.students_grade = students_grade;
        this.sum = sum;

        try {
            DataBase db = new DataBase();
            String query = "Insert into bill values('" + this.date + "','" + this.receipt_no + "','" + this.ac_no + "','" + this.student_name + "', '" + this.students_grade+ "', '" + this.sum + "' )";
            int ans = db.insert(query);
            if (ans > 0) {
                JOptionPane.showMessageDialog(null, "data inserted!");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}


