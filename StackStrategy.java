import java.util.Stack;

public class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String text) {
        String processed = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        Stack<Character> stack = new Stack<>();

        for (char c : processed.toCharArray()) {
            stack.push(c);
        }

        for (char c : processed.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}
