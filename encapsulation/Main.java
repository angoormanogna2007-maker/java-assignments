package encapsulation;

public class Main {
    public static void main(String[] args){
        BankAccount acc1 = new BankAccount("manogna","123456789",25000);
        acc1.deposit(5000);
        acc1.withdraw(1000);
        acc1.withdraw(30000);
         acc1.displayBalance();

        }
    }

