import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter a Number:");
            int i,fact=1;
            int number = src.nextInt();

            for(i=1;i<=number;i++){
                fact=fact*i;
            }
            System.out.println("Factorial of "+number+" is: "+fact);
        }

}
