import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int m = sc.nextInt();
        
        System.out.println((n*m) / gcd(n, m));
    }

    public static int gcd(int a, int b){
        while (b != 0){
            int temp = a;
            a = b;
            b = temp%b;
        }
        return a;
    }
}