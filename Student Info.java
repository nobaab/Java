package assignment_2;

import java.util.*;

public class Student {

    public int id;
    public String name;
    public String depname;
    public String coursecode;
    public int mark;


    public Student(int id, String name, String depname, String coursecode, int mark){
        this.id=id;
        this.name=name;
        this.depname=depname;
        this.coursecode=coursecode;
        this.mark=mark;
    }

    public void display() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Dept Name: " + depname);
        System.out.println("Course Code:" + coursecode);
        System.out.println("Mark: " + mark);

    }


    public void mark(){
        if(mark < 40 && mark >= 0){
            System.out.println("Sorry! You failed!");
        }else if(mark >= 40 && mark <= 100){
            System.out.println("You have passed1 chill!");

        }else {
            System.out.println("Wrong input! enter mark again");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your id  no: ");
        int id = input.nextInt();
        System.out.println("Enter your name: ");
        String name = input.next();
        System.out.println("Enter your dept name: ");
        String depname = input.next();
        System.out.println("Enter your course no: ");
        String coursecode = input.next();
        System.out.println("Enter your mark: ");
        int mark = input.nextInt();
        Student student = new Student(id,name,depname,coursecode,mark);
        student.display();
        student.mark();


    }

}
