import java.util.Scanner;

class Input extends App {
    Scanner ob = new Scanner(System.in);

    protected void get_user(UserCredentials userCredentials) {
        String user = null;
        for (;;) {
            System.out.println("Username:");
            // Set username and password in UserCredentials object
            user = ob.nextLine();
            if (user.equals(null) || user.equals("")) {
                System.out.println("Username Cannot Be Empty!⦰\n");
                continue;
            } else if (user.contains(" ")) {
                System.out.println("Spaces Not Allowed");
            } else
                break;
        }
        userCredentials.setUsername(user);
    }

    protected void get_pass(UserCredentials userCredentials) {
        System.out.println("Password:");
        userCredentials.setPassword(ob.nextLine());
        // return ob.nextLine();
    }
}
