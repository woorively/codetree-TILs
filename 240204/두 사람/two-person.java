import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int p1a, p2a;
        char p1g, p2g;
        
        // 입력
        p1a = sc.nextInt();
        p1g = sc.next().charAt(0);
        p2a = sc.nextInt();
        p2g = sc.next().charAt(0);

        // 출력
        if((p1a >= 19 && p1g == 'M') || (p2a >= 19 && p2g == 'M'))
            System.out.println(1);
        else
            System.out.println(0);
    }
}