package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PeopleSorting{
    private List<Person> people;

    public PeopleSorting(){
        this.people = new ArrayList<>();
    }

    public void addPerson(String name, int age, double height){
        people.add(new Person(name, age, height));
    }

    public List<Person> sortByAge(){
        List<Person> peopleByAge = new ArrayList<>(people);
        Collections.sort(peopleByAge);
        return peopleByAge;
    }

    public List<Person> sortByHeight(){
        List<Person> peopleByHeight = new ArrayList<>(people);
        Collections.sort(peopleByHeight, new Person.ComparatorByHeight());
        return peopleByHeight;
    }
}
