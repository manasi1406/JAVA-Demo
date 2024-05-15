//Define a class that extends Thread to represent a user action
class UserAction extends Thread {
      String action;

    public UserAction(String action) {
        this.action = action;
    }


    public void run() {
        System.out.println("performing task " + action + " by " + Thread.currentThread().getName());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException Ex) {
            Ex.printStackTrace();
        }
        System.out.println("Completed task: " + action + " by " + Thread.currentThread().getName());
    }
}

public class OnlineBankingSystem {
    public void main(String[] args) {
        // Create threads for different user actions
        Thread checkBalance = new UserAction("Check Balance");
        Thread transferMoney = new UserAction("Transfer Money");
        Thread payBills = new UserAction("Pay Bills");

        // Start the threads
        checkBalance.start();
        transferMoney.start();
        payBills.start();

        // Main thread continues its work
        System.out.println("User is performing actions concurrently...");
    }
}
