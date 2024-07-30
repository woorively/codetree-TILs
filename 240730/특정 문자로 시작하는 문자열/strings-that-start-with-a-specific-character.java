import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
		int n = sc.nextInt();
        String[] str = new String[n];
        for (int i=0; i<n; i++){
            str[i] = sc.next();
        }
        char start = sc.next().charAt(0);

        int cnt = 0;
        int sum = 0;
        for (int i=0; i<n; i++){
            if (str[i].charAt(0) == start) {
                cnt++;
                sum += str[i].length();
            }
        }

        System.out.printf("%d %.2f", cnt, (double)sum / cnt);
    }
}