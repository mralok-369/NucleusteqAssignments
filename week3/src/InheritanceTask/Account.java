package InheritanceTask;

public class Account {
	int accNo;
    String name,address,phoneNo,dob;
    int balance;

    Account(int accNo,String name, String address,String phoneNo,String dob,int balance) {
        this.accNo = accNo;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.dob = dob;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accNo;
    }

    public void setAccountNumber(int accountNumber) {
        this.accNo = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    void closeAccount() {
        System.out.println("Account Closed.");
    }

    @Override
    public String toString() {
        return "Account Number : "+this.getAccountNumber()
                +"\nCustomer Name : "+this.getName()
                +"\nCustomer Address : "+this.getAddress()
                +"\nMobile No. : "+this.getPhoneNo()
                +"\nDate of Birth : "+this.getDob()
                +"\nAvailable Balance : "+this.getBalance();
    }

}
