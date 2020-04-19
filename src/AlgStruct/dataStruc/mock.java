package AlgStruct.dataStruc;

import java.util.*;

public class mock {
    public static void main(String[] args) {
        System.out.println(1%3);
        int p = 3;

    }

    public ArrayList<Integer> findCommon(int[]a, int[]b){
        if(a==null||b==null){
            return null;
        }
        HashMap<Integer,Integer> h = new HashMap();
        ArrayList<Integer> as = new ArrayList();
        for (int o:b){
            h.put(o,0);
        }
        for (int i =0;  i < a.length; i++) {
            if(h.containsKey(a[i]))
                as.add(a[i]);

        }
        return as;
    }

    public String defangIPaddr(String address) {
        String result;
        if (address.isEmpty()||!address.contains(".")){
            return null;

        }
        result=address.replace(".","[.]");
        return result;
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] copy = nums.clone();

        Arrays.sort(copy);

        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(copy[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            copy[i] = map.get(nums[i]);
        }

        return copy;
    }
}
