package InheritanceTask;

import java.util.Scanner;

public class DriverClass {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // creating savings account object
        SavingsAccount savingsAccount = new SavingsAccount(101,"Alok","Gorakhpur","8738890146","22-08-1998",50000);
        System.out.println(savingsAccount);
        savingsAccount.deposit(10000);
        savingsAccount.withdraw(5000);
        savingsAccount.fixedDeposit();


        System.out.println();
        // creating loan account object
        LoanAccount loanAccount = new LoanAccount(201,"Roushan","Patna","6393364513","07/01/2000",10000);
        System.out.println(loanAccount);
        loanAccount.payEMI(2000);
        loanAccount.toUpLoan(10000);
        loanAccount.rePayment();




    }
}
