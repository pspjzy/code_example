package AlgStruct.LeetCode.middle;

import AlgStruct.dataStruc.ListNode;

public class Oddeven_LinkedList_328 {
    public ListNode oddEvenList(ListNode head) {
        if (head==null) return null;
        ListNode odd = head;
        ListNode evenHead = head.next;
        ListNode even = evenHead;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;


        return head;
    }
}