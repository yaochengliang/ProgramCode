/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
package SwordtoOffer;

public class ReverseList {

    public ListNode reverseList(ListNode head) {
        if (head == null){
            return null;
        }

        ListNode newHead = null;
        ListNode pNode = head;
        ListNode pPre = null;

        while (pNode != null){
            ListNode pNext = pNode.next;
            if (pNext == null){
                newHead = pNode;
            }
            pNode.next = pPre;
            pPre = pNode;
            pNode = pNext;
        }

        return newHead;
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
        listNode5.next = listNode7;
        listNode7.next = listNode2;
        listNode2.next = listNode4;
        listNode4.next = listNode6;
        listNode6.next = listNode8;

        System.out.println(new ReverseList().reverseList(listNode1).val);
    }
}
