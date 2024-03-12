import java.util.Scanner;

class Input extends App {
    Scanner ob = new Scanner(System.in);

    protected void get_user(UserCredentials userCredentials) {
        System.out.println("Username:");
        // Set username and password in UserCredentials object
        String user = ob.nextLine();
        userCredentials.setUsername(user);
        // return
    }

    protected void get_pass(UserCredentials userCredentials) {
        System.out.println("Password:");
        userCredentials.setPassword(ob.nextLine());
        // return ob.nextLine();
    }
}
