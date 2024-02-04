import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int am, ae, bm, be;
        
        // 입력
        am = sc.nextInt();
        ae = sc.nextInt();
        bm = sc.nextInt();
        be = sc.nextInt();

        // 출력
        if((am > bm) || (am == bm && ae > be))
            System.out.println("A");
        else
            System.out.println("B");
    }
}