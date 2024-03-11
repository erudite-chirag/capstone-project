public interface Validator {

    void pass_min_length(String pass);

    void pass_max_length(String pass);

    // Password string must consist of Characters - Upper Case (A-Z)
    void passContainsUpperCase(String pass);

    // Password string must consist of Characters - Lower Case (a-z)
    void passContainsLowerCase(String pass);

    // Password string should consist of Numbers - (0-9)
    void passContainsDigits(String pass);

    // Passowrd string should consist of atleast 3 Special Characters.
    // Allowed Special Characters are - !, @, #, $, %, ^, &, *, (, ), _, -, and ~
    void passContainsThreeSpecialChars(String pass);

    // Password string should start with either any special character or 2 digit
    // number
    void passStartsWithSchar2Digit(String pass);
}