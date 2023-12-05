package at.ac.htl.bhitm3.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.beans.Transient;

import org.junit.Before;
import org.junit.Test;

public class SchoolTest {
    School school;

    @Before
    public void setup() {
        school = new School();
    }

    @Test
    public void given_nothing_ensure_school_exists() {
        var school = new School();
        assertNotNull(school);
    }

    @Test
    public void given_new_school_when_counting_classes_then_result_is_zero() {
        assertEquals(0, school.getSchoolClasses().size());
    }

    @Test
    public void given_new_school_when_adding_class_then_result_is_added_class() {
        var schoolClass = SchoolClass.createSchoolClass();
        school.add(schoolClass);
        assertEquals(1, school.getSchoolClasses().size());
        assertEquals(schoolClass, school.getSchoolClasses().get(0));
    }

    @Test
    public void given_new_school_when_counting_students_then_result_is_zero() {
        assertEquals(0, school.getStudents().size());
    }

    @Test
    public void given_new_school_when_adding_student_then_result_is_added_student() {
        var student = new Student();
        school.addStudent(student);
        assertEquals(1, school.getStudents().size());
        assertEquals(student, school.getStudents().get(0));
    }

    @Test
    public void given_new_school_when_counting_teachers_then_result_is_zero() {
        assertEquals(0, school.getTeachers().size());
    }

    @Test
    public void given_new_school_when_adding_teacher_then_result_is_added_teacher() {
        var teacher = new Teacher();
        school.addTeacher(teacher);
        assertEquals(1, school.getTeachers().size());
        assertEquals(teacher, school.getTeachers().get(0));
    }
}