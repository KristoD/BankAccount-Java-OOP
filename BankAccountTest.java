public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount armen = new BankAccount();
        System.out.println(armen.addCheckingsBalance(1000.00));
        System.out.println(armen.addSavingsBalance(1000.00));
        System.out.println(armen.withdrawl("savings", 50.00));
        System.out.println(armen.withdrawl("checking", 50.00));
        System.out.println(armen.getCheckingBalance());
        System.out.println(armen.getSavingsBalance());
        System.out.println(armen.getAccountsBalances());

        BankAccount danBlizerian = new BankAccount();
        System.out.println(danBlizerian.addCheckingsBalance(1000000.00));
        System.out.println(danBlizerian.addSavingsBalance(1000000.00));
        System.out.println(danBlizerian.getAccountsBalances());

        System.out.println(BankAccount.displayTotalAccounts());
        System.out.println(BankAccount.displayTotalBalances());
        System.out.println(armen.getAccountNumber());

    }
}