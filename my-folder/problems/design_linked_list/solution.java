public class MyLinkedList {

    private static class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size = 0;

    public MyLinkedList() {
        head = null;
        tail = null;
    }

    public MyLinkedList(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    public Node getIndex(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void deleteFirst() {
        if (head != null) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size--;
        }
    }

    public void deleteLast() {
        if (size <= 1) {
            deleteFirst();
        } else {
            Node secondLast = getIndex(size - 2);
            tail = secondLast;
            tail.next = null;
            size--;
        }
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.val;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void addAtTail(int val) {
        if (tail == null) {
            addAtHead(val);
        } else {
            Node node = new Node(val);
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
        } else if (index == size) {
            addAtTail(val);
        } else if (index > 0 && index < size) {
            Node prev = getIndex(index - 1);
            Node node = new Node(val);
            node.next = prev.next;
            prev.next = node;
            size++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        if (index == 0) {
            deleteFirst();
            return;
        } else if (index == size - 1) {
            deleteLast();
            return;
        } else {
            Node prev = getIndex(index - 1);
            prev.next = prev.next.next;
            size--;
        }
    }

    // public static void main(String[] args) {
    //     MyLinkedList myLinkedList = new MyLinkedList();
    //     myLinkedList.addAtHead(1);
    //     myLinkedList.addAtTail(3);
    //     myLinkedList.addAtIndex(1, 2); // linked list becomes 1->2->3
    //     System.out.println(myLinkedList.get(1)); // return 2
    //     myLinkedList.deleteAtIndex(1); // now the linked list is 1->3
    //     System.out.println(myLinkedList.get(1)); // return 3
    // }
}

    

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */