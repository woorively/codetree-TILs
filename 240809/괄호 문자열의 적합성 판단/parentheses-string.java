import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();

        System.out.println(check(str));

    }

    static String check(String str) {
        Stack<Character> st = new Stack<>();
        for (int i=0; i<str.length(); i++){
            char item = str.charAt(i);

            if (item == '('){
                st.push(item);
            } else {
                if (st.isEmpty()){
                    return "No";
                } else {
                    st.pop();
                }

            }
        }
        return st.isEmpty() ? "Yes" : "No";
    }
}