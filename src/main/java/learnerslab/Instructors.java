package learnerslab;

public class Instructors extends People {
    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        add(new Instructor(100L, "Mikaila"));
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }

}
