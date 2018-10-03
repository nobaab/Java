package com;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner src= new Scanner(System.in);
        System.out.print("Enter Car Name:");
        String name = src.nextLine();
        System.out.print("Enter Car Model:");
        int model = src.nextInt();
        Car car = new Car(name,model);
        car.printsomething();

    }

}