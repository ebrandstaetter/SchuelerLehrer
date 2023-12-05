package at.ac.htl.bhitm3.model;

import java.util.LinkedList;
import java.util.List;

public class SchoolClass {

    private List<Student> students = new LinkedList<>();
    private Teacher headTeacher;

    public int countStudents(){
        return students.size();
    }

    public boolean addTeacher(Teacher teacher){
        boolean status = true;

        if(this.headTeacher != null || teacher == null){
            status = false;
        }else{
            this.headTeacher = teacher;
        }

        return status;
    }

    public boolean removeStudent(Student s){
        boolean status = true;

        if(!(students.contains(s)) || s == null){
            status = false;
        }else{
            students.remove(s);
        }

        return status;
    }

    public boolean addStudent(Student s){
        boolean status = true;

        if(students.contains(s) || s == null){
            status = false;
        }else{
            students.add(s);
        }

        return status;
    }

    public static SchoolClass createSchoolClass() {
        return new SchoolClass();
    }



}
