package _11_Proxy;
interface BankAccount {
    void withdraw(double amount) throws Exception;
    void deposit(double amount);
    double getBalance();
}

class RealBankAccount implements BankAccount {
    private double balance;

    public RealBankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void withdraw(double amount) throws Exception {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " | Remaining Balance: " + balance);
        } else {
            throw new Exception("Insufficient funds!");
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " | New Balance: " + balance);
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

class BankAccountProxy implements BankAccount {
    private RealBankAccount realAccount;
    private String role; // "ADMIN" or "USER"

    public BankAccountProxy(String role, double initialBalance) {
        this.role = role;
        this.realAccount = new RealBankAccount(initialBalance);
    }

    @Override
    public void withdraw(double amount) throws Exception {
        if ("ADMIN".equals(role)) {
            realAccount.withdraw(amount);
        } else {
            throw new Exception("Access Denied! Only ADMIN can withdraw.");
        }
    }

    @Override
    public void deposit(double amount) {
        if ("ADMIN".equals(role) || "USER".equals(role)) {
            realAccount.deposit(amount);
        } else {
            System.out.println("Access Denied! Invalid role.");
        }
    }

    @Override
    public double getBalance() {
        if ("ADMIN".equals(role)) {
            return realAccount.getBalance();
        } else {
            System.out.println("Access Denied! Only ADMIN can view balance.");
            return -1;
        }
    }
}


public class ProtectionProxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            BankAccount userAccount = new BankAccountProxy("USER", 1000);

            userAccount.deposit(200);   // allowed
            userAccount.withdraw(100);  // not allowed
            System.out.println("User Balance: " + userAccount.getBalance()); // not allowed
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("-----");

        try {
            BankAccount adminAccount = new BankAccountProxy("ADMIN", 5000);

            adminAccount.deposit(1000);   // allowed
            adminAccount.withdraw(2000);  // allowed
            System.out.println("Admin Balance: " + adminAccount.getBalance()); // allowed
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

	}

}
