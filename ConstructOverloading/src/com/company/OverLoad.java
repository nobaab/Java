package com.company;

public class OverLoad {

    public static void main(String[] args) {
        Teacher teacher= new Teacher();
        teacher.displayinfo();
        Teacher teacher1 = new Teacher("Mozammel",01726);
        teacher1.displayinfo();
        Teacher teacher2 = new Teacher("Nobaab Chowdhury","Male",01521232654);
        teacher2.displayinfo();
    }



}
