package at.ac.htl.bhitm3.model;

public class Student extends Person{
    private String schoolClass;
    private String itHandle;
    private int studentId;
    private int avgGrade;

    public Student() {
    }

    public int getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(int avgGrade) {
        this.avgGrade = avgGrade;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getItHandle() {
        return itHandle;
    }

    public void setItHandle(String itHandle) {
        this.itHandle = itHandle;
    }

    public String getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(String schoolClass) {
        this.schoolClass = schoolClass;
    }
}
