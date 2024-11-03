import java.util.*;

class Node {
    String data;
    Node prev, next;

    public Node(String data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class Main {
    public static void insertPrev(Node n, Node c) {
        if (c.prev != null) {
            n.prev = c.prev;
            c.prev.next = n;
        }

        c.prev = n;
        n.next = c;
    }

    public static void insertNext(Node n, Node c) {
        if (c.next != null) {
            c.next.prev = n;
            n.next = c.next;
        }

        c.next = n;
        n.prev = c;
    }

    public static void changePrev(Node c) {
        if (c.prev != null) {
            ///////////////////////
            Node prevNode = c.prev;

            // 현재 노드와 이전 노드의 연결 변경
            if (prevNode.prev != null) {
                prevNode.prev.next = c;
            }
            c.prev = prevNode.prev;

            // 이전 노드를 현재 노드 뒤로 이동
            prevNode.next = c.next;
            if (c.next != null) {
                c.next.prev = prevNode;
            }
            c.next = prevNode;
            prevNode.prev = c;
        }
    }

    public static void changeNext(Node c) {
        if (c.next != null) {
            // 원래의 다음 노드를 저장
            Node nextNode = c.next;

            // `nextNode` 다음 노드로 `c`를 연결
            if (nextNode.next != null) {
                nextNode.next.prev = c;
                c.next = nextNode.next;
            } else {
                c.next = null;
            }

            // `nextNode`를 `c`의 이전 위치로 이동
            nextNode.prev = c.prev;
            nextNode.next = c;

            if (c.prev != null) {
                c.prev.next = nextNode;
            }
            
            c.prev = nextNode;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S_init = sc.next();
        int n = sc.nextInt();

        Node cur = new Node(S_init);
        for (int i=0; i<n; i++) {
            int cmd = sc.nextInt();

            if (cmd == 1) {
                String S_value = sc.next();
                insertPrev(new Node(S_value), cur);
            } else if (cmd == 2) {
                String S_value = sc.next();
                insertNext(new Node(S_value), cur);
            } else if (cmd == 3) {
                changePrev(cur);
            } else {
                changeNext(cur);
            }

            // print
            String str = "(Null)";

            if (cur.prev == null) System.out.print(str + " ");
            else System.out.print(cur.prev.data + " ");

            System.out.print(cur.data + " ");

            if (cur.next == null) System.out.println(str + " ");
            else System.out.println(cur.next.data + " ");

        }
    }
}