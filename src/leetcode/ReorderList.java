/**
 * Given a singly linked list L: L 0→L 1→…→L n-1→L n,
 reorder it to: L 0→L n →L 1→L n-1→L 2→L n-2→…

 You must do this in-place without altering the nodes' values.

 For example,
 Given{1,2,3,4}, reorder it to{1,4,2,3}.
 */
package leetcode;

public class ReorderList {

    public void reorderList(ListNode head) {
        if (head == null || head.next == null){
            return;
        }

        ListNode slow = head;
        ListNode fast = head;

        //slow指向中间节点
        while (slow.next != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //反转slow之后的链表
        ListNode after = slow.next;
        slow.next = null;
        ListNode pre = null;
        while (after != null){
            ListNode temp = after.next;
            after.next = pre;
            pre = after;
            after = temp;
        }

        //拼接两个链表
        ListNode first = head;
        after = pre;
        while (first != null && after != null){
            ListNode ftemp = first.next;
            ListNode atemp = after.next;
            first.next = after;
            first = ftemp;
            after.next = first;
            after = atemp;
        }

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        ListNode l7 = new ListNode(7);
        ListNode l8 = new ListNode(8);
        ListNode l9 = new ListNode(9);
        ListNode l10 = new ListNode(10);

        l1.next = l7;
        l7.next = l2;
//        l2.next = l6;
//        l6.next = l3;
//        l3.next = l5;
//        l5.next = l4;
//        l4.next = l8;
//        l8.next = l9;
//        l9.next = l10;

        new ReorderList().reorderList(l1);
    }
}
