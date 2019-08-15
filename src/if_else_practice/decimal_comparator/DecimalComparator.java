package if_else_practice.decimal_comparator;

import java.text.DecimalFormat;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1765,-3.176));
    }

    public static boolean areEqualByThreeDecimalPlaces(double a , double b) {return ((int)(a*1000)==(int)(b*1000));}
    public static boolean areEqualByThreeDecimalPlaces四舍五入(double n1, double n2){
        DecimalFormat df = new DecimalFormat("#.000");
        String s1 = df.format(n1);
        String s2 = df.format(n2);




//        String s1 = String.format("%.3f",n1);
//        String s2 = String.format("%.3f",n2);
        return s1 == s2;
    }

}
