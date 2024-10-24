import java.util.*;

class Node {
    String data;
    Node prev, next;

    public Node(String data) {
        this.data = data;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S_init = sc.next();
        int n = sc.nextInt();

        Node initNode = new Node(S_init);
        Node curr = initNode;
        for (int i=0; i<n; i++) {
            int cmd = sc.nextInt();

            if (cmd == 1) {
                String S_value = sc.next();
                Node prevNode = new Node(S_value);
                curr.prev = prevNode;
                prevNode.next = curr;
            } else if (cmd == 2) {
                String S_value = sc.next();
                Node nextNode = new Node(S_value);
                curr.next = nextNode;
                nextNode.prev = curr;
            } else if (cmd == 3) {
                if (curr.prev.data != null) {
                    curr = curr.prev;
                }
            } else { // 4
                if (curr.next.data != null) {
                    curr = curr.next;
                }
            } 

            if (curr.prev == null) {
                System.out.print("(Null) ");
            } else {
                System.out.print(curr.prev.data + " ");
            }
            if (curr.data == null) {
                System.out.print("(Null) ");
            } else {
                System.out.print(curr.data + " ");
            }
            if (curr.next == null) {
                System.out.print("(Null) ");
            } else {
                System.out.print(curr.next.data + " ");
            }
            System.out.println();
        }
    }
}