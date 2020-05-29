package AlgStruct.LeetCode;

import org.jetbrains.annotations.NotNull;

public class move_zeros_283 {
    public static void moveZeroes(int @NotNull [] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] i = {5,0,0,0,5};
        moveZeroes(i);
    }

}
