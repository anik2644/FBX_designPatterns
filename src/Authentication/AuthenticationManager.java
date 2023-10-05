package Authentication;
import CloudSystem.CloudDataManager;
import Gamers.Gamer;

// Singleton AuthenticationManager class for handling authentication
public class AuthenticationManager {

    CloudDataManager cloudDataManager = new CloudDataManager();
    boolean isLogin = false;

    Gamer credential = null;



    // Signup: Create a new user account
    public boolean signup(String username) {
        if (!isLogin) {
            credential = new Gamer(username);
            isLogin = true;
            System.out.println("SignUp Done");

            cloudDataManager.sendData("profile information of " + username + " and other data" );
            return true; // Signup successful
        }
        return false; // Username already exists
    }

    // Login: Authenticate a user and create a session
    public boolean login(String username) {
        if (!isLogin) {
            cloudDataManager.retrieveData("for "+username);
            credential = new Gamer(username);
            isLogin = true;
            System.out.println("Login Done");
            return true; // Signup successful
        }
        return false; // Authentication failed
    }

    // Logout: End the user's session
    public boolean logout(String username) {
        if (isLogin) {
            cloudDataManager.sendData("removing credential" );
            credential = null;
            isLogin = false;
            System.out.println("LogOut Done");
            return true; // Signup successful
        }
        return false;
    }

    // Check if a user is logged in
    public boolean isLoggedIn() {
        return isLogin;
    }
}
/*
// Example usage
public class Main {
    public static void main(String[] args) {
        AuthenticationManager authManager = AuthenticationManager.getInstance();

        // Signup
        boolean signupResult = authManager.signup("user1", "password1");
        System.out.println("Signup Result: " + signupResult);

        // Login
        boolean loginResult = authManager.login("user1", "password1");
        System.out.println("Login Result: " + loginResult);

        // Check if user is logged in
        boolean isLoggedIn = authManager.isLoggedIn("user1");
        System.out.println("Is User Logged In: " + isLoggedIn);

        // Logout
        authManager.logout("user1");
        isLoggedIn = authManager.isLoggedIn("user1");
        System.out.println("Is User Logged In After Logout: " + isLoggedIn);
    }
}
*/