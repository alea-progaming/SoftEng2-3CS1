package StateDesignPattern;

public class Account {
    private String accountNumber;
    private Double balance;
    private AccountState accountState;

    public Account(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState(this); // Set initial state to Active
    }

    public AccountState getAccountState() {
        return accountState;
    }

    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void activate() {
        accountState.activate();
    }

    public void suspend() {
        accountState.suspend();
    }

    public void close() {
        accountState.close();
    }

    public void deposit(Double depositAmount) {
        accountState.deposit(depositAmount);
    }

    public void withdraw(Double withdrawAmount) {
        accountState.withdraw(withdrawAmount);
    }

    public String toString() {
        return "Account Number: " + accountNumber + "\nAccount Balance: " + balance;
    }
}
