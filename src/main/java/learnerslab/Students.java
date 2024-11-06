package learnerslab;

public final class Students extends People{
    private static final Students INSTANCE = new Students();

    private Students(){
        add(new Student(111L, "Alexandria"));
        add(new Student(212L, "Chaela"));
        add(new Student(313L, "Daryna"));
        add(new Student(414L, "Mahogany"));



    }

    public static Students getInstance() {
        return INSTANCE;
    }

}
