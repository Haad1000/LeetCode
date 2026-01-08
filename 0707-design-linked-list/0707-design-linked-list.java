class MyLinkedList {

    class Node {
        int val;
        Node next;

        public Node() {

        }

        public Node(int value) {
            this.val = value;
        }
    }

    Node curr;
    private int length;


    public MyLinkedList() {
        curr = null;
        length = 0;
    }
    
    public int get(int index) {
        if (index < 0 || index >= length) {
            return -1;
        }

        Node temp = curr;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node toAdd = new Node(val);
        toAdd.next = curr;
        curr = toAdd;
        length++;
    }
    
    public void addAtTail(int val) {
        if (length < 1) {
            this.addAtHead(val);
            return;
        }

        Node temp = curr;

        for (int i = 0; i < length - 1; i++) {
            temp = temp.next;
        }

        temp.next = new Node(val);
        length++;
    }
    
    public void addAtIndex(int index, int val) {

        if (index > length) {
            return;
        }

        if (index == 0) {
            this.addAtHead(val);
            return;
        }

        if (index == length) {
            this.addAtTail(val);
            return;
        }

        Node temp = curr;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        Node toAdd = new Node(val);
        toAdd.next = temp.next;
        temp.next = toAdd;
        length++;
        // else {
        //     Node temp = curr;
        //     Node toAdd = new Node(val);

        //     for (int i = 2; i < index; i++) {
        //         temp = temp.next;
        //     }

        //     toAdd.next = temp.next.next;
        //     temp.next = toAdd;

        //     length++;
        // }
    }
    
    public void deleteAtIndex(int index) {

        if (index >= length || index < 0) {
            return;
        }

        if (index == 0) {
            curr = curr.next;
            length--;
            return;
        }

        Node temp = curr;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        length--;
    }
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