public class Test implements Validator {

    @Override
    public void pass_min_length(String pass) throws InvalidPassword {
        int len = pass.length();
        if (len < 12)
            throw new InvalidPassword("Invalid Password! Minimum length is 12 charaters.");
        // return true;
    }

    @Override
    public void pass_max_length(String pass) throws InvalidPassword {
        int len = pass.length();
        if (len > 20)
            throw new InvalidPassword("Invalid Password! Maximum length is 20 charaters.");
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
            throw new InvalidPassword("Invalid Password! Must constain Upper Case Character.");
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
            throw new InvalidPassword("Invalid Password! Must constain Lower Case Character.");
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
            throw new InvalidPassword("Invalid Password! Must constain Numbers 0-9.");
    }

    @Override
    public void passContainsThreeSpecialChars(String pass) throws InvalidPassword {
        short count = 0;
        // Allowed Special Characters are - !, @, #, $, %, ^, &, *, (, ), _, -, and ~
        for (int i = 0; i < pass.length(); i++) {
            if (pass.charAt(i) == '!' ||
                    pass.charAt(i) == '@' ||
                    pass.charAt(i) == '#' ||
                    pass.charAt(i) == '$' ||
                    pass.charAt(i) == '%' ||
                    pass.charAt(i) == '^' ||
                    pass.charAt(i) == '&' ||
                    pass.charAt(i) == '*' ||
                    pass.charAt(i) == '(' ||
                    pass.charAt(i) == ')' ||
                    pass.charAt(i) == '_' ||
                    pass.charAt(i) == '-' ||
                    pass.charAt(i) == '~') {

                count++;
            }
        }
        if (count < 3)
            throw new InvalidPassword("Invalid Password! Must constain 3 Special Characters.");
    }

    @Override
    public void passStartsWithSchar2Digit(String pass) {
        boolean f = false;
        if ((pass.charAt(0) == '!' ||
                pass.charAt(0) == '@' ||
                pass.charAt(0) == '#' ||
                pass.charAt(0) == '$' ||
                pass.charAt(0) == '%' ||
                pass.charAt(0) == '^' ||
                pass.charAt(0) == '&' ||
                pass.charAt(0) == '*' ||
                pass.charAt(0) == '(' ||
                pass.charAt(0) == ')' ||
                pass.charAt(0) == '_' ||
                pass.charAt(0) == '-' ||
                pass.charAt(0) == '~')) {
            f = true;
        }
        if (!f && ((pass.charAt(0) >= '0' && pass.charAt(0) <= '9') ||
                (pass.charAt(1) >= '0' && pass.charAt(1) <= '9'))) {
            f = true;
        }

        if (!f) {
            throw new InvalidPassword("Invalid Password! Must Start With a Special Character or Double Digit Number.");
        }
    }

}
