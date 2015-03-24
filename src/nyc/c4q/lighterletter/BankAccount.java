package nyc.c4q.lighterletter;

/**
 * Created by c4q-john on 3/21/15.
 */
public class BankAccount {

    private int balance;

    public BankAccount() {
        this.balance = 0;
        System.out.println(balance);
    }
    public BankAccount(int balance){
        this.balance = balance;
    }
    public void withdraw(int amount){

        balance -= amount;

    }
    public int deposit(int amount){
        balance = balance + amount;

        return balance;
    }
    public void printBalance(){
        System.out.println("balance: "+ balance);
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(100);
        BankAccount a2 = new BankAccount();

        System.out.println(a1.balance);
        System.out.println(a2.balance);

        a1.withdraw(5);
        a2.deposit(200);

        System.out.println(a1.balance);
        System.out.println(a2.balance);


    }
}
