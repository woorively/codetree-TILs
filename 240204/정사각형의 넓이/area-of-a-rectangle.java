import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int n;
        
        // 입력
        n = sc.nextInt();
        
        // 출력
        System.out.println(n * n);

        if(n < 5)
            System.out.println("tiny");
    }
}