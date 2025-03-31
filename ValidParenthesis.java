import java.util.Stack;
import java.util.stream.Stream;

public class ValidParenthesis {

    //this program is used to verify valid parenthesis

    public static void main(String[] args) {

        String st = "()()()()()()()()()()()()()()()";
        Stack<Character> stck = new Stack<>();

        for (int t = 0; t < st.length(); t++) {
            if (st.charAt(t) == '{' || st.charAt(t) == '[' || st.charAt(t) == '(') {
                stck.push(st.charAt(t));
            } else if ((st.charAt(t) == '}' && stck.peek() == '{') || (st.charAt(t) == ')' && stck.peek() == '(') || (st.charAt(t) == ']' && stck.peek() == '[')) {
                stck.pop();
            }

        }
        System.out.println("Valid stingg" + !(stck.size() > 0));


    }
}
