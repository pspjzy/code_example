package AlgStruct.LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class majority_element_169 {
    public int majorityElement1(int[] num) {

        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;

        }
        return major;
    }

    public int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public int majorityElement3(int[] nums){
        int res = 0;
        Map<Integer,Integer> counts = new HashMap<>();
        for (int num:nums) {
            if (!counts.containsKey(num)){
                counts.put(num,1);
            }else {
                counts.put(num,counts.get(num)+1);
            }
            if (counts.get(num)>nums.length/2){
                res=num;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        majority_element_169 t = new majority_element_169();
        int[] test = {1,2,1,3,1,4,1,1};
        t.majorityElement3(test);

    }
}
