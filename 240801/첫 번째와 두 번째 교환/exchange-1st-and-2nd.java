import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        String str = sc.next();
        String ans = "";

        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == str.charAt(0)) {
                ans += str.charAt(1);
            } else if (str.charAt(i) == str.charAt(1)) {
                ans += str.charAt(0);
            } else {
                ans += str.charAt(i);
            }
        }
        
        System.out.print(ans);
    }
}