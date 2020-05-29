package AlgStruct.dataStruc;

public class llist {
    public static ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) head = head.next;
        ListNode curr = head;
        while (curr != null && curr.next != null)
            if (curr.next.val == val) curr.next = curr.next.next;
            else curr = curr.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        removeElements(head,4);
        System.out.println(head);
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
          ListNode current = this;
          StringBuilder s = new StringBuilder();
          s.append("[");
          while (current!=null){
              if (current.next==null){
                  s.append(current.val);
              }else {
                  s.append(current.val + ",");
              }
                current=current.next;
            }
          s.append("]");
        return s.toString();
    }
}
