import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[] w = new int[n];
        int[] v = new int[n];
        
        for (int i=0; i<n; i++) {
        	st = new StringTokenizer(br.readLine());
            w[i] = Integer.parseInt(st.nextToken());
            v[i] = Integer.parseInt(st.nextToken());
        }
        
        int[] dp = new int[m+1];
        for (int i=0; i<n; i++) {
        	for (int j=m; j>=w[i]; j--) {
        		dp[j] = Math.max(dp[j], dp[j-w[i]] + v[i]);
        	}
        }
         
        System.out.println(dp[m]);
	}

}