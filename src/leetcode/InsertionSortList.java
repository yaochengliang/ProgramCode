/**
 * Sort a linked list in O(n log n) time using constant space complexity.
 */
package leetcode;

public class InsertionSortList {

    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }

        ListNode cur = head;
        ListNode next = head;
        ListNode new_head = null;
        ListNode new_tail = null;

        while (cur != null){
            next = cur.next;
            if (new_head == null){
                new_head = cur;
                new_tail = cur;
                new_head.next = null;
            } else {
                ListNode tmp_pre = null;
                ListNode tmp_cur = new_head;
                while (tmp_cur != null && cur.val > tmp_cur.val){
                    tmp_pre = tmp_cur;
                    tmp_cur = tmp_cur.next;
                }

                if (tmp_pre == null){
                    cur.next = new_head;
                    new_head = cur;
                } else if (tmp_cur == null){
                    new_tail.next = cur;
                    new_tail = cur;
                    new_tail.next = null;
                } else {
                    tmp_pre.next = cur;
                    cur.next = tmp_cur;
                }
            }

            cur = next;
        }


        return new_head;
    }

    public ListNode insertionSortList2(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }

        ListNode cur = head;
        ListNode next = null;
        ListNode newHead = null;
        ListNode newTail = null;

        while (cur != null){
            next = cur.next;

            if (newHead == null){
                newHead = cur;
                newTail = cur;
                cur.next = null;
            } else {
                ListNode tmp_cur = newHead;
                ListNode tmp_pre = null;

                while (tmp_cur != null && cur.val > tmp_cur.val){
                    tmp_pre = tmp_cur;
                    tmp_cur = tmp_cur.next;
                }

                if (tmp_pre == null){ //插入头部
                    cur.next = newHead;
                    newHead = cur;
                } else if (tmp_cur == null){ //插入尾部
                    newTail.next = cur;
                    cur.next = null;
                    newTail = cur;
                } else { //插入中间
                    tmp_pre.next = cur;
                    cur.next = tmp_cur;
                }
            }

            cur = next;
        }


        return newHead;
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

        ListNode head = new InsertionSortList().insertionSortList2(l1);
    }
}
