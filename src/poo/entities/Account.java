package poo.entities;

public class Account {
    private int accountNumber;
    private String accountOwner;
    private double balance;

    public Account(int accountNumber, String accountOwner){
        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;
    }

    public void deposit(double deposit){
        balance += deposit;
    }

    public void withDraw(double withDraw) {
        if (withDraw <= 0 || withDraw + 5 > balance) {
            return;
        }

        balance -= withDraw + 5;
    }

    public String getAccount() {
        return "Nome: " + accountNumber +
                ", conta: " + accountOwner +
                ", Saldo: " + balance;

    }
}
