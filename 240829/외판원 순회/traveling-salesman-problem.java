import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n, minCost;
    static int[] result;
    static int[][] costMap;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        costMap = new int[n][n];
        result = new int[n-1];
        visited = new boolean[n];
        minCost = Integer.MAX_VALUE;

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                costMap[i][j] = s.nextInt();
            }
        }
        
        huilai(0);
        System.out.println(minCost);
    }

    static void huilai(int idx){
        if (idx == n-1){
        	minCost = Math.min(minCost, calc());
//            System.out.println(Arrays.toString(result));
            return;
        }

        for (int i=0; i<n-1; i++){
            if (visited[i]) continue;

            result[idx] = i;
            visited[i] = true;
            huilai(idx + 1);
            visited[i] = false;
        }
    }
    
    static int calc() {
        // 앞 뒤의 값
        int cost = costMap[0][result[0]+1] + costMap[result[result.length-1]+1][0];

        for (int i=0; i<result.length-1; i++){
        	if (costMap[result[i]+1][result[i+1]+1] == 0)
        		return Integer.MAX_VALUE;
            cost += costMap[result[i]+1][result[i+1]+1];
            
        }
//		System.out.println(cost);
        return cost;
    }
}