package com.company.persons;

import com.company.GlobalState;
import com.company.interfaces.Person;

public class Medunica implements Person {
    @Override
    public String doAction(GlobalState globalState) {
        if(globalState == GlobalState.RETURNING_TO_HOSPITAL){
            return "вернулся в больницу";
        }
        else if(globalState == GlobalState.VORCHUN_HIDE){
            return "обнаружила пропажу двух комплектов одежды";
        }
        else if(globalState == GlobalState.FIND_CLOTHES){
            return "нашел одежду Бульки";
        }
        return "";
    }

    @Override
    public String getName() {
        return "Медуцина";
    }

    @Override
    public String toString() {
        return "Medunica: name=" + getName();
    }
}
