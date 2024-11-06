package learnerstests;

import learnerslab.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestInstructor {
    Instructor instructor;

    @BeforeEach
    public void setUp(){
        instructor  = new Instructor(101L, "Mikaila");
    }


    @Test
    void testImplementation(){

        Assertions.assertTrue(instructor instanceof Teacher);

    }

    @Test
    void testInheritance(){

        Assertions.assertTrue(instructor instanceof Person);


    }

    @Test
    void testTeach() {
        //Arrange - Given

        Student student  = new Student(1L, "Alexandria");



        //Act - When

        instructor.teach(student, 4.0);
        instructor.teach(student, 3.0);




        //Assert -Then
        Assertions.assertEquals(student.getTotalStudyTime(), 7.0);



    }

    @Test
    void testLecture() {

        //Arrange - Given

        Student student1  = new Student(1L, "Alexandria");
        Student student2  = new Student(2L, "Paul");
        Student student3  = new Student(3L, "Alex");
        Student[] students = {student1, student2, student3};


        //Act - When

        instructor.lecture(students, 5.0);
        instructor.lecture(students, 4.0);

        double time1 = student1.getTotalStudyTime();
        double time2 = student2.getTotalStudyTime();
        double time3 = student3.getTotalStudyTime();

        double[] expected = {time1, time2, time3};
        double[] actual = {3.0, 3.0, 3.0};





        //Assert -Then
        Assertions.assertArrayEquals(expected, actual);






    }


}