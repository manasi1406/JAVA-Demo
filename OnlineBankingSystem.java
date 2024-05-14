import java.util.Scanner;

class BankAccount {
    private int balance;

    public BankAccount(int startingBalance) {
        this.balance = startingBalance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount + ". New balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ". New balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " tried to withdraw " + amount + " Less Balance");
        }
    }

    public int getBalance() {
        return balance;
    }
}

class UserAction extends Thread {
     BankAccount account;
     String action;
      int amount;

    public UserAction(BankAccount account, String action, int amount) {
        this.account = account;
        this.action = action;
        this.amount = amount;
    }


    public void run() {
        System.out.println("Performing action: " + action + " by " + Thread.currentThread().getName());
        if (action.equalsIgnoreCase("deposit")) {
            account.deposit(amount);
        } else if (action.equalsIgnoreCase("withdraw")) {
            account.withdraw(amount);
        }
        System.out.println("Completed action: " + action + " by " + Thread.currentThread().getName());
    }
}

public class OnlineBankingSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        Scanner scanner = new Scanner(System.in);

        // deposit amount
        System.out.print("Enter deposit amount: ");
        int depositAmount = scanner.nextInt();

        //  withdrawal amounts
        System.out.print("Enter withdrawal amount for first transaction: ");
        int withdrawAmount1 = scanner.nextInt();
        System.out.print("Enter withdrawal amount for second transaction: ");
        int withdrawAmount2 = scanner.nextInt();

        // threads for different user actions
        Thread depositThread = new UserAction(account, "deposit", depositAmount);
        Thread withdrawThread1 = new UserAction(account, "withdraw", withdrawAmount1);
        Thread withdrawThread2 = new UserAction(account, "withdraw", withdrawAmount2);


        depositThread.start();
        withdrawThread1.start();
        withdrawThread2.start();

        System.out.println("Multithreading is used");

    }
}