package learnerslab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {
    private List<Person> personList = new ArrayList<>();

    public void add(Person person){
        personList.add(person);
    }

    public Person findById(long id){
        for (Person person : personList){
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public boolean contains(Person person){
        return personList.contains(person);
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void remove(long id){
        Iterator<Person> iterator = personList.iterator();
        while (iterator.hasNext()){
            Person person = iterator.next();
            if(person.getId() == id){
                iterator.remove();
            }
        }

    }

    public void removeAll(){
        personList.clear();
    }

    public int count(){
        return personList.size();
    }

    public Person[] toArray(){
        return personList.toArray(new Person[0]);
    }

    @Override
    public Iterator<Person> iterator(){
        return personList.iterator();
    }

}


