package InheritanceTask;

public class SavingsAccount extends Account{
	SavingsAccount(int accNo, String name, String address, String phoneNo, String dob, int balance) {
        super(accNo, name, address, phoneNo, dob, balance);
    }

    void withdraw(int amount) {
        balance-=amount;
        System.out.println("Withdraw Amount = "+amount);
        System.out.println("Remaining Balance = " + balance);
    }

    void deposit(int amount) {
        balance+=amount;
        System.out.println("Deposit Amount = "+amount);
        System.out.println("Available Balance = " + balance);
    }

    void fixedDeposit() {
        System.out.println("Nothing fixed deposited yet.");
    }
}
