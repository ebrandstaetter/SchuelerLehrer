package at.ac.htl.bhitm3.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class SchoolTest {
    School school;

    @Before
    public void setup() {
        school = new School();
    }

    @Test
    public void given_nothing_ensure_school_exists() {
        var school = new School();
        assertNotNull(school);
    }

    @Test
    public void given_new_school_when_counting_classes_then_result_is_zero() {
        assertEquals(0, school.getSchoolClasses().size());
    }

    @Test
    public void given_new_school_when_adding_class_then_result_is_added_class() {
        var schoolClass = SchoolClass.createSchoolClass();
        school.add(schoolClass);
        assertEquals(1, school.getSchoolClasses().size());
        assertEquals(schoolClass, school.getSchoolClasses().get(0));
    }

    // @Test public void given_clever_kakao_milch_trinkfertig_when_drinking_clever_kakaomilch_then_result_is_high_satisfaction(){
    //     var cleverKakaoMilchTrinkfertig = new CleverKakaoMilchTrinkfertig();
    //     cleverKakaoMilchTrinkfertig.drink();
    //     assertTrue(cleverKakaoMilchTrinkfertig.getSatisfactionLevel() > 50);
    // }
}