package StateDesignPattern;

public class ActiveState implements AccountState{
    private Account account;

    private ActiveState(Account account) {
        this.account = account;
    }

    @Override
    public void deposit(Double depositAmount) {
        account.setBalance(account.getBalance() + depositAmount);
        account.toString();
    }

    @Override
    public void withdraw(Double withdrawAmount) {
        account.setBalance(account.getBalance() - withdrawAmount);
    }

    @Override
    public void activate() {
        account.setAccountState(new ActiveState(account));
    }

    @Override
    public void close() {
        System.out.println("Account is closed!");
    }

    @Override
    public void suspend() {
        // TODO Auto-generated method stub
        
    }
    
}
