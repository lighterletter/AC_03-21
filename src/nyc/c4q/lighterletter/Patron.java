package nyc.c4q.lighterletter;

import java.util.Scanner;

/**
 * Created by c4q-john on 3/21/15.
 */
public class Patron {
   private String name;
    private int pocket;
    private BankAccount account;



    public Patron(String name, BankAccount account){
        this.name = name;
        this.pocket = 0;
        this.account = account;
    }
    public void GetMoneyFromAccount(int amount){
        account.withdraw(amount);
        this.pocket += amount;
    }
    public void GutMoneyIntoAccount(int amount){
        this.pocket -= amount;
        account.deposit(amount);
    }
    public void printPocket(){
        System.out.println(name + " 's pocket: " + pocket);

    }
    public static void main(String[] args) {
        BankAccount otherAccount = new BankAccount(55555);
    }

}
