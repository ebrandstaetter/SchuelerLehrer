package at.ac.htl.bhitm3.model;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {
    Student student;

    @Before 
    public void setup() {
        student = new Student();
    }

    @Test
    public void given_student_then_is_instance_of_person() {
        assertTrue(student instanceof Person);
    }
}
