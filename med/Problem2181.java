
public class Problem2181 {

    public static void main(String[] args) {
        ListNode first = new ListNode(0);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(0);
        ListNode fifth = new ListNode(4);
        ListNode sixth = new ListNode(5);
        ListNode seventh = new ListNode(2);
        ListNode eights = new ListNode(0);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eights;
        mergeNodes(first);

        while(first != null) {
            System.out.println(first.val);
            first = first.next;
        }

    }

    public static ListNode mergeNodes(ListNode head) {
        ListNode curr = head.next;

        ListNode prev;
        for(prev = head; curr != null && curr.next != null; curr = curr.next) {
            if (curr.val != 0) {
                prev.val += curr.val;
            } else {
                prev.next = curr;
                prev = curr;
            }
        }

        prev.next = null;
        return head;
    }
}
