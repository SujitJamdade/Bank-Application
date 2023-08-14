import java.util.UUID;

public class HDFCAccount implements BankApplicationInterface {

    private String name;

    private String accountNo; // UUID - Universally Unique Identifier

    private String password;

    private double balance;

    final double rateOfInterest = 7.1;

    final String IFSCCode = "HDFC374873";

    // Default Constructor
    public HDFCAccount() {
    }

    // Parameterized Constructor
    public HDFCAccount(String name, String password, double balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public String getIFSCCode() {
        return IFSCCode;
    }

    @Override
    public String fetchBalance(String Password) {

        if(this.passord.equals(Password)){
            return "Your balance is : " + this.balance;
        }
        return "Incorrect Password";
    }

    @Override
    public String addMoney(double amount) {

        this.balance += amount;
        return "Amount added successfully. New Balance is : " + this.balance;
    }
    @Override
    public String withdrawMoney(double amount, String Password) {

        if(this.password.equals(Password)){

            if(this.balance<amount){
                return "Insufficent balance in account. Your balance is " + this.balance;
            }
            this.balance-=amount;
            return "Amount withdraw successfully. Remain Balance is : " + this.balance;
        }

        return "Incorrect Password";
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {

        if(this.password.equals(oldPassword)){
            this.password = newPassword;
            return "Password changed Successfully";
        }

        return "Old Password is incorrect. Please type correct old password to set new Password";
    }

    @Override
    public double calculateIntrest(int year) {
//      Interest as per the bank
        return (this.balance*year*rateOfInterest)/100.0;
    }
}
