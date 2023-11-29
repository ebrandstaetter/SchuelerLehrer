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

    public void given_when_studentId_is_set_to_187_studentId_is_187() {
        var student = new Student();
        student.setStudentId(187);
        assertEquals(187, student.getStudentId)
    }



}
