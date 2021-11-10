package com.company.Sixth;

public class Event {
    private String date;
    private String time;

    public Event(String date, String time) {
        this.date = date;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Event{" + "date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
