import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];
        for (int i=0; i<10; i++){
            num[i] = sc.nextInt();
        }

        for (int i=0; i<9; i++){
            if (num[i+1] % 3 == 0){
                System.out.print(num[i]);
                break;
            }
        }
    }
}