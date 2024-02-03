import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        int f = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();
        
        // 출력
        System.out.println("0" + f + "-" + t + "-" + s);
    }
}