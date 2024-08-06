import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ans = 0;

        int[] arr = new int[n];
        
        int num1 = s.nextInt();
        for (int i=0; i<n-1; i++){
            int num2 = s.nextInt();
            ans = lcm(num1, num2);
            num1 = ans;
        }

        System.out.println(ans);
    }

    static int gcd(int a, int b){
        if (a%b==0)
            return b;

        return gcd(b, a%b);
    }

    static int lcm(int a, int b){
        return (a*b)/gcd(a, b);
    }

}