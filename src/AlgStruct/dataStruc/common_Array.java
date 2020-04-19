package AlgStruct.dataStruc;

public class common_Array {
    public static void main(String[] args) {
        char a[] =new char[]{'a','b','c','x'};
        char b[] =new char[]{'z','y','u','x'};
        int c[] = new int[]{1,2,3,4,5};
        int d[] = new int[]{2,3,4,5,6};
        String s = "asdfghjkl";
        common_Array ca = new common_Array();
//        System.out.println(ca.reverse(s));
        for (int t:ca.mergeSortArrays(c,d))
        System.out.println(t);





    }



    public boolean checkCommon(char []a, char []b){
        boolean ck = false;
        if(a.length == 0 || b.length == 0){
            ck = false;
        }
       else if (a.length > 26 || b.length > 26){
           ck = true;
        }
       for(char c: a){
           for (char d:b){
               if(c==d){
                   ck = true;
                   break;
               }
           }
       }


        return ck;
    }

    public String reverse(String s){
        char[] r = s.toCharArray();
        char[] temp = new char[s.length()];
        for (int i = 0,o = s.length()-1; i < s.length(); i++,o--) {
            temp[i] = r[o];
        }
       String st = new String(temp);
        return st;
    }

    public int[] mergeSortArrays(int[] a1, int[] a2){

//        a1+a2;
        int[] merge = new int[a1.length+a2.length];
        for (int i = 0; i < a1.length; i++) {
            merge[i] = a1[i];
        }
        for (int i = 0,o = a1.length; i < a2.length; i++,o++) {
            merge[o] = a2[i];
        }

//         Arrays.sort(merge);
        return merge;
    }
}
