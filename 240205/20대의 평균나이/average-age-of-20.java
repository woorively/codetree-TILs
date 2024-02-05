import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;
        double avg=0;
        
        while(true) {
            int n = sc.nextInt();
            
            if(n < 20 || n > 29)
                break;

            sum += n;
            cnt += 1;
        }
        avg=(double)sum/cnt;
        System.out.printf("%.2f", avg);
    }
}