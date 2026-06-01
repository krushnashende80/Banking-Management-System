public class call extends Balance {

    public static void main(String[] args) {

    	call c = new call();

        c.setBalance(1000);   // initial balance
        c.checkBalance();

        c.deposit(200);       // deposit
        c.checkBalance();

        c.withdraw(500);      // withdraw
        c.checkBalance();

        c.withdraw(2000);     // invalid withdraw
        c.checkBalance();
    }
}