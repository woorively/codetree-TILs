import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int[] res = new int[arr.length];
        for (int i=arr.length - 1, j=0; i>=0; i--, j++){
            res[j] = arr[i];
        }

        for (int i=0; i<n; i++){
            if (res[i] % 2 == 0){
                System.out.print(res[i] + " ");
            }
        }


    }
}