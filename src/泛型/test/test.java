package 泛型.test;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add("Ni");
        arrayList.add(6);
        print(arrayList);

    }
    public static void print(ArrayList a){
        for (Object i:a){
            System.out.println(i);
        }
    }

}
