package com.company.persons;

import com.company.GlobalState;
import com.company.StorageFactory;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class MedicinePersonal extends StorageFactory {
    int index;
    List<String> names;
    Random random = new Random();

    public MedicinePersonal() {
        names = Arrays.asList("Маша","Даша","Еще имя", "Кто-то");
    }

    @Override
    public String doAction(GlobalState globalState) {
        if(globalState == GlobalState.RETURNING_TO_HOSPITAL) {
            index--;
            return "Герой " + names.get(random.nextInt(names.size())) + " вернулся в больницу";
        }
        else if(globalState == GlobalState.VORCHUN_HIDE){
            index--;
            return "Герой " + names.get(random.nextInt(names.size())) + " пошел в кладовку";
        }
        return "";
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public boolean hasNext(GlobalState globalState) {
        return (globalState == GlobalState.RETURNING_TO_HOSPITAL || globalState == GlobalState.VORCHUN_HIDE) && index != 0;
    }

    @Override
    public void reset() {
        index = random.nextInt(5);
    }

    @Override
    public String toString() {
        return "MedicinePersonal: name=" + getName() + ", index=" + index +
                ", names=" + names +
                ", random=" + random + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedicinePersonal that = (MedicinePersonal) o;
        return index == that.index && names.equals(that.names);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, names);
    }
}
