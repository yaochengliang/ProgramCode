/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
package SwordtoOffer;

public class MergeList {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null){
            return list2;
        } else if (list2 == null){
            return list1;
        }

        ListNode merge = null;
        if (list1.val <= list2.val){
            merge = list1;
            merge.next = Merge(list1.next,list2);
        } else {
            merge = list2;
            merge.next = Merge(list1,list2.next);
        }

        return merge;
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

        listNode2.next = listNode4;
        listNode4.next = listNode6;
        listNode6.next = listNode8;

        System.out.println(new MergeList().Merge(listNode1,listNode2).val);
    }
}
