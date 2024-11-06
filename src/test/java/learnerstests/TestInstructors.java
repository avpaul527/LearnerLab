package learnerstests;

import learnerslab.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestInstructors {

    @Test
    void testThisInstructor(){
        People people = new People();

        Instructor instructor = new Instructor(100L, "Mikaila");



        people.add(instructor);



        Assertions.assertEquals(people.findById(100L).getName(), Instructors.getInstance().findById(100L).getName());


    }

}