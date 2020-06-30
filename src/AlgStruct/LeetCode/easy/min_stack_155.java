package AlgStruct.LeetCode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class min_stack_155 {
   private List<Integer> stack;
    public min_stack_155() {
       stack  = new ArrayList<>();
    }

    public void push(int x) {
        stack.add(x);
    }

    public void pop() {
        stack.remove(stack.size()-1);
    }

    public int top() {
        return stack.get(stack.size()-1);
    }

    public void print(){
        stack.forEach(i -> System.out.println(i));
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i:stack){
            min = Integer.min(i,min);
        }
        return min;
    }

    public static void main(String[] args) {
        min_stack_155 m = new min_stack_155();
        m.push(1);
        m.push(2);
        m.push(3);
        m.print();
    }
}
