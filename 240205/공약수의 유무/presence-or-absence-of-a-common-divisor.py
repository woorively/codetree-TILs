import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언 및 입력
	    int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        boolean satisfied = false;

        for(int i = a; i <= b; i++) {
            // a에서 b사이의 값 중 공약수가 있는지 확인합니다.
            if(1920 % i == 0 && 2880 % i == 0)
                satisfied = true;
        }

        //출력
        if(satisfied == true)
            System.out.println("1");
        else
            System.out.println("0");
    }
}