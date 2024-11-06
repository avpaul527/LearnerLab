package learnerslab;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    private final Students students = Students.getInstance();
    private final Instructors instructors = Instructors.getInstance();

    private ZipCodeWilmington() {}

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        System.out.println("null"); //placeholder until Part 10
       // teacher.lecture(students.toArray(), numberOfHours);
    }

    public void hostLecture(long instructorId, double numberOfHours) {
        Instructor instructor = (Instructor) instructors.findById(instructorId);
        if (instructor != null) {
            hostLecture(instructor, numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> studyMap = new HashMap<>();
        for (Person person : students.toArray()) {
            if (person instanceof Student) {
                studyMap.put((Student) person, ((Student) person).getTotalStudyTime());
            }
        }
        return studyMap;
    }
}
