/**
 * Sort a linked list in O(n log n) time using constant space complexity.
 */
package leetcode;

public class SortList {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }

        ListNode mid = getMid(head);
        ListNode head2 = mid.next;
        mid.next = null;

        return merge(sortList(head),sortList(head2));
    }

    public ListNode getMid(ListNode head){

        if (head == null || head.next == null){
            return head;
        }

        ListNode slow = head;
        ListNode quick = head;
        while (quick.next != null && quick.next.next != null){
            slow = slow.next;
            quick = quick.next.next;
        }

        return slow;
    }

    public ListNode merge(ListNode l1,ListNode l2){
        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }

        ListNode preHead = new ListNode(0);
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode c = preHead;
        while (c1 != null && c2 != null){
            if (c1.val < c2.val){
                c.next = c1;
                c1 = c1.next;
            } else {
                c.next = c2;
                c2 = c2.next;
            }
            c = c.next;
        }

        if (c1 != null){
            c.next = c1;
        }

        if (c2 != null){
            c.next = c2;
        }


        return preHead.next;
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

        System.out.println(new SortList().sortList(l1).val);
    }
}

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

