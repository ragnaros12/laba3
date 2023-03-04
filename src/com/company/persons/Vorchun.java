package com.company.persons;

import com.company.GlobalState;
import com.company.interfaces.Person;

public class Vorchun implements Person {
    @Override
    public String doAction(GlobalState globalState) {
        if(globalState == GlobalState.RETURNING_TO_HOSPITAL){
            return "пропал";
        }
        return "";
    }

    @Override
    public String getName() {
        return "Ворчун";
    }
    @Override
    public String toString() {
        return "Vorchun: name=" + getName();
    }
}
