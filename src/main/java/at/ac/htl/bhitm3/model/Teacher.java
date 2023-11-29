package at.ac.htl.bhitm3.model;

public class Teacher extends Person {

    int id;
    int salary;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
}