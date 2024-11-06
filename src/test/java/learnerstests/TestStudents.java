package learnerstests;

import learnerslab.People;
import learnerslab.Person;
import learnerslab.Student;
import learnerslab.Students;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestStudents {


    @Test
    void testCohort(){
        People people = new People();
        //List<Student> personList = new ArrayList<>();

        Student student1 = new Student(111L, "Alexandria");
        Student student2 = new Student(212L, "Chaela");
        Student student3 = new Student(313L, "Daryna");
        Student student4 = new Student(414L, "Mahogany");

//        Person student1 = new Person(111L, "Alexandria");
//        Person student2 = new Person(212L, "Chaela");
//        Person student3 = new Person(313L, "Daryna");
//        Person student4 = new Person(414L, "Mahogany");
        people.add(student1);
        people.add(student2);
        people.add(student3);
        people.add(student4);




//        personList.add(student1);
//        personList.add(student2);
//        personList.add(student3);
//        personList.add(student4);




       // Assertions.assertTrue(personList instanceof Students);
        Assertions.assertEquals(people.findById(111L).getName(), Students.getInstance().findById(111L).getName());
        Assertions.assertEquals(people.findById(212L).getName(), Students.getInstance().findById(212L).getName());
        Assertions.assertEquals(people.findById(313L).getName(), Students.getInstance().findById(313L).getName());
        Assertions.assertEquals(people.findById(414L).getName(), Students.getInstance().findById(414L).getName());

    }

}