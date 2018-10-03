package com.company;

public class Teacher {

    String name, gender;
    int number;

    Teacher() {
        System.out.println("No Info");
    }

    Teacher(String n, int p) {
        name = n;
        number = p;
    }

    Teacher(String n, String g, int p) {
        name = n;
        gender = g;
        number = p;
    }

    void displayinfo() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Number :" + number);
    }
}
