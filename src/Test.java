public class Test implements Validator {

    @Override
    public void pass_min_length(String pass) throws InvalidPassword {
        int len = pass.length();
        if (len < 12)
            throw new InvalidPassword("Invalid Password! Minimum length is 12 charaters.");
        // return true;
    }

    @Override
    public void pass_max_length(String pass) {
        int len = pass.length();
        if (len > 20)
            throw new InvalidPassword("Invalid Password! Maximum length is 20 charaters.");
        // return true;
    }

}
