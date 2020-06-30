package AlgStruct.LeetCode.easy;

public class Sum_without_operator_371 {
    public int getSum(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;

        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }

        return a;
    }

    public static void main(String[] args) {
        Sum_without_operator_371 s = new Sum_without_operator_371();
        s.getSum(1,2);
        System.out.println(Math.pow(19%10,2));
        System.out.println(198%10);
    }
}
