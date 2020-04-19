package AlgStruct.Alg.recursion;

import java.util.ArrayList;

public class recursion {

    public static void main(String[] args) {
        recursion r= new recursion();
        //System.out.println(r.factorialRecursion(0));
        //System.out.println(r.factorialIteration(5));
        //System.out.println(r.fibonacciRecursivei(6));
        System.out.println(r.reverseStringR("hello"));
    }


    public static int a;
    public int factorialRecursion(int n){//3=3*2*1

//        while (n<=2){
//            return n;
//        }
//        if(a==0) {
//            a = n * --n;
//        } else {
//            a *=--n;
//        }
//        return factorialRecursion(n);

        if (n==1)
            return 1;
        return n * factorialRecursion(n-1);

    }

    public int factorialIteration(int n){
        for (int i = n; i > 1;) {
            n*=--i;
        }
        return n;
    }


    ArrayList in = new ArrayList();
    public ArrayList<Integer> fibonacciRecursive(int n){//0,1,1,2,3,5,8,13....
     if (n == in.size()){
         return in;
     }
     return null;
    }

    public int fibonacciRecursivei(int n){//0,1,1,2,3,5,8,13....
        if (n < 2){
            return n;
        }
        return fibonacciRecursivei(n-1)+fibonacciRecursivei(n-2);
    }

    public String reverseStringI(String s){
        if(s.isEmpty()){
            return null;
        }
       char a[]= s.toCharArray();
       char temp[] = new char[a.length];
        for (int i = 0,d=a.length-1; i < a.length; i++,d--) {
            temp[i] = a[d];
        }
        String t = new String(temp);
        return t;
    }
    public String reverseStringR(String s){

        return reverseStringR(s.substring(1))+s.charAt(0);


    }

}
