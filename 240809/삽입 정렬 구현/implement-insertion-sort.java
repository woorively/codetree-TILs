import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }

        for (int i=1; i< arr.length; i++){
            int data = arr[i];
            int j;
            for (j=i-1; j>=0 && arr[j] > data; j--){
                arr[j+1] = arr[j];
            }

            arr[j+1] = data;
        }

        for (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

    }
}