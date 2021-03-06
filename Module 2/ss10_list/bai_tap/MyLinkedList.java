package ss10_list.bai_tap;

public class MyLinkedList<E> {
    class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    private Node head;
    private int numNodes;

    public MyLinkedList(){
    }

    public void addFirst(E element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp = new Node(element);
        numNodes++;
    }

    public void add(E element, int index) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 || temp.next != null; i++) {
            temp = temp.next;
        }

        holder = temp.next;
        temp.data = new Node(element);
        temp.next = holder;
        numNodes++;
    }

    public Object get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public int size() {
        return numNodes;
    }

    public E remove(int index) {
        if (index < 0 || index > numNodes) {
            throw new IllegalArgumentException("Error index: " + index);
        }

        Node temp = head;

        Object data;

        if (index == 0) {
            data = temp.data;
            head = head.next;
            numNodes--;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            numNodes--;
        }
        return (E) data;
    }

    public boolean remove(E element) {
        if (head.data.equals(element)) {
            remove(0);
            return true;
        } else {
            Node temp = head;
            while (temp.next != null) {
                if (temp.next.data.equals(element)) {
                    temp = temp.next.next;
                    numNodes--;
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

    public MyLinkedList<E> clone() {

        if (numNodes == 0) {
            throw new IllegalArgumentException("LinkedList n??y null");
        }

        MyLinkedList<E> returnLinkedList = new MyLinkedList<>();

        Node temp = head;

        returnLinkedList.addFirst((E) temp);
        temp = temp.next;
        while (temp != null) {
            returnLinkedList.addFirst((E) temp.data);
            temp = temp.next;
        }
        return returnLinkedList;
    }

    public boolean constrains(E element) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.data.equals(element)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E element){
        Node temp = head;
        for(int i = 0 ; i < numNodes ; i++){
            if(temp.data.equals(element)){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public E getFirst(){
        Node temp = head;
        if(temp == null){
            throw new IllegalArgumentException("Error head null");
        }
        return (E) temp.data;

    }

    public E getLast(){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public void clear(){
        Node temp = head;
        temp.next = null;
        temp.data = null;
        numNodes = 0;
    }

}
