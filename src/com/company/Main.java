package com.company;

import com.company.interfaces.Readable;
import com.company.persons.MedicinePersonal;
import com.company.persons.Medunica;
import com.company.persons.Pilulkin;
import com.company.persons.Vorchun;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Readable readable = new Story(Arrays.asList(
              new Pilulkin(),
              new MedicinePersonal(),
              new Medunica(),
              new Vorchun()
        ));
        do{
            readable.read();
            readable.nextState();
        }
        while (readable.hasNext());
        readable.read();
    }
}