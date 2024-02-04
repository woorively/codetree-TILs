import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int a, b, c;
        
        // 입력
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if((a < b && a > c) || (a < c && a > b)) {
            System.out.println(a);
        }
        else if ((b < a && b > c) || (b < c && b > a)){
            System.out.println(b);
        }
        else
            System.out.println(c);
    }
}