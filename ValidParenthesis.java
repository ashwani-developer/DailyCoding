import java.util.Stack;

public class ValidParenthesis {

    //this program is used to verify valid parenthesis

    public static void main(String[] args) {

        String st = "{[(])}";
        char[] ch = new char[st.length()];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = st.charAt(i);

        }
        Stack<Character> stck = new Stack<>();
        for (char t : ch) {
            if (t == '{' || t == '[' || t == '(') {
                stck.push(t);
            } else if ((t == '}' && stck.peek() == '{') || (t == ')' && stck.peek() == '(') || (t == ']' && stck.peek() == '[')){
                   stck.pop();
            }

        }
        System.out.println("Valid stingg"+ !(stck.size()>0));


    }
}
