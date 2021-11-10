package com.company.Sixth;

import java.util.ArrayList;
import java.util.List;

public class Events {
    private List<Event> events = new ArrayList<>();


    public void add(Event event){
        events.add(event);
    }
    public void show(){
        for (Event event : events) {
            System.out.println(event.toString());
        }
    }

}
