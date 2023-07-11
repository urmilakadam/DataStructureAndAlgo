package LinkedList;

public class BinaryLinkedList {

    public class ListNode { int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

    public int getDecimalValue(ListNode head) {

        ListNode node = head;
        StringBuilder sb = new StringBuilder();

        while(node != null){
            sb.append(node.val);
            node = node.next;
        }

       return Integer.parseInt(sb.toString(), 2);
    }
}
