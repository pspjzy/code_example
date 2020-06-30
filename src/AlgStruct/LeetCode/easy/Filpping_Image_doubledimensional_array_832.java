/*
 * Copyright (c) 2020. By Zhiyu Jin
 */

package AlgStruct.LeetCode.easy;

public class Filpping_Image_doubledimensional_array_832 {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int row = 0; row < A.length; row++) {
            int low = 0;
            int high = A[row].length;
            while (low<high){
                if (A[row][low]== A[row][high]&&A[row][low]==1){
                    A[row][low]=0;
                    A[row][high]=0;
                    low++;
                    high++;
                    continue;
                } else if (A[row][low]== A[row][high]&&A[row][low]==0){
                    A[row][low]=1;
                    A[row][high]=1;
                    low++;
                    high++;
                    continue;
                }
                int temp = A[row][low];
                A[row][low]= A[row][high];
                A[row][high]= temp;
                A[row][low]=A[row][low]==0?1:0;
                A[row][high]=A[row][high]==0?1:0;
                low++;
                high++;
            }
        }
        return A;
    }
}
