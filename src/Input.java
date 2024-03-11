import java.util.Scanner;

class Input extends App {
    Scanner ob = new Scanner(System.in);

    protected String get_user() {
        System.out.println("Username:");
        return ob.nextLine();
    }

    protected String get_pass() {
        System.out.println("Password:");
        return ob.nextLine();
    }
}
