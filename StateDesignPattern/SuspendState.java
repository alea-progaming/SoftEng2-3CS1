package StateDesignPattern;

public class SuspendState implements AccountState {
    private Account account;

    public SuspendState(Account account) {
        this.account = account;
    }

    @Override
    public void deposit(Double depositAmount) {
        System.out.println("You cannot deposit on suspended account!");
    }

    @Override
    public void withdraw(Double withdrawAmount) {
        System.out.println("You cannot withdraw on suspended account!");
        System.out.println(account.toString());
    }

    @Override
    public void activate() {
        System.out.println("Account is activated!");
        account.setAccountState(new ActiveState(account));
    }

    @Override
    public void close() {
        account.setAccountState(new ClosedState(account));
    }

    @Override
    public void suspend() {
        System.out.println("Account is already suspended!");
    }
}
