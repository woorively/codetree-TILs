import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언
        int a;

        a = sc.nextInt();
        
        for(int i = 1; i <= a; i++) {
            if ((i % 2 == 0 && i % 4 != 0) || ((i / 8) % 2 == 0) || ((i % 7) < 4))
                continue;
            System.out.print(i + " ");
        }
    }
}