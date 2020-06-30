package AlgStruct.dataStruc;

public class ListNode {
    public int val;
      public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

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
