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
        
        if(b > a && b < c)
            System.out.println("1");
        else
            System.out.println("0");
    }
}