package com.company.Sixth;

public class Test {
    public static void main(String[] args){
        Events events = new Events();
        events.add(new BirthDay("a", "1", "1", "1", 1));
        events.add(new Other("aa","aa","ddfsdgf"));
        events.add(new Meeting("a","asfaf", "asdd", "asdd"));
        events.show();
    }
}
