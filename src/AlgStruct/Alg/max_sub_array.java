package AlgStruct.Alg;

public class max_sub_array {
    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public int maxSubArray(int[] nums) {
        // -1 is not proper for illegal input
        if (nums == null) return -1;

        int sum = 0, maxSub = Integer.MIN_VALUE;
        for (int num : nums) {
            // drop negtive sum
            sum = Math.max(sum, 0);
            sum += num;
            // update maxSub
            maxSub = Math.max(maxSub, sum);
        }

        return maxSub;
    }

    public int reverse(int x)
    {
        int result = 0;

        while (x != 0)
        {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result)
            { return 0; }
            result = newResult;
            x = x / 10;
        }

        
        return result;
    }

    public static void main(String[] args) {
        max_sub_array m = new max_sub_array();
//        int[] a = {-2,2,-3,4,-1,2,1,-5,3};
//        System.out.println(m.maxSubArray(a));
        System.out.println(m.reverse(321));
    }
}

