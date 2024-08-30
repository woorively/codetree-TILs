import java.util.Scanner;

public class Main {
	static int[] arr, tmp;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        arr = new int[n];
        tmp = new int[n];
        
        for (int i=0; i<n; i++) {
        	arr[i] = s.nextInt();
        }
        
        merge_sort(0, arr.length-1);
        
        for (int i=0; i<n; i++) {
        	System.out.print(arr[i] + " ");
        }
    }
    
    static void merge_sort(int left, int right) {
    	if (left == right)
    		return;
    	
    	int mid = (left + right) / 2;
    	merge_sort(left, mid); // 왼쪽 분할
    	merge_sort(mid + 1, right); // 오른쪽 분할
    	merge(left, mid, right);
    }
    
    static void merge(int left, int mid, int right) {
    	int L = left;
    	int R = mid + 1;
    	int idx = left;
    	
    	while (L <= mid && R <= right) {
    		if (arr[L] <= arr[R]) {
    			tmp[idx++] = arr[L++];
    		} else {
    			tmp[idx++] = arr[R++];
    		}
    	}
    	
    	while (L <= mid) {
    		tmp[idx++] = arr[L++];
    	}
    	while (R <= right) {
    		tmp[idx++] = arr[R++];
    	}
    	
    	
    	for (int i=left; i<=right; i++) {
    		arr[i] = tmp[i];
    	}
    }
}