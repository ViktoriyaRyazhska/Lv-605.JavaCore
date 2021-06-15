package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader(in));
        Person olya = new Person();
        Person oleg = new Person("Oleg ", "Sikorskiy");
        Person vika = new Person("Vika ", "Dmutryk");
        Person unknown = new Person();
        Person.infoForName();
        olya.setFirstName(reader.readLine());
        olya.setLastName(reader.readLine());
        Person.info();
        oleg.changeName(reader.readLine(),reader.readLine());
        olya.outPut();
        oleg.outPut();
        olya.setLastName("Nimchichun");
        olya.setBirthYear("1992");
        oleg.setBirthYear("1993");
        vika.setBirthYear("1998");
        Person.info();
        olya.changeName(reader.readLine(),reader.readLine());
        Person.infoWithYear();
        unknown.inPut(reader.readLine(),reader.readLine(),reader.readLine());
        olya.outPut();
        oleg.outPut();
        vika.outPut();
        unknown.outPut();
    }
    }
