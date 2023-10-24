package Java.DesignPattern.Adapter;

public class AccountService {

    public Account findAccountByUserName(String userName) {
        Account account = new Account();
        account.setName(userName);
        account.setPw(userName);
        account.setEmail(userName);

        return account;
    }

    public void createNewAccount(Account account) {

    }

    public void updateAccount(Account account) {

    }

}