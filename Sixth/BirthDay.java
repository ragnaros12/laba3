package com.company.Sixth;

public class BirthDay extends Event{
    private String hero;
    private String place;
    private int age;

    public BirthDay(String date, String time, String hero, String place, int age) {
        super(date, time);
        this.hero = hero;
        this.place = place;
        this.age = age;
    }

    @Override
    public String toString() {
        return "BirthDay{" +
                "hero='" + hero + '\'' +
                ", place='" + place + '\'' +
                ", age=" + age +
                '}';
    }
}
