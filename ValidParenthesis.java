import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ValidParenthesis {

    //this program is used to verify valid parenthesis

    public static void main(String[] args) {

        String st = "()()()()()()()()()()()()()()()";
        Stack<Character> stck = new Stack<>();
        for (int t = 0; t < st.length(); t++) {
            char c = st.charAt(t);
            if (c == '{' || c == '[' || c == '(') {
                stck.push(c);
            } else if (!stck.isEmpty() &&
                    ((c == '}' && stck.peek() == '{') ||
                            (c == ')' && stck.peek() == '(') ||
                            (c == ']' && stck.peek() == '['))) {
                stck.pop();
            } else {
                // If a closing bracket does not match, it's invalid
                System.out.println("Invalid String");
                return;
            }
        }
        System.out.println("Valid stingg" + !(stck.size() > 0));
        Deque<Character> stack = new ArrayDeque<>();

        boolean isValid = IntStream.range(0, st.length())
                .mapToObj(st::charAt)
                .allMatch(c -> {
                    if (c == '{' || c == '[' || c == '(') {
                        stack.push(c);
                        return true;
                    } else if (!stack.isEmpty() &&
                            ((c == '}' && stack.peek() == '{') ||
                                    (c == ')' && stack.peek() == '(') ||
                                    (c == ']' && stack.peek() == '['))) {
                        stack.pop();
                        return true;
                    }
                    return false; // Invalid case
                });
        System.out.println("is this valid"+ (isValid && stack.isEmpty()));
    }
}
