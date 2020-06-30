package AlgStruct.LeetCode.easy;

import java.util.HashMap;
import java.util.Map;

public class first_unique_char_string_387 {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> count = new HashMap<>();
        int n = s.length();
        // build hash map : character and how often it appears
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        // find the index
        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }


    public static void main(String[] args) {
        String s = "cc";

        System.out.println(s.indexOf("c",2));
    }
}
