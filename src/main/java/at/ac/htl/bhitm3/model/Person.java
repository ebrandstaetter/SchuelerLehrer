package at.ac.htl.bhitm3.model;

import java.util.Date;

public class Person {

    String name;

    String lastname;

    String address;

    Date birthdate;

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

    public String getAddress() {
        return address;
    }

    public void setBirthdate(Date value) {
        birthdate = value;
    }

    public Date getBirthdate() {
        return birthdate;
    }
}
