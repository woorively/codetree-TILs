import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int n;
    public static boolean[] visited;
    public static ArrayList<Integer> answer = new ArrayList<>();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        visited  = new boolean[n + 1];
        choose(1);
    }

    public static void choose(int currNum){
        if (currNum == n + 1){
            for (int i=0; i<n; i++){
                System.out.print(answer.get(i) + " ");
            }
            System.out.println();
            return;
        }

        for (int i=1; i <= n; i++){
            if (visited[i])
                continue;

                visited[i] = true;
                answer.add(i);

                choose(currNum + 1);

                answer.remove(answer.size() - 1);
                visited[i] = false;
        }
    }
}