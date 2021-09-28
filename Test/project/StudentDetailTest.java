package project;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentDetailTest {

    @Test
    public void First_name() {
        String first_name = "Konan";
        StudentDetail user = new StudentDetail();
        user.setFirst_name("Minato");
        String val = user.getFirst_name();
        assertEquals(first_name,val);
    }

    @Test
    public void Last_name() {
        String last_name = "Shigami";
        StudentDetail user = new StudentDetail();
        user.setLast_name("Namikaji");
        String val = user.getLast_name();
        assertEquals(last_name,val);
    }

    @Test
    public void Email() {
        String email = "boa";
        StudentDetail user = new StudentDetail();
        user.setEmail("luffy");
        String val = user.getEmail();
        assertEquals(email,val);
    }

    @Test
    public void Password() {
        String password = "passed";
        StudentDetail user = new StudentDetail();
        user.setPassword("passed");
        String val = user.getPassword();
        assertEquals(password,val);
    }
}

