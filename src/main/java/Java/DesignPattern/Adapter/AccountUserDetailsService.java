package Java.DesignPattern.Adapter;

public class AccountUserDetailsService implements UserDetailsService {

    private AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String userName) {
        return new AccountUserDetails(accountService.findAccountByUserName(userName));
    }


}
