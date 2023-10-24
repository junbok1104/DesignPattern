package Java.DesignPattern.Adapter;

public class LoginHandler {

    UserDetailsService userDetailsService;

    public LoginHandler(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    public String login(String userName, String pw) {
        UserDetails userDetails = userDetailsService.loadUser(userName);

        if(userDetails.getUserPw().equals(pw)) {
            return userDetails.getUserName();
        }else {
            throw new IllegalArgumentException();
        }
    }

}