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
            boolean min_len = obj.pass_min_length(pass);
            if (!min_len) {
                System.out.println("Password Invalid! Minimum 12 characters required");
                flag = false;
            }
        }
        if (flag) {
            boolean max_len = obj.pass_max_length(pass);
            if (!max_len) {
                System.out.println("Password Invalid! Maximum 20 characters.");
                flag = false;
            }
        }

        // System.out.println(user + " " + pass);

    }

    public boolean pass_min_length(String pass) {
        int len = pass.length();
        if (len < 12)
            return false;
        return true;
    }

    public boolean pass_max_length(String pass) {
        int len = pass.length();
        if (len > 20)
            return false;
        return true;
    }

}
