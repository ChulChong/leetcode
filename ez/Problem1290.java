
public class Problem1290 {
    public static void main(String[] args) {
        ListNode third = new ListNode(1);
        ListNode second = new ListNode(0, third);
        ListNode first = new ListNode(1, second);

        System.out.println(getDecimalValue(first));

    }

    public static int getDecimalValue(ListNode head) {
        int ans = 0;

        while (head != null) {
            ans *= 2;
            ans += head.val;
            head = head.next;
        }
        return ans;
    }
}
