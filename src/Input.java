import java.util.Scanner;

class Input extends App {
    Scanner ob = new Scanner(System.in);

    protected String get_user() {
        return ob.nextLine();
    }

    protected String get_pass() {
        return ob.nextLine();
    }
}
