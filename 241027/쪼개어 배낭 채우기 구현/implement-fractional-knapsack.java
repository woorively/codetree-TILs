import java.util.*;

class Jewel {
    int weight;
    int value;

    public Jewel(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    @Override
    public String toString() {
        return "(" + weight + ", " + value + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Jewel[] info = new Jewel[n];

        for (int i=0; i<n; i++) {
            info[i] = new Jewel(sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(info, (o1, o2) -> 
            Double.compare((double) o2.value / o2.weight, (double) o1.value / o1.weight)
        );

        // System.out.println(Arrays.deepToString(info));

        double maxValue = 0;
        for (int i=0; i<n; i++) {
            if (m >= info[i].weight) {
                m -= info[i].weight;
                maxValue += info[i].value;
            } else {
                maxValue += (double) info[i].value / info[i].weight * m;
                break;
            }
        }

        System.out.printf("%.3f", maxValue);
    }
}