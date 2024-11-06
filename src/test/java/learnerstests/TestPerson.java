package learnerstests;

import learnerslab.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestPerson {


    @Test
    void testConstructor(){


        //Arrange - Given
        Person person1 = new Person(1L, "Alexandria");



        //Act - When
        String actual = person1.getId() + " " +person1.getName();


        //Assert -Then
        Assertions.assertEquals("1 Alexandria", actual);


    }

    @Test
    void testSetName() {


        //Arrange - Given
        Person person1 = new Person(2L, "Paul");



        //Act - When
        person1.setName("Alexandria");;


        //Assert -Then
        Assertions.assertEquals("Alexandria", person1.getName());


    }
}