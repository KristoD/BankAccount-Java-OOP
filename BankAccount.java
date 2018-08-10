import java.util.Random;

public class BankAccount {
    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;
    private static int numOfAccs;
    private static double totalMoney;

    public BankAccount() {
        numOfAccs += 1;
        this.accountNumber = generateAccNumber();
        this.checkingBalance = 0;
        this.savingsBalance = 0;
    }

    // Getters

    public String getCheckingBalance() {
        return "Your checking account balance is: " + Double.toString(this.checkingBalance);
    }

    public String getSavingsBalance() {
        return "Your savings account balance is: " + Double.toString(this.savingsBalance);
    }

    public String getAccountsBalances() {
        return "Your checking account balance is: " + Double.toString(this.checkingBalance) + " and your savings account balance is: " + Double.toString(this.savingsBalance);
    }

    public String getAccountNumber() {
        return "Your Account Number is: " + this.accountNumber;
    }

    // Setters

    public String addCheckingsBalance(double num) {
        this.checkingBalance += num;
        totalMoney += num;
        return "You have added $" + num + " dollars into your -checking- account. Your total balance is now: " + Double.toString(this.checkingBalance);
    }

    public String addSavingsBalance(double num) {
        this.savingsBalance += num;
        totalMoney += num;
        return "You have added $" + num + " dollars into your -savings- account. Your total balance is now: " + Double.toString(this.savingsBalance);
    }

    public String withdrawl(String account, double amt) {
        String acc = account.toLowerCase();
        if(acc == "checking") {
            if(amt > this.checkingBalance) {
                return "You can't withdrawl more than your account balance!";
            } else {
                this.checkingBalance -= amt;
                totalMoney -= amt;
                return "You have successfully withdrawn " + amt + " from your checking account.";
            }
        } else if (acc == "savings" || acc == "saving") {
            if(amt > this.savingsBalance) {
                return "You can't withdrawl more than your account balance!";
            } else {
                this.savingsBalance -= amt;
                totalMoney -= amt;
                return "You have successfully withdrawn " + amt + " from your savings account.";
            }
        } else {
            return "Must enter either 'checking' or 'savings' to withdrawl from the appropriate account!";
        }
    }

    // Private/static methods

    private static String generateAccNumber() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }

    public static double displayTotalBalances() {
        return totalMoney;
    }

    public static int displayTotalAccounts() {
        return numOfAccs;
    }
}