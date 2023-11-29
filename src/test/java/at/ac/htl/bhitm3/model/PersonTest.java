package at.ac.htl.bhitm3.model;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {
    Person person;

    @Before
    public void setup() {
        person = new Person();
    }

    @Test
    public void given_person_when_name_is_set_to_john_then_name_is_john() {
        final String personName = "John";
        person.setName(personName);
        assertEquals(personName, person.getName());
    }

    @Test
    public void given_new_person_when_lastname_is_set_to_mustermann_then_name_is_mustermann() {
        var person = new Person();
        person.setLastname("mustermann");
        assertEquals("mustermann", person.getLastname());
    }

    @Test
    public void given_new_person_when_addres_is_set_to_limesstraße_then_is_limesstraße() {
        var person = new Person();
        person.setAddress("limesstraße");
        assertEquals("limesstraße", person.getAddress());
    }

    @Test
    public void given_new_person_when_birthdate_is_set_then_is_setted_date() {
        var person = new Person();
        Date birthdate = new Date(2000, 1, 1);
        person.setBirthdate(birthdate);
        assertEquals(birthdate, person.getBirthdate());
    }
}