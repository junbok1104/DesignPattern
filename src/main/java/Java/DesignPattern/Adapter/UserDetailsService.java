package Java.DesignPattern.Adapter;

public interface UserDetailsService {
    UserDetails loadUser(String userName);
}
