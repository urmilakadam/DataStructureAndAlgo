package LinkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    LinkedList(int value){
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value =value;
        }
    }

    public void getHead() {
       System.out.println("Head: "+ head.value);
    }

    public void getTail() {
        System.out.println("Tail: "+ tail.value);
    }

    public void getLength() {
        System.out.println("Length: "+ length);
    }

    public void printList(){
        Node node = head;
        while(node != null){
            System.out.print(node.value + "-> ");
            node = node.next;
        }
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
           tail.next = newNode;
           tail = newNode;
        }
        length++;
    }

    public void removeLast(){
        if(length == 0){
            return;
        }else if(length == 1){
            head = null;
            tail = null;
        }
        else{
            Node node = head;
            while(node.next.next != null)
                node = node.next;

            tail = node;
            tail.next = null;
        }
        length--;
    }

    public void prepEnd(int value){
        Node newNode = new Node(value);

        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public void removeFirst(){
        if(length == 0){
            head = null;
            tail = null;
        }
        else {
            head = head.next;
            length--;
            if(length == 0) tail = null;
        }

    }
}
