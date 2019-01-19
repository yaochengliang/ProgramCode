package leetcode;

/**
 *
 Given a linked list, return the node where the cycle begins. If there is no cycle, returnnull.

 Follow up:
 Can you solve it without using extra space?
 */

public class DetectCycle {

    public ListNode detectCycle(ListNode head) {
        boolean flag = false;

        if (head == null || head.next == null){
            return null;
        }

        ListNode cur = head;
        ListNode pre = head;
        while (pre!=null && pre.next!=null && pre.next.next != null){
            pre = pre.next.next;
            cur = cur.next;

            if (pre.val == cur.val){
                flag = true;
                pre = head;
                while (pre.val != cur.val){
                    pre = pre.next;
                    cur = cur.next;
                }
                break;
            }
        }

        if (!flag){
            return null;
        }

        return cur;
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
//        l6.next = l3;
//        l3.next = l5;
//        l5.next = l4;
//        l4.next = l2;

        System.out.println(new DetectCycle().detectCycle(l1));

    }
}
