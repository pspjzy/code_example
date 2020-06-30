package AlgStruct.LeetCode.easy;

public class Column_Number_171 {
    public static int titleToNumber(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); result = result * 26 + (s.charAt(i) - 'A' + 1), i++);
        return result;
    }

    public static void main(String[] args) {
        titleToNumber("AA");
        System.out.println('A'-1);
    }
}
