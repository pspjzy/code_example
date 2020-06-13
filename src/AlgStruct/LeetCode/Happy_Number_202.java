package AlgStruct.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Happy_Number_202 {
    public boolean isHappy(int n) {
        Map<Integer,Integer> res = new HashMap<>();
        while (true) {
            int nums = 0;
            while (n != 0) {
                int tail = n % 10;
                nums += (int) Math.pow(tail, 2);
                System.out.println(nums);
                n /= 10;
            }
            n = nums;
            res.put(nums, res.getOrDefault(nums, 0) + 1);
            if (n==1) return true;
            if (res.get(nums)>1) return false;
        }
    }


    public static void main(String[] args) {
        Happy_Number_202 h = new Happy_Number_202();
        System.out.println(h.isHappy(19));
    }
}
