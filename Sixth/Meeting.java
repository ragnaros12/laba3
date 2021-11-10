package com.company.Sixth;

public class Meeting extends Event{
    private String person;
    private String place;

    public Meeting(String date, String time, String person, String place) {
        super(date, time);
        this.person = person;
        this.place = place;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "person='" + person + '\'' +
                ", place='" + place + '\'' +
                '}';
    }
}
