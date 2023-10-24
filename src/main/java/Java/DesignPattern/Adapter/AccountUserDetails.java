package Java.DesignPattern.Adapter;

public class AccountUserDetails implements UserDetails {
    private Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUserName() {
        return account.getName();
    }

    @Override
    public String getUserPw() {
        return account.getPw();
    }

}
