public class SpecialChars {
    public static boolean SpecialChar(String pass, int i) {
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
            return true;
        } else
            return false;
    }
}
