package project;

import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class DataBaseTest {

    @Test
    public void insert() {
        String first_name = "Testing";
        String last_name = "Testing";
        DataBase db = new DataBase();
        String query = "Insert into register(first_name, last_name) values('" + first_name + "','" + last_name + "')";
        int row = db.insert(query);
        assertEquals(1, row);
    }

    @Test
    public void delete() {
        DataBase db = new DataBase();
        String query = "Delete from register where last_name = 'JUnit_Test'";
        int row = db.delete(query);
        assertEquals(2, row);
    }

    @Test
    public void update() {
        DataBase db = new DataBase();
        String query = "Update register SET last_name = 'update' where first_name = 'Testing'";
        int row = db.update(query);
        assertEquals(1, row);
    }

    @Test
    public void select() throws SQLException {
        String result;
        String first_name = "kthapa";
        DataBase db = new DataBase();
        String query = "Select email from register where email='kthapa'";
        ResultSet rs = db.select(query);
        while (rs.next()) {
            result = rs.getString("email");
            assertEquals(first_name, result);
        }
    }

    @Test
    public void login() throws SQLException {
        String email1;
        String password1;
        String email = "kthapa";
        String password = "1234";
        DataBase db = new DataBase();
        String query = "Select email,password from register where email='kthapa' and password = '1234'";
        ResultSet rs = db.select(query);
        while (rs.next()) {
            email1 = rs.getString("email");
            password1 = rs.getString("password");
            assertEquals(email, email1);
            assertEquals(password, password1);
        }
    }



}


