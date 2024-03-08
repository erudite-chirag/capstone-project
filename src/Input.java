import java.util.Scanner;

class Input extends App {
    Scanner ob = new Scanner(System.in);

    protected String get_user() {
        return ob.next();
    }

    protected String get_pass() {
        return ob.next();
    }
}
