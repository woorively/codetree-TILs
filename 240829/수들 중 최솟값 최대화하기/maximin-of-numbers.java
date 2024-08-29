import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n;
    static int[][] map;
    static int[] arr;
    static int answer;
    static int result=0;
    static boolean[] visited;
    static int a;
    static int b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        answer=Integer.MAX_VALUE;
        visited = new boolean[n];
        map = new int[n][n];
        arr = new int[n];
        a=0;
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j<n;j++) {
                map[i][j] = sc.nextInt();
            }
        }
        recur(0,0);
        
        System.out.println(b);
    }
    static void recur(int depth,int at){
        if(depth == n){
            // System.out.println(answer +" "+result+Arrays.toString(arr));
                answer= Math.min(answer,result);
                a=arr[0];
                for(int i = 1 ; i <n;i++) {
                    if(a>arr[i]) {
                        a=arr[i];
                        
                    }
                    b=Math.max(b, a);
                }
            
            return;
        }
        
        
        for(int i = at ; i < n ; i++){
            if(!visited[i]) {
                visited[i]=true;
                arr[i] = map[depth][i];
                result += arr[i];
                if(promising(depth)){
                    recur(depth+1,at+1);
                    result-=arr[i];
                }
                visited[i]=false;
            }
            
        }
    }
    static boolean promising(int depth) {
        for(int i = 0 ; i <depth;i++) {
            if(depth == i) { // || ㅜㅜ) {
                return false;
            }
        }
        return true;

    }
}