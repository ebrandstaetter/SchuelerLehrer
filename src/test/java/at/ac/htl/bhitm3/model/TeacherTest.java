package at.ac.htl.bhitm3.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

// import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TeacherTest {
    Teacher teacher;

    @Before
    public void setup() {
        teacher = new Teacher();
    }
    
    @Test
    public void given_teacher_then_is_instance_of_person() {
        assertTrue(teacher instanceof Person);
    }

    @Test
    public void given_teacher_when_id_is_set_to_1_then_id_is_1() {
        teacher.setTeacherId(1);
        assertEquals(1, teacher.getTeacherId());
    }

    @Test
    public void given_teacher_when_salary_is_set_to_3000_then_salary_is_3000() {
        teacher.setSalary(3000);
        assertEquals(3000, teacher.getSalary());
    }


}