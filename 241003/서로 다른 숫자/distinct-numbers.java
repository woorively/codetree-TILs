import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static final int MAX_N = 100000;
    
    public static int n;
    public static int[] arr = new int[MAX_N];
    public static HashSet<Integer> s = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for(int i = 0; i < n; i++)
            s.add(arr[i]);
        
        System.out.print(s.size());
    }
}