public class Teacher {



    String name,gender;
    int phone;


    Teacher(){
        System.out.println("No Info");
    }
    Teacher(String n, int g){
        name =n;
        phone =g;
    }

    Teacher(String n, String g,int p){
        name =n;
        gender =g;
        phone =p;
    }

    void displayinfo(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Number: "+phone);
    }
}
