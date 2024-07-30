import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        selectionSort(nums);

        for (int num:nums){
            System.out.print(num + " ");
        }
    }

    static void selectionSort(int[] arr){
            // 선택 정렬 알고리즘 구현
            // 2. 해당 값을 맨 첫번째에 배치함
            // 3. 첫번째 값을 제외하고 가장 작은 값을 찾아 두번째에 배치함
            // 4. 두번째, 세번째, ... n-1번째 값을 제외하고 가장 작은 값을 찾아 정해진 위치에 배치함.
            for (int i=0; i<arr.length; i++) {
                int minIdx = i;
                // 1. 전체 값 중 가장 작은 값을 찾음
                for (int j=i+1; j<arr.length; j++){
                    if (arr[j] < arr[minIdx]) {
                        minIdx = j;
                    }
                }
                int tmp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = tmp;
            }

        }
}