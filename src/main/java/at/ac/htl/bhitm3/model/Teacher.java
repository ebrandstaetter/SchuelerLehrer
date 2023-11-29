package at.ac.htl.bhitm3.model;

public class Teacher extends Person {

    int teacherId;
    int salary;

    public int getTeacherId() {
        return this.teacherId;
    }

    public void setTeacherId(int id) {
        this.teacherId = id;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
}