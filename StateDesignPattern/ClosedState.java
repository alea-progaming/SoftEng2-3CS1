package StateDesignPattern;

public class ClosedState implements AccountState{
    private Account account;

   public ClosedState(Account account) {
        this.account = account;
    }

    @Override
    public void deposit(Double depositAmount) {
        System.out.println("You cannot deposit on closed account!");
        System.out.println(account.toString());
    }

    @Override
    public void withdraw(Double withdrawAmount) {
        System.out.println("You cannot withdraw on closed account!");
        System.out.println(account.toString());
    }

    @Override
    public void activate() {
        System.out.println("You cannot activate a closed account!");
    }

    @Override
    public void close() {
        System.out.println("Account is already closed!");
    }

    @Override
    public void suspend() {
        System.out.println("You cannot suspend a closed account!");
    }
}
