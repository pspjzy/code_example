package AlgStruct.LeetCode.middle;

import java.util.Arrays;

public class product_of_array_expect_self_array {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null) return null;
        int length = nums.length;
        int[] res = new int[length];
        int productAll = 0;
        boolean hasZero = false;
        int count = 0;
        for(int i:nums){
            if(i==0){
                hasZero=true;
                count++;
                continue;
            }else if (productAll==0){
                productAll = i;
            }
            productAll*=i;
        }
        if (count==length){
            Arrays.fill(res,0);
            return res;
        }
        if(hasZero){
            for(int o = 0;o<res.length;o++){
                if(nums[o]==0){
                    res[o]=productAll;
                }else{
                    res[o]=0;
                }
            }
        }else{
            for(int o = 0;o<res.length;o++){
                res[o]=productAll/nums[o];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        product_of_array_expect_self_array p = new product_of_array_expect_self_array();
        for(int i:p.productExceptSelf(new int[]{2,0,9})){
            System.out.println(i);
        }
    }
}
