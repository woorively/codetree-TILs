import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        func(n);
    }

    public static void func(int n){
        if (n==0){
            return;
        }

        System.out.print(n + " ");
        func(n-1);
        System.out.print(n + " ");
    }
}