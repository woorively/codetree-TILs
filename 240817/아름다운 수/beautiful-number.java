import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static int ans = 0;
    static int n;
    static ArrayList<Integer> nums = new ArrayList<>();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        countBtfNum(0);
        System.out.println(ans);
        
    }

    public static boolean isBeautiful(){
        int idx = 0;
        
        while (idx < n) {
            int targetNum = nums.get(idx);

            if (idx + targetNum - 1 >= n){
                return false;
            }

            for (int i=idx; i<idx + targetNum ; i++){
                if (targetNum != nums.get(i)){
                    return false;
                }
            }

            idx += targetNum;
        }
        return true;
    }

    public static void countBtfNum(int num){
        if (num == n) {
            if (isBeautiful())
                ans++;
            return;
        }

        for (int i=1; i<5; i++){
            nums.add(i);
            countBtfNum(num + 1);
            nums.remove(nums.size()-1);
        }
    }
}