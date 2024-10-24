/*
*Create a new method in the BankAccount class called deposit that allows a customer to deposit funds into their account.
The method should take the deposit amount as a parameter and update the balance accordingly. Ensure that the deposit amount is positive.
 */
package problem_solving;
 class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

public class  Problem_14 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        account.withdraw(500.0);
        System.out.println("Current balance: " + account.getBalance());

        account.withdraw(800.0);
        System.out.println("Current balance: " + account.getBalance());
    }
}