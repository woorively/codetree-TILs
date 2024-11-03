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
        
        for (int i = 0; i < n; i++) {
            int cmd = sc.nextInt();

            if (cmd == 1) { // 이전 노드에 추가
                String S_value = sc.next();
                Node prevNode = new Node(S_value);
                prevNode.next = curr;
                prevNode.prev = curr.prev;
                
                if (curr.prev != null) {
                    curr.prev.next = prevNode;  
                }
                curr.prev = prevNode;
            } else if (cmd == 2) { // 다음 노드에 추가
                String S_value = sc.next();
                Node nextNode = new Node(S_value);
                nextNode.prev = curr;
                nextNode.next = curr.next;

                if (curr.next != null) {
                    curr.next.prev = nextNode;
                }
                curr.next = nextNode;
            } else if (cmd == 3) { // 이전으로 이동
                if (curr.prev != null) {
                    curr = curr.prev;
                }
            } else { // 4: 다음으로 이동
                if (curr.next != null) {
                    curr = curr.next;
                }
            }

            // 현재 상태 출력
            System.out.print((curr.prev == null ? "(Null) " : curr.prev.data + " "));
            System.out.print(curr.data + " ");
            System.out.print((curr.next == null ? "(Null) " : curr.next.data + " "));
            System.out.println();
        }
    }
}