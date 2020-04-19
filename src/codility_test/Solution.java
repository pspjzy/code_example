package codility_test;

import java.util.Arrays;

class Solution {

    public int solution(int[] A) {
        Arrays.sort(A);
        int i = 0;
        int j = 0;
        if (A[A.length - 1] <= 0) {
            //System.out.println(1);
            return 1;
        } else {
            for (i = 0; i < A.length - 1; i++){
                for (j = 0; j <= Integer.MAX_VALUE && j <=A[i]; j++) {
                    if(A[i]!= j) {

                        break;
                    }
                }
                break;
            }
            return j;
//            for (i = 0; i < A.length - 1; i++) {
//                if (!(A[i] == A[i + 1] || A[i] + 1 == A[i + 1])) {
//                    break;
//                }
//            }
//            int datnum = A[i] + 1;
//            //System.out.println(datnum);
//            return datnum;
        }
    }
}
