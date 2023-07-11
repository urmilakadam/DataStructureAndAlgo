package LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList(4);
        list.getHead();
        list.getTail();
        list.getLength();
        //list.printList();

        list.append(5);
        list.append(8);
        list.append(10);
        list.append(12);
        list.printList();
        System.out.println("\ndelete node ");
        list.removeLast();
        list.printList();

        list.prepEnd(1);
        list.prepEnd(2);
        list.prepEnd(3);
        System.out.println("\ninsert first ");
        list.printList();

        System.out.println("\ndelete node ");
        list.removeLast();
        list.printList();

        list.removeFirst();
        System.out.println("\nremove first ");
        list.printList();

    }
}
