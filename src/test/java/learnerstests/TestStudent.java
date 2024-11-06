package learnerstests;

import learnerslab.Learner;
import learnerslab.Person;
import learnerslab.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestStudent {
    Student student;

    @BeforeEach
    public void setUp(){
        student  = new Student(1L, "Alexandria");
    }

    @Test
    void testImplementation(){
        Assertions.assertTrue(student instanceof Learner);

    }

    @Test
    void testInheritance(){
        Assertions.assertTrue(student instanceof Person);


    }

    @Test
    void testLearn() {


        //Arrange - Given
        student.learn(8.0);
        double totalStudyTime = student.getTotalStudyTime();



        //Act - When

        student.learn(1.0);





        //Assert -Then
        Assertions.assertEquals(student.getTotalStudyTime(), 9.0);



    }
}