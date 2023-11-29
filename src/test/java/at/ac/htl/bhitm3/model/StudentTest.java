package at.ac.htl.bhitm3.model;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

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

    public void given_student_when_studentId_is_set_to_187_then_studentId_is_187() {
        Student student = new Student();
        student.setStudentId(187);
        assertEquals(187, student.getStudentId());
    }

    @Test
    public void given_student_when_name_is_set_to_heinz_then_name_is_heinz() {
        student.setName("Heinz");
        assertEquals("Heinz", student.getName());
    }
}
