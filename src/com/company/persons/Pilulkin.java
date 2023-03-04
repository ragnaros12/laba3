package com.company.persons;

import com.company.GlobalState;
import com.company.interfaces.Person;

public class Pilulkin implements Person {
    @Override
    public String doAction(GlobalState globalState) {
        if(globalState == GlobalState.INITIAL) {
            return "Таинственно улыбнулся";
        }
        return "";
    }

    @Override
    public String getName() {
        return "Пилюлькин";
    }
    @Override
    public String toString() {
        return "Pilulkin: name=" + getName();
    }
}
