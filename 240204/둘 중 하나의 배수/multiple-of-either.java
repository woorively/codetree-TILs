import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int a;
        
        // 입력
        a = sc.nextInt();

        // 출력
        if(a % 3 == 0 || a % 5 == 0)
            System.out.println(1);
        else
            System.out.println(0);
    }
}