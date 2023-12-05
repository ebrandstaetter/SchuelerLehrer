package at.ac.htl.bhitm3.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SchoolClassTest {
    SchoolClass schoolClass;

    @Before
    public void setup() {
        schoolClass = SchoolClass.createSchoolClass();
    }

    @Test
    public void new_class_empty() {
        assertEquals(0, schoolClass.countStudents());
    }

    @Test
    public void add_null_student(){
        assertFalse(schoolClass.addStudent(null));
    }

    @Test
    public void add_existing_Student(){
        Student a = new Student();
        a.setName("Max");
        a.setLastname("Mustermann");
        schoolClass.addStudent(a);
        assertFalse(schoolClass.addStudent(a));
    }

    @Test
    public void add_valid_student_delivers_true(){
        Student a = new Student();
        a.setName("Max");
        a.setLastname("Mustermann");
        assertTrue(schoolClass.addStudent(a));
    }

    @Test
    public void remove_existing_student_delivers_true(){
        Student a = new Student();
        a.setName("Max");
        a.setLastname("Mustermann");
        schoolClass.addStudent(a);
        assertTrue(schoolClass.removeStudent(a));
    }

    @Test
    public void remove_null_Student(){
        assertFalse(schoolClass.removeStudent(null));
    }

    @Test
    public void remove_fake_Student(){
        Student a = new Student();
        a.setName("Max");
        a.setLastname("Mustermann");
        assertFalse(schoolClass.removeStudent(a));
    }


    @Test
    public void add_null_teacher (){
        Teacher teacher = null;
        assertFalse(schoolClass.addTeacher(teacher));
    }

    @Test
    public void add_existing_teacher(){
        Teacher teacher = new Teacher();
        Teacher teacher2 = new Teacher();
        schoolClass.addTeacher(teacher);
        assertFalse(schoolClass.addTeacher(teacher2));
    }

    @Test
    public void add_valid_teacher_delivers_true(){
        Teacher teacher = new Teacher();
        teacher.setName("Christian");
        teacher.setLastname("Aberger");
        assertTrue(schoolClass.addTeacher(teacher));
    }
}
