package src;

public class MyCalendar {
    class Node {
        int start;
        int end;
        Node leftNode;
        Node rightNode;
        Node(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
    Node root;

    public MyCalendar() {

    }

    public boolean book(int start, int end) {
        if (root == null) {
            root = new Node(start, end);
            return true;
        }

        Node cur = root;
        while (true) {
            if (end <= cur.start) {
                if (cur.leftNode == null) {
                    cur.leftNode = new Node(start, end);
                    return true;
                }
                cur = cur.leftNode;
            } else if (start >= cur.end) {
                if (cur.rightNode == null) {
                    cur.rightNode = new Node(start, end);
                    return true;
                }
                cur = cur.rightNode;
            } else
                return false;
        }
    }
}
