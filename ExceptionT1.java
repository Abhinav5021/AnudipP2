// Custom Exception Class
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}


class BankAccount {
    private double balance;

   
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }


    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(
                "Withdrawal failed! Requested: " + amount + ", Available: " + balance
            );
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }


    public double getBalance() {
        return balance;
    }
}

// Main Class
public class ExceptionT1 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); 

        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(500); 
        System.out.println("Balance after deposit: " + account.getBalance());

        try {
            account.withdraw(200); 
            System.out.println("Balance after withdrawal: " + account.getBalance());

            account.withdraw(2000); 
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Final Balance: " + account.getBalance());
    }
}