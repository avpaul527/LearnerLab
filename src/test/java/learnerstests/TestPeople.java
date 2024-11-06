package learnerstests;

import learnerslab.People;
import learnerslab.Person;
import learnerslab.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestPeople {
    People personList;
    Person person;

    @BeforeEach
    public void setUp(){

        List<Person> personList = new ArrayList<>();


    }

    @Test
    void testAdd() {
        //List<Person> personList = new ArrayList<>();

        personList = new People();
        Person person1 = new Person(101L, "Alex");
        Person person2 = new Person(102L, "Paul");
        Person person3 = new Person(103L, "Kid");

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        int actual = personList.count();
        int expected = 3;


        Assertions.assertEquals(expected, actual);



    }


    @Test
    void testRemove() {
        personList = new People();
        Person person1 = new Person(101L, "Alex");
        Person person2 = new Person(102L, "Paul");
        Person person3 = new Person(103L, "Kid");

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.remove(person3);
        int actual = personList.count();
        int expected = 2;


        Assertions.assertEquals(expected, actual);



    }

    @Test
    void testFindById() {
        personList = new People();
        Person person1 = new Person(101L, "Alex");
        Person person2 = new Person(102L, "Paul");
        Person person3 = new Person(103L, "Kid");

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        Person found = personList.findById(101L);
        String actual = found.getName();
        String expected = "Alex";

        Assertions.assertEquals(expected, actual);




    }


}