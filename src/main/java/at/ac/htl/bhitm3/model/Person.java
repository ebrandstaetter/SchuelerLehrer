package at.ac.htl.bhitm3.model;

public class Person {

    String name;

    String lastname;

    String address;

    public void setName(String personName) {
        name = personName;
    }

    public String getName() {
        return name;
    }

    public void setLastname(String value) {
        lastname = value;
    }

    public String getLastname() {
        return lastname;
    }

    public void setAddress(String value) {
        address = value;
    }

    public Object getAddress() {
        return address;
    }

}
