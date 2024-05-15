

class Bank {
    private int balance = 1000;

    // Method to deposit money
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount + ". Current balance: " + balance);
    }
    public synchronized void withdraw(int amount){
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ". Current balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " Not valid  " + amount + " only " + balance + " available.");
        }
    }
    public int getBalance(){
        return balance;
    }
    class BankCustomer extends Thread {
        private Bank account;
        private boolean deposit;
        private int amount;
        BankCustomer(Bank account, boolean deposit, int amount, String name) {
            super(name);
            this.account = account;
            this.deposit = deposit;
            this.amount = amount;
        }
        public void run() {
            if (deposit) {
                account.deposit(amount);
            } else {
                account.withdraw(amount);
            }
        }
    }

        public void main(String[] args) {
            Bank account = new Bank();
            BankCustomer customer1 = new BankCustomer(account, true, 200, "Customer-1");
            BankCustomer customer2 = new BankCustomer(account, false, 300, "Customer-2");
            BankCustomer customer3 = new BankCustomer(account, true, 500, "Customer-3");
            BankCustomer customer4 = new BankCustomer(account, false, 700, "Customer-4");
            customer1.start();
            customer2.start();
            customer3.start();
            customer4.start();
            try {
                customer1.join();
                customer2.join();
                customer3.join();
                customer4.join();
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted.");
            }
            System.out.println("Final balance: "+ account.getBalance());
        }
    }

