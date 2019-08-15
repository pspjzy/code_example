package Leetcode;

import org.jetbrains.annotations.NotNull;

public class reverse_string {

    public static void main(String[] args) {
        char [] a = {'h','e','l','l','o'};
        System.out.println(a[0]);
        printReverse(a);
    }

    private static void printReverse(@NotNull char [] str) {
        System.out.println(str[0]);
        helper(0, str);
    }

    private static void helper(int index, char [] str) {
        if (str == null || index >= str.length) {
            return;
        }
        helper(index + 1, str);
        System.out.print(str[index]);
    }


}
