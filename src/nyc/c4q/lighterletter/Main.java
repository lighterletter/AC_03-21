package nyc.c4q.lighterletter;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner patron = new Scanner(System.in);

        System.out.print("Hello welcome to Pank Bank Let's set up a new account for you. \n" +
                "Please enter your name.");

        String pName = patron.next();


        if (patron.next().equals("A")){

            System.out.println(new BankAccount());
        }
        else if (patron.next().equals("B")){
            System.out.println("How much would you like to withdraw? ");

            System.out.println("You now have ");
        }








        //System.out.println(Patron.welcomeMessage());

        }

    }
