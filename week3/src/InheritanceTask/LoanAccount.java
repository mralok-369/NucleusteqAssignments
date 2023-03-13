package InheritanceTask;

public class LoanAccount extends Account {
	LoanAccount(int accNo, String name, String address, String phoneNo, String dob, int balance) {
        super(accNo, name, address, phoneNo, dob, balance);
    }

    void payEMI(int amount) {
        balance-=amount;
        System.out.println("Deposit Amount = "+amount);
        System.out.println("Remaining loan balance = " + balance);
    }

    void toUpLoan(int amount) {
        balance+=amount;
        System.out.println("Requested Amount for loan = "+amount);
        System.out.println("Remaining loan amount to pay : " + balance);
    }

    void rePayment() {
        System.out.println("Repay your loan balance");
    }
}
