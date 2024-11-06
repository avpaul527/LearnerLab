package learnerslab;

public class Student extends Person implements Learner {
    private double totalStudyTime;


    public Student(long id, String name) {
        super(id, name);
        this.totalStudyTime = totalStudyTime;
    }


    @Override
    public void learn(double numberOfHours) {
        totalStudyTime = totalStudyTime + numberOfHours;
    }

    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }

}
