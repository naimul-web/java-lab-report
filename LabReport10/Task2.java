interface ATMService {
    void withdraw(double amount);
    void deposit(double amount);
    double checkBalance();
}

class DBBL implements ATMService {
    private double balance;

    public DBBL(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        ATMService myAccount = new DBBL(1000.0);

        System.out.println("Initial Balance: $" + myAccount.checkBalance());

        myAccount.deposit(500.0);
        System.out.println("Balance after deposit: $" + myAccount.checkBalance());

        myAccount.withdraw(200.0);
        System.out.println("Balance after withdrawal: $" + myAccount.checkBalance());

        myAccount.withdraw(2000.0);
    }
}
