class LinkedList {
    Node head;
    Node tail;
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public int get(int index) {
        Node curr = this.head;
        int i =0;
        while(curr != null){
            if(i == index){
                return curr.value;
            }
            i++;
            curr = curr.next;
        }
        return -1;
    }

    public void insertHead(int val) {
        Node node = new Node(val);
        if(this.head == null){
            this.head = node;
            this.tail = node;
        }
        else{
            node.next = this.head;
            this.head = node;
        }
    }

    public void insertTail(int val) {
        Node node = new Node(val);
        if(this.tail == null){
            this.head = node;
            this.tail = node;
        }
        else{
            this.tail.next = node;
            this.tail = node;
        }

    }

    public boolean remove(int index) {
        if (this.head == null) {
        return false;
    }
        if (index == 0) {
            this.head = this.head.next;
            if (this.head == null) {
                this.tail = null;
            }
            return true;
         }
        int i = 0;
        Node curr = this.head;
        while(curr!=null && i < index - 1){
            curr =  curr.next;
            i++;
        }
        if (curr == null || curr.next == null) {
            return false;
        }
        curr.next = curr.next.next;
        if (curr.next == null) {
            this.tail = curr;
        }
        return true;
        
    }

    public ArrayList<Integer> getValues() {
        Node curr = this.head;
        ArrayList<Integer> list = new ArrayList<>();
        while(curr != null){
            list.add(curr.value);
            curr = curr.next;
        }
        return list;
    }
}

class Node{
    int value;
    Node next;
    public Node(int value){
        this.value = value;
        this.next=null;
    }
}
