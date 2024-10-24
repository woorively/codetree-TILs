import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        Long n = sc.nextLong();
        if (n%3 == 1) {
            System.out.print("m");
        } else {
            System.out.print("o");
        }
    }
}