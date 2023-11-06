public class Problem206 {
    public static void main(String[] args) {
        ListNode n5 = new ListNode(5);
        ListNode n4 = new ListNode(4, n5);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);

        //ListNode.printNode(iterativeReverseList(n1));

        ListNode.printNode(recursiveReverseList(n1));
        //https://leetcode.com/problems/reverse-linked-list/description/
    }

    public static ListNode iterativeReverseList(ListNode head) {
        //iterative solution
        ListNode prev = null;

        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }

    public static ListNode recursiveReverseList(ListNode head) {
        //recursive solution
        return recursion(head, null);
    }

    public static ListNode recursion(ListNode head, ListNode newHead) {
        if (head == null) return newHead;
        ListNode next = head.next;
        head.next = newHead;

        return recursion(next, head);
    }
}
