package AlgStruct.dataStruc;

import java.util.HashSet;
import java.util.Stack;

public class hashTable {
    public static void main(String[] args) {

//        HashMap h = new HashMap();

//        int[] tt = new int[]{1,2,3,4};
        hashTable h= new hashTable();
//        System.out.println(h.recurring(tt));
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s);

        System.out.println(s.peek());
        h.implQueueUsingStack(s);

    }

    public int recurring(int[]a) {
        HashSet<Integer> m = new HashSet<>();
        for (int n : a) {
            if (m.contains(n))
                return n;
            else
                m.add(n);
        }

        return 0;
    }

    public void implQueueUsingStack(Stack<Integer> s){
        Stack<Integer> s2 = new Stack<>();


        while (!s.isEmpty()){
            s2.push(s.pop());
        }
        System.out.println(s2);
    }
}
