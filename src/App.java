import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        System.out.println("PASSWORD VALIDATOR");
        Input in = new Input();
        final String user = in.get_user();
        final String pass = in.get_pass();
        boolean flag = true;
        App obj = new App();
        Test test = new Test();

        if (flag) {
            test.pass_min_length(pass);
            test.pass_max_length(pass);
        }

        // System.out.println(user + " " + pass);

    }

    // Password string must consist of Characters - Upper Case (A-Z)

}
