import java.util.Scanner;

class Input extends App {
    Scanner ob = new Scanner(System.in);
    UserCredentials userCredentials = new UserCredentials();

    protected void get_user() {
        System.out.println("Username:");
        // Set username and password in UserCredentials object
        String user = ob.nextLine();
        userCredentials.setUsername(user);
        // return
    }

    protected void get_pass() {
        System.out.println("Password:");
        userCredentials.setPassword(ob.nextLine());
        // return ob.nextLine();
    }
}
