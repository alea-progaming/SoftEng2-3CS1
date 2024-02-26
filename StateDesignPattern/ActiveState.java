package StateDesignPattern;

public class ActiveState implements AccountState{
    private Account account;

    public ActiveState(Account account) {
        this.account = account;
    }

    @Override
    public void deposit(Double depositAmount) {
        account.setBalance(account.getBalance() + depositAmount);
        System.out.println("Deposit:\n" + account.toString());
    }

    @Override
    public void withdraw(Double withdrawAmount) {
        if (account.getBalance() >= withdrawAmount) {
            account.setBalance(account.getBalance() - withdrawAmount);
            System.out.println("Withdraw:\n" + account.toString());
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public void activate() {
        System.out.println("Account is already activated.");
    }

    @Override
    public void close() {
        System.out.println("Account is closed.");
        account.setAccountState(new ClosedState(account));
    }

    @Override
    public void suspend() {
        System.out.println("Account is suspended!");
        account.setAccountState(new SuspendState(account));
    }
    
}
