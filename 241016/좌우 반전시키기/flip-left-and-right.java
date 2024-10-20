import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int ans = 0;
        for (int i=1; i<n; i++) {
            // System.out.println(Arrays.toString(arr));
            if (arr[i-1] == 0) {
                ans++;
                for (int j=i-1; j<=i+1; j++) {
                    if (j==n) continue;
                    arr[j] = (arr[j] == 1)? 0 : 1;
                }
            }
            
        }

        if (arr[n-1] == 0) {
            ans = -1;
        } 

        System.out.println(ans);
    }
}