public class Test implements Validator {

    @Override
    public boolean pass_min_length(String pass) {
        int len = pass.length();
        if (len < 12)
            return false;// throw new InvalidPassword("Invalid Password! Minimum length is 12 charaters")
        return true;
        // throw new UnsupportedOperationException("Unimplemented method
        // 'pass_length'");
    }

    @Override
    public boolean pass_max_length(String pass) {
        int len = pass.length();
        if (len > 20)
            return false;
        return true;
        // throw new UnsupportedOperationException("Unimplemented method
        // 'pass_max_length'");
    }

}
