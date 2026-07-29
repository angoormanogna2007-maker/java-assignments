package encapsulation;

public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder,String accountNumber,double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount > 0){
            balance = balance + amount;
            System.out.println("deposited: " + amount);
    }
}
    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("withdrawal failed. Insuffient balance.");
        } else if(amount > 0){
            balance = balance - amount;
            System.out.println("withdrawn: " + amount);
    }
    }
    public void displayBalance(){
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Final balance: " + balance);
    }
}
