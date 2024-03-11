import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        System.out.println("PASSWORD VALIDATOR");

        boolean flag = false;
        // App obj = new App();
        Test test = new Test();
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            flag = false;
            // Input Section of Program
            Input in = new Input();
            // final String user = in.get_user();
            // final String pass = in.get_pass();
            UserCredentials userCredentials = new UserCredentials();

            // private String user = userCredentials.getUsername();
            // private String pass = userCredentials.getPassword();
            try {
                test.pass_min_length(userCredentials.getPassword());
                test.pass_max_length(userCredentials.getPassword());
                test.passContainsUpperCase(userCredentials.getPassword());
                test.passContainsLowerCase(userCredentials.getPassword());
                test.passContainsDigits(userCredentials.getPassword());
                test.passContainsThreeSpecialChars(userCredentials.getPassword());
                test.passStartsWithSchar2Digit(userCredentials.getPassword());
                test.passContains3Upper3LowerChar(userCredentials.getPassword());
                test.passSameCharSequenceCheck(userCredentials.getPassword());
                test.passContainsUsername(userCredentials.getUsername(), userCredentials.getPassword());
                test.passScharSequenceCheck(userCredentials.getPassword());
                test.passCommonPasswords(userCredentials.getPassword());
                flag = true;
            } catch (InvalidPassword e) {
                System.out.println("Invalid Password! " + e);
            }
            if (!flag && i == 3) {
                System.out.println("Do you want to retry? Yes or No");
                String reply = sc.nextLine();
                if (reply.charAt(0) == 'y' || reply.charAt(0) == 'Y') {
                    i = 0;
                }
            } else if (flag)
                break;
        }

        // System.out.println(user + " " + pass);

    }

    // Password string must consist of Characters - Upper Case (A-Z)

}
