import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        System.out.println("PASSWORD VALIDATOR");
        Input in = new Input();
        final String user = in.get_user();
        final String pass = in.get_pass();
        boolean flag = true;
        App obj = new App();

        if (flag) {
            boolean len = obj.pass_length(pass);
            if (!len) {
                System.out.println("Password Invalid! Minimum 12 characters required");
                flag = false;
            }
        }

        // System.out.println(user + " " + pass);

    }

    public boolean pass_length(String pass) {
        int len = pass.length();
        if (len < 12)
            return false;

        return true;
    }

}
