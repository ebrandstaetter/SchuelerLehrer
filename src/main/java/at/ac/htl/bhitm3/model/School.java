package at.ac.htl.bhitm3.model;

import java.util.LinkedList;
import java.util.List;

public class School {

    List<SchoolClass> schoolClasses = new LinkedList<>();

    public List<SchoolClass> getSchoolClasses() {
        return schoolClasses;
    }

    public void add(SchoolClass schoolClass) {
        this.schoolClasses.add(schoolClass);
    }

}
