import java.util.*;

class Node {
    int data;
    Node prev, next; // Node 타입으로 변경

    public Node(int data) { // 생성자 수정
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 노드 수
        int q = sc.nextInt(); // 쿼리 수

        HashMap<Integer, Node> nodes = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            nodes.put(i, new Node(i)); // 각 노드를 초기화하여 HashMap에 추가
        }

        for (int i = 0; i < q; i++) {
            int cmd = sc.nextInt();
            int idx = sc.nextInt();

            if (cmd == 1) { // idx번 노드를 연결 리스트에서 분리
                Node curr = nodes.get(idx);
                if (curr.prev != null) {
                    curr.prev.next = null;
                    curr.prev = null;
                }
                if (curr.next != null) {
                    curr.next.prev = null;
                    curr.next = null;
                }
            } else if (cmd == 2) { // 단일 노드 j를 i 앞에 삽입
                int j = sc.nextInt();
                Node curr = nodes.get(j);
                Node target = nodes.get(idx);

                if (curr.prev != null || curr.next != null) { // curr 노드가 연결된 상태일 경우 분리
                    if (curr.prev != null) curr.prev.next = curr.next;
                    if (curr.next != null) curr.next.prev = curr.prev;
                }

                curr.next = target;
                curr.prev = target.prev;
                if (target.prev != null) {
                    target.prev.next = curr;
                }
                target.prev = curr;
            } else if (cmd == 3) { // 단일 노드 j를 i 뒤에 삽입
                int j = sc.nextInt();
                Node curr = nodes.get(j);
                Node target = nodes.get(idx);

                if (curr.prev != null || curr.next != null) { // curr 노드가 연결된 상태일 경우 분리
                    if (curr.prev != null) curr.prev.next = curr.next;
                    if (curr.next != null) curr.next.prev = curr.prev;
                }

                curr.prev = target;
                curr.next = target.next;
                if (target.next != null) {
                    target.next.prev = curr;
                }
                target.next = curr;
            } else { // i번 노드의 이전 노드와 다음 노드의 번호를 출력
                Node curr = nodes.get(idx);

                System.out.print((curr.prev == null ? 0 : curr.prev.data) + " ");
                System.out.println((curr.next == null ? 0 : curr.next.data));
            }
        }

        for (int i = 0; i < n; i++) { // 각 노드의 다음 노드 번호를 출력
            Node curr = nodes.get(i);
            System.out.print((curr.next == null ? 0 : curr.next.data) + " ");
        }
    }
}