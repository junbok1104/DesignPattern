package Java.DesignPattern.AdapterTest;

import Java.DesignPattern.Adapter.AccountService;
import Java.DesignPattern.Adapter.AccountUserDetailsService;
import Java.DesignPattern.Adapter.LoginHandler;
import Java.DesignPattern.Adapter.UserDetailsService;
import org.junit.jupiter.api.Test;

public class AdapterTest {

    @Test
    void Test1() {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);

        LoginHandler loginHandler = new LoginHandler(userDetailsService);

        String login = loginHandler.login("Test", "Test");
        System.out.println(login);
    }
}
