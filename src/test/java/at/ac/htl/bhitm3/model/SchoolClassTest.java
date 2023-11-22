package at.ac.htl.bhitm3.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SchoolClassTest {
    SchoolClass schoolClass;

    @Before
    public void setup() {
        schoolClass = new SchoolClass();
    }

    @Test
    public void given_school_new_school_class_when_counting_students_then_result_is_zero() {
        assertEquals(0, schoolClass.getStudents().size());
    }

    @Test
    public void given_new_shool_when_one_student_is_added_result_is_added_then_result_is_one() {
        
    }
}
