import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for (int j=2; j<=8; j+=2) {
            for (int i=b; i>=a; i--) {
                System.out.print(i + " * " + j + " = " + i*j);
                if (i != a) {
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }
    }
}