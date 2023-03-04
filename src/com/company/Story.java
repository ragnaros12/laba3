package com.company;

import com.company.interfaces.Person;
import com.company.interfaces.Readable;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Story implements Readable {
    List<Person> people;
    GlobalState globalState;

    public Story(List<Person> people) {
        this.people = people;
        globalState = GlobalState.INITIAL;
    }

    @Override
    public void read() {
        for (Person person : people){
            if(person instanceof StorageFactory){
                StorageFactory factory = (StorageFactory) person;
                while (factory.hasNext(globalState)){
                    System.out.println(factory.doAction(globalState));
                }
                factory.reset();
            }
            else {
                String action = person.doAction(globalState);
                if(!action.isEmpty())
                    System.out.println(person.getName() + " " + person.doAction(globalState));
            }
        }
    }

    @Override
    public void nextState() {
        globalState = GlobalState.values()[globalState.ordinal() + 1];
    }

    @Override
    public boolean hasNext() {
        return globalState.ordinal() + 1 < GlobalState.values().length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Story story = (Story) o;
        return Objects.equals(people, story.people) && globalState == story.globalState;
    }

    @Override
    public String toString() {
        return "Story{ doables=[" + people.stream().map(Person::toString).collect(Collectors.joining(", ")) +
                "], globalState=" + globalState +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(people, globalState);
    }
}
