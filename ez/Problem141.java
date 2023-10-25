import leetcode.ListNode;

import java.util.HashSet;

import static leetcode.ListNode.printNode;

public class Problem141 {
    public static void main(String[] args) {
        ListNode nNegative4 = new ListNode(-4);
        ListNode n0 = new ListNode(0, nNegative4);
        ListNode n2 = new ListNode(2, n0);
        ListNode head = new ListNode(3, n2);
        nNegative4.next = n2;
        int pos = 1;


        System.out.println(hasCycle(head));
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null) return false;
        HashSet<ListNode> hs = new HashSet<>();
        ListNode curr = head;

        while (curr.next != null) {
            if (hs.contains((curr))) {
                return true;
            }
            hs.add(curr);
            curr = curr.next;
        }

        return false;
    }
}
