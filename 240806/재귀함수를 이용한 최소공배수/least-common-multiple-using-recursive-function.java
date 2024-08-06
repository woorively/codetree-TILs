import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ans = 0;

        int num1 = s.nextInt();
        for (int i=0; i<n-1; i++){
            int num2 = s.nextInt();
            ans = (num1 * num2) / gcd(num1, num2);
            num1 = (num1 * num2) / gcd(num1, num2);
        }

        System.out.println(ans);
    }

    static int gcd(int a, int b){
        if (a%b==0)
            return b;

        return gcd(b, a%b);
    }
}