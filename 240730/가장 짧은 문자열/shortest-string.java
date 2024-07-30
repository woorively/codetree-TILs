import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();
           
        int[] lens = {str1.length(), str3.length(), str3.length()};
        Arrays.sort(lens);
        System.out.print(lens[2] - lens[0]);
    }
}