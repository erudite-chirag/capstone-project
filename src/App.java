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
            final String user = in.get_user();
            final String pass = in.get_pass();
            try {
                test.pass_min_length(pass);
                test.pass_max_length(pass);
                test.passContainsUpperCase(pass);
                test.passContainsLowerCase(pass);
                test.passContainsDigits(pass);
                test.passContainsThreeSpecialChars(pass);
                test.passStartsWithSchar2Digit(pass);
                test.passContains3Upper3LowerChar(pass);
                test.passSameCharSequenceCheck(pass);
                test.passContainsUsername(user, pass);
                test.passScharSequenceCheck(pass);
                test.passCommonPasswords(pass);
                flag = true;
            } catch (InvalidPassword e) {
                System.out.println(e);
            }
            // if (!flag && i == 3) {
            // System.out.println("Do you want to retry? Yes or No");
            // String reply = sc.nextLine();
            // if (reply.charAt(0) == 'y' || reply.charAt(0) == 'Y') {
            // i = 0;
            // }
            // } else if (flag)
            // break;
        }

        // System.out.println(user + " " + pass);

    }

    // Password string must consist of Characters - Upper Case (A-Z)

}
