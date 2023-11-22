package at.ac.htl.bhitm3.model;

import java.util.LinkedList;
import java.util.List;

public class SchoolClass {

    public List<String> getStudents() {
        return new LinkedList<String>();
    }

    public static SchoolClass createSchoolClass() {
        return new SchoolClass();
    }

}
