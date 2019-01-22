/**
 * Given a linked list, determine if it has a cycle in it.

 Follow up:
 Can you solve it without using extra space?
 */
package leetcode;

public class HasCycle {
    public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null){
            return false;
        }

        ListNode cur = head;
        ListNode pre = head;

        while (pre.next != null && pre.next.next != null){
            cur = cur.next;
            pre = pre.next.next;

            if (cur.val == pre.val){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        ListNode l7 = new ListNode(7);

        l1.next = l7;
        l7.next = l2;
        l2.next = l6;
        l6.next = l3;
        l3.next = l5;
        l5.next = l4;
//        l4.next = l2;

        System.out.println(new HasCycle().hasCycle(l1));
    }
}
