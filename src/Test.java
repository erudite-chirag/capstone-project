import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test implements Validator {

    @Override
    public void pass_min_length(String pass) throws InvalidPassword {
        int len = pass.length();
        if (len < 12)
            throw new InvalidPassword(" Minimum length is 12 charaters.");
        // return true;
    }

    @Override
    public void pass_max_length(String pass) throws InvalidPassword {
        int len = pass.length();
        if (len > 20)
            throw new InvalidPassword(" Maximum length is 20 charaters.");
        // return true;
    }

    @Override
    public void passContainsUpperCase(String pass) throws InvalidPassword {
        boolean f = false;
        for (int i = 0; i < pass.length(); i++) {
            if (pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z') {
                f = true;
                break;
            }
        }
        if (!f)
            throw new InvalidPassword(" Must constain Upper Case Character.");
    }

    @Override
    public void passContainsLowerCase(String pass) throws InvalidPassword {
        boolean f = false;
        for (int i = 0; i < pass.length(); i++) {
            if (pass.charAt(i) >= 'a' && pass.charAt(i) <= 'z') {
                f = true;
                break;
            }
        }
        if (!f)
            throw new InvalidPassword(" Must constain Lower Case Character.");
    }

    @Override
    public void passContainsDigits(String pass) throws InvalidPassword {
        boolean f = false;
        for (int i = 0; i < pass.length(); i++) {
            if (pass.charAt(i) >= '0' && pass.charAt(i) <= '9') {
                f = true;
                break;
            }
        }
        if (!f)
            throw new InvalidPassword(" Must constain Numbers 0-9.");
    }

    @Override
    public void passContainsThreeSpecialChars(String pass) throws InvalidPassword {
        short count = 0;
        // Allowed Special Characters are - !, @, #, $, %, ^, &, *, (, ), _, -, and ~
        for (int i = 0; i < pass.length(); i++) {

            if (SpecialChars.SpecialChar(pass, i)) {
                count++;
            }
        }
        if (count < 3)
            throw new InvalidPassword(" Must constain 3 Special Characters.");
    }

    @Override
    public void passStartsWithSchar2Digit(String pass) {
        boolean f = false;
        if ((SpecialChars.SpecialChar(pass, 0))) {
            f = true;
        }
        if (!f && ((pass.charAt(0) >= '0' && pass.charAt(0) <= '9') ||
                (pass.charAt(1) >= '0' && pass.charAt(1) <= '9'))) {
            f = true;
        }

        if (!f) {
            throw new InvalidPassword(" Must Start With a Special Character or Double Digit Number.");
        }
    }

    @Override
    public void passContains3Upper3LowerChar(String pass) {
        short c1 = 0, c2 = 0;
        for (int i = 0; i < pass.length(); i++) {
            if (pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z') {
                c1++;
            }
            if (pass.charAt(i) >= 'a' && pass.charAt(i) <= 'z') {
                c2++;
            }
        }
        if (c1 < 3 || c2 < 3) {
            throw new InvalidPassword(" Must Contain 3 UpperCase and 3 LowerCase Characters.");
        }
    }

    @Override
    public void passSameCharSequenceCheck(String pass) {
        short count = 0;
        for (int i = 0; i < pass.length() - 1; i++) {
            if (pass.charAt(i) == pass.charAt(i + 1)) {
                count++;
                if (count >= 4) {
                    throw new InvalidPassword(
                            " Cannot Contain Same Characters or Numbers more than 5 times .");
                }
                continue;
            } else
                count = 0;
        }
    }

    @Override
    public void passContainsUsername(String user, String pass) {
        user = user.toLowerCase();
        pass = pass.toLowerCase();

        boolean f = pass.contains(user);
        if (f) {
            throw new InvalidPassword(" Password Cannot Contain Username in it");
        }
    }

    @Override
    public void passScharSequenceCheck(String pass) {
        short count = 0;
        // Allowed Special Characters are - !, @, #, $, %, ^, &, *, (, ), _, -, and ~
        for (int i = 0; i < pass.length() - 1; i++) {
            if (SpecialChars.SpecialChar(pass, i)) {

                if (pass.charAt(i) == pass.charAt(i + 1)) {
                    count++;
                    if (count >= 2) {
                        throw new InvalidPassword(
                                " Cannot Contain 3 Same Special Characters Consecutively .");
                    }
                    continue;
                } else
                    count = 0;

            }
        }
    }

    @Override
    public void passCommonPasswords(String pass) throws IOException {
        try {
            File f = new File("CommonPass.txt");
            FileReader fr = new FileReader(f);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                if (pass.equals(line)) {
                    throw new InvalidPassword(" Cannot be a common password");
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("IOException:" + e);
        }
    }
}
