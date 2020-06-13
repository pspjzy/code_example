package AlgStruct.LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class house_rob_memo_198 {
    int[] memo;
    public int rob(int[] nums) {
        memo = new int[nums.length+1];
        Arrays.fill(memo,-1);
        return rob(nums,nums.length-1);
    }

    public int rob(int[] nums,int n){
        if(n<0) return 0;
        else if(memo[n]>-1) return memo[n];
        else{
            memo[n]= Math.max(rob(nums, n - 2) + nums[n], rob(nums, n - 1));
            return memo[n];
        }
    }

    public static void main(String[] args) {
        house_rob_memo_198 h = new house_rob_memo_198();
        System.out.println(h.rob(new int[]{1,2,3,4,5}));
        Set s = new HashSet();
    }

}
