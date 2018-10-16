public class OverLoad{

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.displayinfo();
        Teacher teacher1 = new Teacher("Mozammel Hoshen Chowdhury",1687849526);
        teacher1.displayinfo();
        Teacher teacher2 = new Teacher("Nobaab Chowdhury","Male",1521232654);
        teacher2.displayinfo();
    }
}
