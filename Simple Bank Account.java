package assignment_2;


import java.util.Scanner;

public class Account {


    Scanner input = new Scanner(System.in);

    public String name;
    public int no;
    public String type;
    public int amount;



    public  Account(String name, int no, String type, int amount){
        this.name = name;
        this.no= no;
        this.type=type;
        this.amount=amount;
    }

    public void diposit()
    {
        System.out.print("Enter Amount: ");

        int dip = input.nextInt();

        System.out.println("Amount: "+(dip+amount));

    }

    public void withdraw()
    {
        System.out.print("Enter Amount: ");
        int with = input.nextInt();
        System.out.println("Amount Left: "+(with-amount));



    }

    public void mainMenu(){

        System.out.println("Welcome!");
        System.out.println("1.Diposit");
        System.out.println("2.Withdraw");
        System.out.println("3.Account Info");
        System.out.print("Enter Your Input:");

        int scan = input.nextInt();
        switch (scan){
            case 1:
                diposit();
                mainMenu();
            case 2:
                withdraw();
                mainMenu();
            case 3:
                display();
                mainMenu();
             default:
                 System.out.println("Wrong Input! Try Again");
        }

    }

    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Account No: "+no);
    }

    public static void main(String[] args) {
        Account acc = new Account("Mozammel Hoshen Chowdhury",15442,"Savings",5000);
        acc.mainMenu();


    }


}
