package com.company.Sixth;

public class Other extends Event{
    private String description;

    public Other(String date, String time, String description) {
        super(date, time);
        this.description = description;
    }

    @Override
    public String toString() {
        return "Other{" +
                "description='" + description + '\'' +
                '}';
    }
}
