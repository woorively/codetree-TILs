import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String strA = sc.next();
        String strB = sc.next();
        
        while (strA.contains(strB)) {
            for (int i=0; i<strA.length()-strB.length(); i++){
                if (strB.equals(strA.substring(i, i+strB.length()))) {
                    strA = strA.replace(strB, "");
                }
            }
        }
        

        System.out.print(strA);
    }
}