import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String strA = sc.next();
        String strB = sc.next();

        int lenA = strA.length();
        int lenB = strB.length();

        while (true){
            int candidates = lenA - lenB + 1;
            for(int i = 0; i < candidates; i++) {
                boolean isSame = true;
                for(int j = 0; j < lenB; j++) {
                    if(strA.charAt(i + j) != strB.charAt(j)) {
                        isSame = false;
                        break;
                    }
                }
                if(isSame) {
                    idx = i;
                    break;
                }
            }
            if (idx == -1)
                break;

            strA = strA.substring(0, idx) + strA.substring(idx + lenB);

            lenA = strA.length();
        }

        System.out.println(strA);
    }
}