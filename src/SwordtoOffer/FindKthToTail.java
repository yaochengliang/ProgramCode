/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
package SwordtoOffer;

import java.util.Stack;

public class FindKthToTail {

    public ListNode findKthToTail(ListNode head,int k) {
        if (head == null || k<= 0){
            return null;
        }
        Stack<ListNode> stack = new Stack<ListNode>();
        int count = 0;
        while (head.next != null){
            stack.push(head);
            head = head.next;
            count ++;
        }
        stack.push(head);
        count += 1;
        if (k > count){
            return null;
        }
        ListNode result = null;
        for (int i=1; i<= k; i++){
            result = stack.pop();
        }

        return result;
    }

    public ListNode findKthToTail2(ListNode head,int k) {
        if (head == null || k<= 0){
            return null;
        }
        ListNode p = head;
        ListNode pre = head;
        for (int i=1; i< k; i++){
            if (pre == null){
                return null;
            }
            pre = pre.next;
        }
        if (pre == null){
            return null;
        }
        while (pre.next != null){
            p = p.next;
            pre = pre.next;
        }

        return p;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);
        ListNode listNode7 = new ListNode(7);
        ListNode listNode8 = new ListNode(8);
        listNode1.next = listNode3;
        listNode3.next = listNode5;
//        listNode5.next = listNode7;
//        listNode7.next = listNode2;
//        listNode2.next = listNode4;
//        listNode4.next = listNode6;
//        listNode6.next = listNode8;
        System.out.println(new FindKthToTail().findKthToTail2(listNode1,3).val);
    }
}


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}