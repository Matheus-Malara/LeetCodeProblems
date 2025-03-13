package ep20validparentheses;

public class Main {
    public static void main(String[] args) {
        System.out.println(ValidParenthesesSolution.isValid("()"));
        System.out.println(ValidParenthesesSolution.isValid("()[]{}"));
        System.out.println(ValidParenthesesSolution.isValid("(]"));
        System.out.println(ValidParenthesesSolution.isValid("([])"));
    }
}