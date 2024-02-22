package StateDesignPattern;

public class SuspendState implements AccountState {
    public Account account;

    public SuspendState(Account account) {
        this.account = account;
    }

    @Override
    public void deposit(Double depositAmount) {
        System.out.println("You cannot deposit on suspended account!");
    }

    @Override
    public void withdraw(Double withdrawAmount) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void activate() {
        
    }

    @Override
    public void close() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void suspend() {
        System.out.println("Account is already suspended.");
    }
    
}
