package StateDesignPattern;

public class AccountTest {
    public static void main(String[] args) {
        Account myAccount = new Account("1234", 10000.0); //set acct to active state
                myAccount.activate();

    }
}
