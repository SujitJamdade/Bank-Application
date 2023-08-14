public interface BankApplicationInterface {

    public String fetchBalance(String Password);

    public String addMoney(double amount);

    public String withdrawMoney(double amount, String password);

    public String changePassword(String oldPassword, String newPassword);

    public double calculateIntrest(int year);
}
