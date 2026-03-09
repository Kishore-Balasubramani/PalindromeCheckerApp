import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String text) {
        String processed = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : processed.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}
