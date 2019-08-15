package for_loop.Sum_Odd;

public class SumOddRange {
    public static boolean isOdd(int numbers){
        if(numbers>0&& numbers%2!=0){
            return true;
        }else {
            return false;
        }
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if (end<start || start <0){
            return -1;
        }
        for (int i = start; i <=end ; i++) {
            if(isOdd(i)){
                sum +=i;
            }
        }
        return sum;
    }

}
