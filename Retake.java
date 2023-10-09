import leetcode.ListNode;

import static leetcode.ListNode.printNode;

public class Retake {
    public static void main(String[] args) {
        ListNode node2 = new ListNode(4);
        ListNode node1 = new ListNode(2, node2);
        ListNode head = new ListNode(1, node1);

        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode head2 = new ListNode(1, node3);

        printNode(mergeTwoLists(head, head2));
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        if(list1 == null){
            curr.next = list2;
        }else{
            curr.next = list1;
        }

        return dummy.next;
    }
}
