import java.util.Scanner;

public class GradingNumber {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter Grade: ");
        int grade = src.nextInt();

        if (grade >=80){
            System.out.println("Grade: A + ");
        }
        else if(grade<=79 && grade >=75){
            System.out.println("Grade: A");
        }
        else if (grade <=74 && grade >=70){
            System.out.println("Grade: A-");
        }
        else if (grade <=69 && grade >=65){
            System.out.println("Grade: B+");
        }
        else if (grade <=64 && grade >=60){
            System.out.println("Grade: B-");
        }
        else if (grade <=59 && grade >=55){
            System.out.println("Grade: B+");
        }
        else if (grade <=54 && grade >=50){
            System.out.println("Grade: C+");
        }
        else if (grade <=49 && grade >=45){
            System.out.println("Grade: C");
        }
        else if (grade <=44 && grade >=40){
            System.out.println("Grade: D");
        }
        else
            System.out.println("Fail");




    }
}
