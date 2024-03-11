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
            if (pass.charAt(i) > 'A' && pass.charAt(i) < 'Z') {
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
            if (pass.charAt(i) > 'a' && pass.charAt(i) < 'z') {
                f = true;
                break;
            }
        }
        if (!f)
            throw new InvalidPassword("Invalid Password! Must constain Lower Case Character.");
    }
}
