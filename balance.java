abstract class Balance extends Properties {
    private int total;

    public void setBalance(int total) {
        this.total = total;
    }

    public int getBalance() {
        return total;
    }

    @Override
    void deposit(int amount) {
        total += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    void withdraw(int amount) {
        if (amount <= total) {
            total -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    @Override
    void checkBalance() {
        System.out.println("Current Balance: " + total);
    }
}